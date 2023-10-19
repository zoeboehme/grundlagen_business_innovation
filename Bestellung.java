
/**
 * Beschreiben Sie hier die Klasse Bestellung:
 * 
 * 
 * @Linda Fuchs 
 * @11.10.23
 */
public class Bestellung
{

    /**
     * Konstruktor für Objekte der Klasse Bestellung
     */
    public class Bestellung(
    {
        private boolean bestellbestaetigung;
        private int beschaffungszeit;
        private int bestellnummer;
        private int anzahlStuehle;
        private int anzahlSofas;
        private ArrayList<Produkt> bestellteProdukte;
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
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
