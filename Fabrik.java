import java.util.ArrayList;

/**
 * Die Klasse Fabrik verwaltet Bestellungen. Sie kann Bestellungen
 * aufnehmen und Informationen zu Bestellungen ausgeben. 
 *
 * @author Gruppe 1
 * @version 1.3
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
     * Falls die Bestellung zulässig ist, wird sie aufgenommen und User 
     * werden dementsprechend informiert.
     * Negative Zahlen und eine Bestellung mit 0 Stühlen und Sofas 
     * sind nicht zulässig. Falls ein User eine unzulässige Bestellung
     * aufgeben will, wird informiert, dass dies nicht geht.
     * Die Methode gibt keinen Wert zurück.
     * Die Bestellnummer wird mit jeder neuen Bestellung erhöht,
     * sodass keine Bestellung die gleiche Nummer hat.
     * @param stuehle Anzahl der bestellten Stühle.
     * @param sofas Anzahl der bestellten Sofas
     */
    
    public void bestellungAufgeben(int stuehle, int sofas) {
        if(stuehle < 0 || sofas < 0){ 
            System.out.println("Negative Anzahl von Stühlen oder Sofas ist unzulässig. Auftrag nicht eingereicht.");
        } else if (stuehle == 0 && sofas == 0){  
            System.out.println("Auftrag für 0 Stühle und 0 Sofas kann nicht bearbeitet werden.");
        } else {
            bestellungen.add(new Bestellung(bestellungsNr, stuehle, sofas));
            bestellungsNr++;
            System.out.println("Auftrag erhalten! Anzahl Stühle: " + stuehle + ", Anzahl Sofas: " + sofas +".");
        }

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
