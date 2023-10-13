
/**
 * Beschreiben Sie hier die Klasse Stuhl.
 * 
 * @author (Stefanie) 
 * @version (06.10.2023)
 */
public class Stuhl extends Produkt
{
    // Hier werden globale Variabeln definiert, weil die Einheiten für jedes Sofas die Gleichen sind
    // daher werden sie mit dem private final static definiert, d.h. sie sind privat, eine Klassenvariabel und unveränderlich
    // Klassenvariablen werden ganz am Anfang definiert und nicht im Konstruktor
    // Die Einheiten und auch die Zeit sind am Anfang der Aufgabenstellung erläutert
    private final static int holzeinheiten = 2;
    private final static int schrauben = 10;
    private final static int farbeinheiten = 2;
    private final static int kartoneinheiten = 1;
    private final static int produktionsZeit = 22;

    //Wir haben keine dazugehörigen Konstruktoren der Klasse Stuhl. Die Konstruktoren werden alle von der Superklasse übernommen
    /**
     * Konstruktor für Objekte der Klasse Stuhl, welche von der Superklasse übernommen werden. 
     */
    public Stuhl()
    {
        // Instanzvariable initialisieren
        super ();
        
    }

    // Frage wieso wird hier nicht final static ausgegeben? Weil die Holzeinheiten ändern sich ja nicht
    /**
     * Mit dieser Methode werden die benötigte Anzahl Holzeinheiten für die Produktion retourniert. Die Anzahl Holzeinheiten ist dabei
     * eine Klassenvariabel. 
     * 
     * @return        Anzahl Holzeinheiten
     */
    public static int getHolzeinheiten()
    {
        // tragen Sie hier den Code ein
        return holzeinheiten;
    }
    
       /**
     * Mit dieser Methode werden die benötigte Anzahl Schrauben für die Produktion retourniert. Die Anzahl Schrauben ist dabei
     * eine Klassenvariabel. 
     * 
     * 
     * @return        Anzahl Schrauben
     */
    public static int getSchrauben()
    {
        // tragen Sie hier den Code ein
        return schrauben;
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
     * 
     * @return        Länge Produktionszeit
     */
    public static int getProduktionszeit()
    {
        // tragen Sie hier den Code ein
        return produktionsZeit;
    }
}   
    
    
    
    
    

