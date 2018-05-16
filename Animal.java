
/**
 * Clase abstracta que define objetos Animal.
 * 
 * @author Garcol
 * @version 16.05.18
 */
public abstract class Animal
{

    protected int puntosDeVida;    
    protected int peso;
    private static int PUNTOS_DE_VIDA_INICIALES = 100;
    private String sonidoCaracteristico;

    /**
     * Constructor para objetos de la clase Animal
     * @param peso Peso inicial del animal.
     * @param sonidoCaracteristico Sonido caracteristico del animal.
     */
    public Animal(int peso, String sonidoCaracteristico)
    {
        this.sonidoCaracteristico = sonidoCaracteristico;
        this.peso = peso;
        puntosDeVida = PUNTOS_DE_VIDA_INICIALES;
    }

    /**
     * Metodo que reduce los puntos de vida de los animales en 10 puntos.
     */
    public void comer()
    {
        puntosDeVida = puntosDeVida - 10;
    }

    /**
     * Metodo que muestra por pantalla el sonido caracteristico del animal.
     */
    public void emitirSonidoCaracteristico()
    {
        System.out.println(sonidoCaracteristico);
    }

    /**
     * Metodo que devuelve el peso actual del animal.
     * @return Peso actual del animal.
     */
    public int getPeso()
    {
        return peso;
    }

    /**
     * Metodo que devuelve los puntos de vida actuales del animal.
     * @return Puntos de vida actuales del animal.
     */
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void setPuntosVida(int puntosActuales)
    {
        puntosDeVida = puntosActuales;
    }

}
