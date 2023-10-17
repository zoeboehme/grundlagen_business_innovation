import java.util.ArrayList;

/**
 * Die Klasse Fabrik verwaltet Bestellungen. Sie kann Bestellungen
 * aufnehmen und Informationen zu Bestellungen ausgeben. 
 *
 * @author Gruppe 1
 * @version 1.2
 */
public class Fabrik
{
    // ArrayList, in der alle Bestellungen gespeichert werden können 
    private ArrayList<Bestellung> bestellungen;
    // Methode für die Bestellnummer 
    private int bestellungsNr;


    /**
     * Konstruktor für die Fabrik Klasse. 
     * Initialisiert die Liste mit Bestellungen und die Bestellnummer.
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
     * Methode mit der eine neue Bestellung aufgegeben werden kann.
     * Die Bestellnummer wird mit jeder neuen Bestellung erhöht,
     * sodass keine Bestellung die gleiche Nummer hat
     * @param stuehle Anzahl der bestellten Stühle.
     * @param sofas Anzahl der bestellten Sofas
     */
    
    public void bestellungAufgeben(int stuehle, int sofas)
    {
    
        bestellungen.add(new Bestellung(bestellungsNr, stuehle, sofas));
        // Wert der Bestellnummer wird erhöht
        bestellungsNr++;
    }
    
    /**
     * Bestellungen können auf Basis der Bestellnummer gesucht werden
     * und die Methode gibt dann Informationen dazu aus.
     *
     * @param bestellnummer Bestellnummer der gesuchten Bestellung
     */
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
                System.out.println("Bestellbestätigung: " + bestellungsdetails.gibBestellBestaetigung());
                gefunden = true;
                break; // Wir haben die Bestellung gefunden, daher beenden wir den Loop
            }
        }
        // Falls wir am Ende des Loops keine entsprechende Bestellung gefunden haben informieren wir den User darüber
        if (!gefunden) {
            System.out.println("Keine passende Bestellung gefunden");
        }
    }
    
    /** Main Methode ermöglicht den Einstieg in das Programm und somit
    * die Interaktion mit dem User. 
    */
    public static void main(String[] args) {
          
    }
    
 
}
