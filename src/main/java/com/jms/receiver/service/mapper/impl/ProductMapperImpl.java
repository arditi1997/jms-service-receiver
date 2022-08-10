package com.jms.receiver.service.mapper.impl;

import com.jms.model.Product;
import com.jms.receiver.service.mapper.ProductMapper;
import com.jms.receiver.service.model.ProductReceiver;
import org.springframework.stereotype.Service;

@Service
public class ProductMapperImpl implements ProductMapper {
    @Override
    public ProductReceiver mapProduct(Product product) {
            ProductReceiver productReceiver = new ProductReceiver();
            productReceiver.setName(product.getName());
            productReceiver.setJmsType(product.getJmsType());
            productReceiver.setPrice(product.getPrice());
            productReceiver.setType(product.getType());
            productReceiver.setQuantity(product.getQuantity());
        return productReceiver;
    }
}
