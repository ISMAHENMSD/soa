package entity;




import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Product  implements Serializable  {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Double Code ;
  
  private String Description ;
  
  private Double prix ;
  
  private Float qt ;
  
  
  public Product ( String Description , Double prix , Float qt ) {
    
    super();
    this.Description = Description;
    this.prix = prix ;
    this.qt = qt ;
  }


  public Double getCode() {
    return Code;
  }


  public void setCode(Double code) {
    Code = code;
  }


  public String getDescription() {
    return Description;
  }


  public void setDescription(String description) {
    Description = description;
  }


  public Double getPrix() {
    return prix;
  }


  public void setPrix(Double prix) {
    this.prix = prix;
  }


  public Float getQt() {
    return qt;
  }


  public void setQt(Float qt) {
    this.qt = qt;
  }
  
  
        }