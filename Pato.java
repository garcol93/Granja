
/**
 * Clase que define objetos Pato.
 * 
 * @author Garcol
 * @version 16.05.18
 */
public class Pato extends Ave
{    
    private static int PESO_INICIAL_PATO = 2;
    private static String SONIDO_CARACTERISTICO_PATO = "Cua, Cua";
    /**
     * Constructor para objetos de la clase Pato
     */
    public Pato(boolean modificado)
    {
        super(PESO_INICIAL_PATO, SONIDO_CARACTERISTICO_PATO, modificado);
    }
}
