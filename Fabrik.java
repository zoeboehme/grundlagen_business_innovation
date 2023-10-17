import java.util.ArrayList;

/**
 * Alle anderen Klassen sind mit der Klasse Fabrik verbunden und somit ist diese die Hauptklasse. Auch wird durch die
 * Klasse Fabrik der Einstieg ins Programm ermöglicht.
 * @author (Gruppe 1)
 * @version (Version final)
 */
public class Fabrik
{
    // ArrayList, in der alle Bestellungen gespeichert werden können 
    private ArrayList<Bestellung> bestellungen;
    // Methode für die Bestellnummer 
    private int bestellungsNr;


    /**
     * Constructor for objects of class Fabrik
     */
    public Fabrik()
    {
        // Initialisierung der Liste Bestellungen 
        bestellungen = new ArrayList<>();
        // Initialer Wert der Bestellnummer ist 0, mit jeder Bestellung
        // wird die Nummer um 1 erhöht
        bestellungsNr = 0;
    }

    /**
     * Mit Hilfe dieser Methode können Bestellungen aufgegeben werden.
     *
     * @param     stuehle und sofas
     */
    public void bestellungAufgeben(int stuehle, int sofas)
    {
        bestellungen.add(new Bestellung(bestellungsNr, stuehle, sofas));
        bestellungsNr++;
    }
    
    /** 
    *          Methode die auf Basis einer Bestellnummer alle Bestellungen
    *          durchlaufen kann und die richtigen Bestelldetails zurückgibt
    *
    *@param    bestellnummer
    */
    // Frage: bestellungsdetails wird das genau so in der Klasse Bestellungen definiert?
    // ansonsten müssen wir hier die Variabel noch ändern
    public void bestellungAusgeben(int bestellnummer) {
        boolean gefunden = false;
        for(Bestellung bestellungsdetails : bestellungen) {
            if (bestellungsdetails.getBestellungsNr() == bestellnummer) {
                System.out.println("Bestellnummer: " + bestellungsdetails.gibBestellungsNr());
                System.out.println("Anzahl Stühle: " + bestellungsdetails.gibAnzahlStuehle());
                System.out.println("Anzahl Sofas: " + bestellungsdetails.gibAnzahlSofas());
                System.out.println("Beschaffungszeit: " + bestellungsdetails.gibBeschaffungsZeit());
                gefunden = true;
                break; // Wir haben die Bestellung gefunden, daher beenden wir die Schleife.
            }}
        
        
        if (!gefunden) {
            System.out.println("Keine passende Bestellung gefunden");
        }}
    }
    
    public static void main(String[] args) {
        System.out.println("Das Produktionsmanagementsystem wird gestartet");
        Fabrik fabrik = new Fabrik();
        // Beispielbestellung 1
        fabrik.bestellungAufgeben(5, 3); 
        // Beispielbestellung 2
        fabrik.bestellungAufgeben(2, 4); 
        int bestellnummer = 0; // Ändere die Bestellnummer entsprechend
        fabrik.bestellungAusgeben(bestellnummer);
    }
    
 
}
