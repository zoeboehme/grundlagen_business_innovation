
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
    //Die privaten Variablen werden definiert
    //für die bestellbestätigung wit eine Variable des typs boolean erstellt, welches überprüft, ob eine Bestellung gemacht wurde
    private boolean bestellbestaetigung;
    //für die beschaffungszeit wird eine Integer Variable erstellt, welcher die Lieferdauer misst
    private int beschaffungszeit;
    //für die bestellnummer wird eine Integer Variable, welcher einer getätigten Bestellung eine Nummer zuweist
    private int bestellnummer;
    //die Integer Variable anzahlStuehle misst, wie viele Stühle bestellt wurden
    private int anzahlStuehle;
    //die Integer Variable anzahlSofas misst, wie viele Sofas bestellt wurden
    private int anzahlSofas;
    // Die ArrayList<Produkt> beinhaltet alle Produkte, die bestellt wurden
    private ArrayList<Produkt> bestellteProdukte;
    }

    /**
     *Der Konstruktor wird erstellt.
     * 
     * Folgende Variablen werden initialisiert:
     * @param bestellnummer für die Nummer, welcher einer Bestellung zugewiesen wird
     * @param anzahlStuehle für die Bestellte Anzahl von Stühlen
     * @param anzahlSofas für die Bestellte Anzahl von Sofas
     */
    public int Bestellung(int bestellnummer, int anzahlStuehle, int anzahlSofas)
    {
      int i;
      //initialisierung der oben genannten Variablen
      this.bestellungsNr = bestellungsNr;
      this.anzahlStuehle = anzahlStuehle;
      this.anzahlSofas = anzahlSofas;

      //Liste für alle künftigen Bestellungen wird erstellt
      bestellteProdukte = new ArrayList();
      //wenn noch keine Bestellung getätigt wurde, beginnt die boolean Variable bei "false"
      bestellBestaetigung = false;
      //die Beschaffungszeit beginnt bei 0, wenn noch keine Bestellungen geetätigt wurden
      beschaffungsZeit = 0;    

      //es weden Variablen initialisiert, mit welchen Stühle und Sofas der Bestellungsliste hinzugefügt werden können
      for(i=0;i<=anzahlStuehle;i++)
      {
         stuhlHinzufuegen();
      }
      for(i=0;i<=anzahlSofas;i++)
      {
         sofaHinzufuegen();
      }   
    }
    //es werden Methoden erstellt, um neue Bestellunge  für Stühle und Sofas aufzugeben - genauer wird der Liste der Bestellungen ein neuer Stuhl resp. ein neues Sofa hinzugefügt 
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

    //es wird eine Methode erstellt, damit man eine Bestellung machen kann
    public void bestellungBestaetigen()
    {
     bestellBestaetigung = true;
    } 

    //es wird eine Methode erstellt, um die Bestellbestätigung aufzurufen
    public boolean gibBestellBestaetigung()
    {
     return bestellBestaetigung;
    }  

    //es wird eine Methode erstellt, um die Beschaffungszeit der Bestellung zu definieren
    public void setzteBeschaffungsZeit(int beschaffungszeit)
    {
     this.beschaffungsZeit = beschaffungsZeit;
    }  

    //es wiid eine Methode erstellt, um die Beschaffungszeit der Bestellung anzuzeigen
    public int gibBeschaffungsZeit()
    {
     return beschaffungsZeit;
    }  

    //es wird eine Methode erstellt, um die Bestellungsnummer anzuzeigen
    public int gibBestellungsNr()
    {
        return bestellungsNr;
    }

    //es wird eine Methode erstellt, um die bestellte Zahl der Stühle anzuzeigen
    public int gibAnzahlStuehle()
    {
    return anzahlStuehle;
    }    

    //es wird eine Methode erstellt, um die bestellte Zahl der Sofas anzuzeigen
    public int gibAnzahlSofas()
    {
     return anzahlSofas;
    }   

}
