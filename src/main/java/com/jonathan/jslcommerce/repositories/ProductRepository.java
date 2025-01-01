package com.jonathan.jslcommerce.repositories;


import com.jonathan.jslcommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
