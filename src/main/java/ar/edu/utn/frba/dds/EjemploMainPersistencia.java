package ar.edu.utn.frba.dds;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;

public class EjemploMainPersistencia  implements WithSimplePersistenceUnit {
    
    public static void main(String[] args) {

        EjemploMainPersistencia instance = new EjemploMainPersistencia();
        instance.impactarEnBase();

    }
    public void impactarEnBase(){
        withTransaction(()->{

        });
    }
}


