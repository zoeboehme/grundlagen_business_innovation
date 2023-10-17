
/**
<<<<<<< HEAD
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
=======
 * Beschreiben Sie hier die Klasse Stuhl.
 * 
 * @author (Stefanie) 
 * @version (06.10.2023)
 */
public class Sofa extends Produkt
{
    // Hier werden globale Variabeln definiert, weil die Einheiten für jeden Stuhl die Gleichen sind
    // daher werden sie mit dem private final static definiert, d.h. sie sind privat, eine Klassenvariabel und unveränderlich
    // Klassenvariablen werden ganz am Anfang definiert und nicht im Konstruktor
    // Die Einheiten und auch die Zeit sind am Anfang der Aufgabenstellung erläutert
    private final static int holzeinheiten = 4;
    private final static int schrauben = 5;
    private final static int kissen = 5;
    private final static int farbeinheiten = 1;
    private final static int kartoneinheiten = 5;
    private final static int produktionsZeit = 60;
    
    //Wir haben keine dazugehörigen Konstruktoren der Klasse Stuhl. Die Konstruktoren werden alle von der Superklasse übernommen

    /**
     * Konstruktor für Objekte der Klasse Sofa, welche von der Superklasse übernommen werden. 
     */
    public Sofa ()
    {
        // Instanzvariable initialisieren
        super ();
        
    }

    /**
     * Die Methode retourniert die Holzeinheiten
     * 
     * 
     * @return        Anzahl Holzeinheiten
     */
    public static int getHolzeinheiten()
    {
        // tragen Sie hier den Code ein
        return holzeinheiten;
    }
    
       /**
     * Mit dieser Methode werden die benötigte Anzahl Holzeinheiten für die Produktion retourniert. Die Anzahl Holzeinheiten ist dabei
     * eine Klassenvariabel.
     * 
     * @return        Anzahl Schrauben
     */
    public static int getSchrauben()
    {
        // tragen Sie hier den Code ein
        return schrauben;
    }
    
       /**
     * Mit dieser Methode werden die benötigte Anzahl Kissen für die Produktion retourniert. Die Anzahl Kissen ist dabei
     * eine Klassenvariabel.
     * 
     * @return        Anzahl Kissen
     */
    public static int getKissen()
    {
        // tragen Sie hier den Code ein
        return kissen;
    }
    
       /**
     * Mit dieser Methode werden die benötigte Farbeinheiten für die Produktion retourniert. Die Anzahl Farbeinheiten ist dabei
     * eine Klassenvariabel. 
     * 
     * @return        Anzahl Farbeinheiten
     */
    public static int getFarbeinheiten()
    {
        // tragen Sie hier den Code ein
        return farbeinheiten;
    }
    
       /**
     * Mit dieser Methode werden die benötigte Kartoneinheiten für die Produktion retourniert. Die Anzahl Kartoneinheiten ist dabei
     * eine Klassenvariabel. 
     * 
     * @return        Anzahl Kartoneinheiten
     */
    public static int getKartoneinheiten()
    {
        // tragen Sie hier den Code ein
        return kartoneinheiten;
    }
    
       /**
     * Mit dieser Methode wird die benötigte Produktionszeit retourniert. Die Produktionszeit ist dabei
     * eine Klassenvariabel. 
     * 
     * @return        Länge Produktionszeit
     */
    public static int getProduktionszeit()
    {
        // tragen Sie hier den Code ein
        return produktionsZeit;
    }
}   
>>>>>>> 571b6a4675f33c8637d66f6cee18b7e5ca0b1884
