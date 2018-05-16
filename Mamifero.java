
/**
 * Clase abstracta que define objetos Mamifero.
 * 
 * @author Garcol
 * @version 16.05.18
 */
public abstract class Mamifero extends Animal implements Vacunable
{
    protected int calidad;
    /**
     * Constructor para objetos de la clase Mamifero
     * @param peso Peso inicial del mamifero.
     * @param sonidoCaracteristico Sonido caracteristico del mamifero.
     */
    public Mamifero(int peso, String sonidoCaracteristico, int calidad)
    {
        super(peso, sonidoCaracteristico);
        this.calidad = calidad;
    }

    /**
     * Metodo que reduce los puntos de vida de los animales en 10 puntos y aumenta su peso en 2.
     */
    public void comer()
    {       
            super.comer();
            peso = peso + 2;
            if (calidad >5)
            {
             int actuales = super.getPuntosDeVida();
             actuales = actuales - (10 - calidad);
             super.setPuntosVida(actuales);
            }
    }
}
