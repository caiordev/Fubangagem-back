package br.com.caio.ecommerce.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.caio.ecommerce.api.CategoryDTO;
import br.com.caio.ecommerce.entidades.Category;
import br.com.caio.ecommerce.repository.CategoryRepository;
import br.com.caio.ecommerce.service.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
  
  @Autowired
  private CategoryRepository repository;

  public Category findById(Integer id){
    Optional<Category> obj = repository.findById(id);
    return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: "+ id + ". Tipo: "+Category.class.getName()));
  }

  public List<Category> findAll(){
    return repository.findAll();
  }

  public Category create(Category obj){
    obj.setId(null);
    return repository.save(obj);
  }

  public Category update(Integer id, CategoryDTO objDTO){
    Category obj = findById(id);
    obj.setName(objDTO.getName());
    return repository.save(obj);
  }

  public void delete(Integer id){
    findById(id);
    try{
      repository.deleteById(id);
    }catch(DataIntegrityViolationException e){
      throw new br.com.caio.ecommerce.service.exceptions.DataIntegrityViolationException("Categoria não pode ser deletada. Possui Produtos associados.");
    }
  }
}
