import java.util.Random;
/**
 * Clase abstracta que define objetos Ave.
 * 
 * @author Garcol 
 * @version 16.05.18
 */
public abstract class Ave extends Animal
{
    protected boolean modificado;
    /**
     * Constructor para objetos de la clase Ave
     * @param peso Peso inicial del ave.
     * @param sonidoCaracteristico Sonido caracteristico del ave.
     */
    public Ave(int peso, String sonidoCaracteristico, boolean modificado)
    {
        super(peso, sonidoCaracteristico);
        this.modificado = modificado;
    }

    /**
     * Metodo que reduce los puntos de vida de los animales en 10 puntos y aumenta su peso en 1.
     */
    public void comer()
    {
        Random r = new Random();
        int valorDado = r.nextInt(1);
        if (modificado == false || modificado &&  valorDado == 1)
        {
            super.comer();
            peso++;
        }
    }

}
