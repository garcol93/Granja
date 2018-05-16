
/**
 * Clase que define objetos Cerdo.
 * 
 * @author Garcol
 * @version 16.05.18
 */
public class Cerdo extends Mamifero
{

    private static int PESO_INICIAL_CERDO = 15;
    private static String SONIDO_CARACTERISTICO_CERDO = "Ñoinq, ñoinq";

    /**
     * Constructor para objetos de la clase Cerdo
     */
    public Cerdo(int calidad)
    {
        super(PESO_INICIAL_CERDO, SONIDO_CARACTERISTICO_CERDO , calidad);
    }

    /**
     * Metodo que aumenta los puntos de vida del animal en 20.
     */
    public void vacunar()
    {
        puntosDeVida = puntosDeVida + 20;
    }
}
