package com.jms.receiver.service.service;

import com.jms.model.Product;
import com.jms.receiver.service.mapper.ProductMapper;
import com.jms.receiver.service.model.ProductReceiver;
import com.jms.receiver.service.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ProductTransactionReceiver {
    private final static Logger log = LoggerFactory.getLogger(ProductTransactionReceiver.class);
    private ProductRepository productRepository;
    private ProductMapper productMapper;
    public ProductTransactionReceiver(ProductRepository productRepository, ProductMapper productMapper){
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }
    private int count = 1;

    @JmsListener(destination = "ProductTransactionQueue", containerFactory = "myFactory")
    public void receiveQueueMesssage(Product product) {
        log.info("Transaction number "+ count + " received. Queue Product: " + product);
        ProductReceiver productReceiver = productMapper.mapProduct(product);
        productRepository.save(productReceiver);
        log.info("Transaction number "+ count + " saved in database");
        count++;
    }
}
