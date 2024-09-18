package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import lombok.Setter;

@MappedSuperclass
@Getter
public class Persistente {
    @Id
    @GeneratedValue
    private Long id;
    @Setter
    @Column(name = "activo")
    private Boolean activo = true;

    @Column(name = "fechaAlta", columnDefinition =  "DATE")
    private LocalDate fechaAlta;

    public Persistente() {
        this.fechaAlta = LocalDate.now();
    }
}