

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


/**
 * Write a description of class FabrikTest here.
 *
 * @Gruppe 01 (Janina Zoë Böhme, Linda Fuchs, Pablo Maria Serafin Dostal, Pascal Bähler, Stefanie Rehm)
 * @version (11.10.2023)
 */

public class FabrikTest
{
    Fabrik testFabrik;
    ArrayList<Bestellung> bestellungen;
    
    /**
     * Konstruktor für die Test-Klasse FabrikTest.
     */
    public FabrikTest()
    {
    }

    /**
     * Setzt das Testgerüst für den Test.
     * Um die Fabrik zu testen, wird vor jedem Test eine neue Fabrik erstellt und eine
     * Bestellung aufgegeben.
     */
    @BeforeEach
    public void setUp()
    {
        // Fabrik wird erstellt für Test-Zwecke
        this.testFabrik = new Fabrik();
        // Eine Bestellung mit 3 Stühlen und 1 Sofa wird aufgegeben
        testFabrik.bestellungAufgeben(3, 1);
        // Eine Bestellung mit 2 Stühlen und 0 Sofa wird aufgegeben
        testFabrik.bestellungAufgeben(2, 0);
        // Die Bestellungen aus der Fabrik werden mit der entsprechenden Methode abgerufen
        this.bestellungen = testFabrik.getBestellungen();
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Dieser Test prüft, ob eine Bestellung erfasst wurde.
     */
    @Test
    public void bestellungErfasstTest()
    {
        for (Bestellung bestellung : bestellungen) {
            assertNotNull(bestellung);
        }
    }

    /**
     * Dieser Test prüft, ob die Anzahl Stühle und Sofas korrekt in der Bestellung sind.
     */
    @Test
    public void produktAnzahlTest()
    {
        // Es wird geprüft, ob die erste Bestellung die richtige Anzahl Stühle (3) enthält.
        assertEquals(3, bestellungen.get(0).getAnzahlStuehle());
        // Es wird geprüft, ob die erste Bestellung die richtige Anzahl Sofas (1) enthält.
        assertEquals(1, bestellungen.get(0).getAnzahlSofas());
        // Es wird geprüft, ob die zweite Bestellung die richtige Anzahl Stühle (2) enthält.
        assertEquals(2, bestellungen.get(1).getAnzahlStuehle());
        // Es wird geprüft, ob die zweite Bestellung die richtige Anzahl Sofas (0) enthält.
        assertEquals(0, bestellungen.get(1).getAnzahlSofas());
    }
    
    /**
     * Dieser Test prüft, ob die Objekte (Bestellung, Produkt) vom richtigen Typ sind.
     */
    @Test
    public void bestellungTypenTest()
    {
        for (Bestellung bestellung : bestellungen) {
            // Test, ob die Bestellung vom Typ Bestellung ist
            assertTrue(bestellung instanceof Bestellung);
            
            // Test, ob die Produkte in der Bestellung vom Typ Produkt sind
            for (Produkt produkt : bestellung.getBestellteProdukte()) {
                assertTrue(produkt instanceof Produkt);
            }
        }
    }
    
    /**
     * Dieser Test prüft, ob fehlerhafte Bestellungen behandelt werden oder nicht.
     */
    @Test
    public void fehlerhafteBestellungTest()
    {
        Fabrik fehlerFabrik = new Fabrik();
        // Fehlerhafte Bestellungen
        fehlerFabrik.bestellungAufgeben(0, 0);
        fehlerFabrik.bestellungAufgeben(-1, 0);
        // Die Bestellungen aus der Fabrik werden mit der entsprechenden Methode abgerufen
        ArrayList<Bestellung> fehlerhafteBestellungen = fehlerFabrik.getBestellungen();
        // Test, ob die Liste eine Länge von 0 hat, also keine neuen Bestellungen hat
        assertEquals(0, fehlerhafteBestellungen.size());
    }
}
