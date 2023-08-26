package br.com.caio.ecommerce.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

public class Product {
  
  private Integer id;

  private String name;

  private Double value;

  private String description;

  @Lob
  @Column(name="imagem", columnDefinition = "BLOB")
  private byte[] image;

  @ManyToOne
  @JoinColumn(name="category_id")
  private Product product;

  public Product() {
  }

  public Product(Integer id, String name, Double value, String description, byte[] image, Product product) {
    this.id = id;
    this.name = name;
    this.value = value;
    this.description = description;
    this.image = image;
    this.product = product;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  

  
  

}
