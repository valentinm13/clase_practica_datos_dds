package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("productoSimnple")
public class ProductoSimple extends Producto{

  @Column(name = "precio")
  private Double precio;
  @Column(name = "stock")
  private Integer stock;

  public Double precio() {
    return this.precio;
  }

  public Integer stock() {
    return this.stock;
  }

  public ProductoSimple() {

  }

}
