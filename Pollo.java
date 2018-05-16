
/**
 * Clase que define objetos Pollo.
 * 
 * @author Garcol
 * @version 16.05.18
 */
public class Pollo extends Ave implements Vacunable
{

    private static int PESO_INICIAL_POLLO = 1;
    private static String SONIDO_CARACTERISTICO_POLLO = "Pio, pio";

    /**
     * Constructor para objetos de la clase Pollo
     */
    public Pollo(boolean modificado)
    {
        super(PESO_INICIAL_POLLO, SONIDO_CARACTERISTICO_POLLO , modificado);
    }

    /**
     * Metodo que aumenta los puntos de vida del animal en 10.
     */
    public void vacunar()
    { 
        puntosDeVida = puntosDeVida + 10;
    }
}
