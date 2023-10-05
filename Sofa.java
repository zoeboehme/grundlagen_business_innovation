
/**
 * Write a description of class Sofa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sofa
{
    // Instanzvariablen der Komponenten eines Sofas
    private int holzeinheiten;
    private int schrauben;
    private int kissen;
    private int farbeinheiten;
    private int kartoneinheiten;
    private int produktionsZeit;

    /**
     * Constructor for objects of class Sofa
     */
    public Sofa()
    {
        // Initialisierung der Komponenten eines Sofas
        this.holzeinheiten = holzeinheiten;
        this.schrauben = schrauben;
        this.kissen = kissen;
        this.farbeinheiten = farbeinheiten;
        this.kartoneinheiten = kartoneinheiten;
        this.produktionsZeit = produktionsZeit;
    }
    
    // Anzahl Holzeinheiten ausgeben
    public int gibHolzeinheiten() {
        return this.holzeinheiten;
    }
    
    // Anzahl Schrauben ausgeben
    public int gibSchrauben() {
        return this.schrauben;
    }
    
    
    // Anzahl Kissen ausgeben
    public int gibKissen() {
        return this.kissen;
    }
    
    // Anzahl Farbeinheiten ausgeben
    public int gibKartoneinheiten() {
        return this.kartoneinheiten;
    }
    
    // Anzahl Farbeinheiten ausgeben
    public int gibProduktionsZeit() {
        return this.produktionsZeit;
    }
}
