import java.util.ArrayList;

/**
 * Write a description of class Fabrik here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void bestellungAufgeben(int stuehle, int sofas)
    {
        // Methode mit der eine neue Bestellung aufgegeben werden kann
        bestellungen.add(new Bestellung(bestellungsNr, stuehle, sofas));
        bestellungsNr++;
    }
    
    
    public void bestellungAusgeben(int bestellnummer) {
        boolean gefunden = false;
        // Methode die auf Basis einer Bestellnummer alle Bestellungen
        // durchlaufen kann und die richtigen Bestelldetails zurückgibt
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
        Fabrik fabrik = new Fabrik();
        // Beispielbestellung 1
        fabrik.bestellungAufgeben(5, 3); 
        // Beispielbestellung 2
        fabrik.bestellungAufgeben(2, 4); 
        int bestellnummer = 0; // Ändere die Bestellnummer entsprechend
        fabrik.bestellungAusgeben(bestellnummer);
    }
    
 
}
