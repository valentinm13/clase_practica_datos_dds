package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table (name = "marca")
public class Marca extends Persistente {

    @Column( name = "nombre")
    private String nombre;
}
