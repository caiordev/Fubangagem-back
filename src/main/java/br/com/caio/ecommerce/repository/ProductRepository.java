package br.com.caio.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.caio.ecommerce.entidades.Product;


//@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
  
}
