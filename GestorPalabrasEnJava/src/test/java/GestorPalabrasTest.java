
import com.mycompany.pruebasaplicacionjava.GestorPalabras;
import org.junit.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaime
 */
public class GestorPalabrasTest {
    @Test
    public void esPalindromoTest() {
        GestorPalabras tildes = new GestorPalabras();
        Assert.assertTrue(tildes.esPalindromo("allí, ves sevilla"));
    }
}
