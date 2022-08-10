package com.jms.receiver.service.mapper;

import com.jms.model.Product;
import com.jms.receiver.service.model.ProductReceiver;

public interface ProductMapper {
    ProductReceiver mapProduct(Product product);
}
