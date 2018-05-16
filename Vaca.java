
/**
 * Clase que define objetos Vaca.
 * 
 * @author Garcol 
 * @version 16.05.18
 */
public class Vaca extends Mamifero
{

    private static int PESO_INICIAL_VACA = 25;
    private static String SONIDO_CARACTERISTICO_VACA = "Muuuu, muuuu";

    /**
     * Constructor para objetos de la clase Vaca
     */
    public Vaca(int calidad)
    {
        super(PESO_INICIAL_VACA, SONIDO_CARACTERISTICO_VACA, calidad);
    }

    /**
     * Metodo que aumenta los puntos de vida del animal en 30.
     */
    public void vacunar()
    {
        puntosDeVida = puntosDeVida + 30;
    }
}
