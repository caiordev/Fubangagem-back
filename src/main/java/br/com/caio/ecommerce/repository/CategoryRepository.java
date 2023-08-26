package br.com.caio.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.caio.ecommerce.entidades.Category;

//@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
  
}
