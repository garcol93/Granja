
/**
 * Clase que define objetos granja, permite interactuar con nuestros animales.
 * 
 * @author Garcol
 * @version 16.05.18
 */
public class Granja
{
    /**
     * Constructor para objetos Granja
     */
    public Granja()
    {
        
    }

    /**
     * Metodo que permite alimentar a un animal siempre que sus puntos de vida estén por encima de 0.
     * @param animal Animal que queremos alimentar.
     */
    public void alimentar(Animal animal)
    {
        if(animal.getPuntosDeVida()>0){
            animal.comer();
        }
    }

    /**
     * Metodo que muestra por pantalla el sonido caracteristico del animal indicado por parametro siempre que sus puntos de vida estén por encima de 0.
     * @param animal Animal del cual queremos mostrar por pantalla su sonido caracteristico.
     */
    public void hacerEmitirSonidoCaracteristico(Animal animal)
    {
        if(animal.getPuntosDeVida() > 0){
            animal.emitirSonidoCaracteristico();
        }
    }

    /**
     * Metodo que vacuna a un animal haciendole recuperar vida siempre que sus puntos de vida estén por encima de 0.
     * @param animalVacunable Animal vacunable que queremos vacunar.
     */
    public void vacunar(Vacunable animalVacunable)
    {
        Animal animal = (Animal) animalVacunable;
        if(animal.getPuntosDeVida() > 0){
            animalVacunable.vacunar();
        }
    }
}
