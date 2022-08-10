package com.jms.receiver.service.repository;

import com.jms.receiver.service.model.ProductReceiver;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductReceiver, String> {
}
