
/**
 * Beschreiben Sie hier die Klasse Produkt.
 * 
 * @author (Stefanie Rehm) 
 * @version (06.10.2023)
 */
public class Produkt
{
    //  Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
     
     /** 
      * Der Zustand kann die möglichen Zustände, bestellt (1), in Produktion (2), fertig zum Ausliefern (3) und ausgeliefert (4) haben
      */
    private int zustand;

    /**
     * Konstruktor für Objekte der Klasse Produkt im Falle keiner Eingabe des Zustands.
     */ 
   
    public Produkt()
    {
        zustand = 1;
    }
    
    // Das habe ich noch zusätzlich hinzugefügt, im Falle wenn ein Produkt nicht im System war oder so, könnte 
    // direkt beispielsweise auf Auslieferung gewechselt werden und man muss nicht die Methode Zustand ändern nutzen 
    // wir können es aber auch rauslöschen
    /** 
     * Konstruktor für Objekte der Klasse Produkt im Falle einer Eingabe des Zustands.
     */
    
    public Produkt(int zustand)
    {
        this.zustand = zustand;
    }

    /**
     * Diese Methode ändert den Zustand des Produkts.
     * 
     * 
     * @return       der Zustand des Produkts wird angezeigt
     */
    public void zustandAendern (int zustand)
    {
        this.zustand=zustand;
    }
    
    /**
     * Diese Methode zeigt den aktuellen Zustand an.
     * 
     * 
     * @return       den aktuellen Zustand des Produkts
     */
    public int aktuellerZustand ()
    {
        return zustand;
    }
}
