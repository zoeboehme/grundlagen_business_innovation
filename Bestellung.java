
/**
 * Die Klasse Bestellung beinhaltet alle getätigten Bestellungen
 * 
 * 
 * @author Gruppe 1
 * @Version 29.10.23
 */
 //Die Klasse Bestellung wird erstellt
public class Bestellung
{
    {
    //Die privaten Attribute werden definiert
    //für die bestellbestätigung wit ein boolean Attribut erstellt, welches überprüft, ob eine Bestellung gemacht wurde
    private boolean bestellbestaetigung;
    //für die beschaffungszeit wird ein Integer erstellt, welcher die Lieferdauer misst
    private int beschaffungszeit;
    //für die bestellnummer wird ein Integer erstellt, welcher einer getätigten Bestellung eine Nummer zuweist
    private int bestellnummer;
    //der Integer anzahlStuehle misst, wie viele Stühle bestellt wurden
    private int anzahlStuehle;
    //der Integer anzahlSofas misst, wie viele Sofas bestellt wurden
    private int anzahlSofas;
    // Die ArrayList<Produkt> beinhaltet alle Produkte, die bestellt wurden
    private ArrayList<Produkt> bestellteProdukte;
    }

    /**
     *Der Konstruktor wird erstellt und die Variablen initialisiert.
     * 
     * @param bestellnummer für die Nummer, welcher einer Bestellung zugewiesen wird
     * @param anzahlStuehle für die Bestellte Anzahl von Stühlen
     * @param anzahlSofas für die Bestellte Anzahl von Sofas
     * @return        die Summe aus x und y
     */
    public int Bestellung(int bestellnummer, int anzahlStuehle, int anzahlSofas)
    {
        int i;
        this.anzahlStuehle = anzahlStuehle;
        this.anzahlSofas = anzahlSofas;
        bestellteProdukte = new ArrayList();
        bestellBestaetigung = false;
        beschaffungsZeit = -1;    
        this.bestellungsNr = bestellungsNr;
        
        for(i=0;i<=anzahlStuehle;i++)
        {
            stuhlHinzufuegen();
        }
        
        for(i=0;i<=anzahlSofas;i++)
        {
            sofaHinzufuegen();
        }   
    }

    private void stuhlHinzufuegen()
    {
         Stuhl stuhl = new Stuhl();
         bestellteProdukte.add(stuhl);       
    }  
    
    private void sofaHinzufuegen()
    {
        Sofa sofa = new Sofa();
        bestellteProdukte.add(sofa);         
    }  
    
    public void bestellungBestaetigen()
    {
        bestellBestaetigung = true;
    } 
    
    public boolean gibBestellBestaetigung()
    {
        return bestellBestaetigung;
    }  
    
    public void setzteBeschaffungsZeit(int beschaffungszeit)
    {
        this.beschaffungsZeit = beschaffungsZeit;
    }  
    
    public int gibBeschaffungsZeit()
    {
        return beschaffungsZeit;
    }  
    
    public int gibBestellungsNr()
    {
        return bestellungsNr;
    }
    
    public int gibAnzahlStuehle()
    {
        return anzahlStuehle;
    }    
    
    public int gibAnzahlSofas()
    {
        return anzahlSofas;
    }   

}
