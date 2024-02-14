
import com.mycompany.pruebasaplicacionjava.GestorPalabras;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaime
 */
public class GestorPalabrasTest {

    GestorPalabras gestor = new GestorPalabras();

    @Test
    public void testEsPalindromoPalabrasSimples() {

        assertTrue(gestor.esPalindromo("aa"));//par
        assertTrue(gestor.esPalindromo("oso"));//impar
        assertTrue(gestor.esPalindromo("radar"));
        assertFalse(gestor.esPalindromo("palindromont"));
    }

    @Test
    public void testEsPalindromoMayusculas() {
        assertTrue(gestor.esPalindromo("ANa"));
        assertTrue(gestor.esPalindromo("OsSo"));
        assertTrue(gestor.esPalindromo("RADAR"));
        assertFalse(gestor.esPalindromo("PALINDROMONT"));
    }

    @Test
    public void testEsPalindromoConEspacios() {
        assertTrue(gestor.esPalindromo("Anita lava la tina"));
        assertTrue(gestor.esPalindromo("Esperabas un test pero era yo, Dio!!oiD ,oy are orep tset nu sabarepsE"));
        assertFalse(gestor.esPalindromo("Esto no es un palindromo"));
    }

    @Test
    public void testEsPalindromoConPuntuación() {
        assertTrue(gestor.esPalindromo("ááa"));
        assertTrue(gestor.esPalindromo("allí, ves sevilla"));
        assertTrue(gestor.esPalindromo("<!ÑoÑoÑ!>"));
        assertFalse(gestor.esPalindromo("palíndromo!"));

    }

    @Test
    public void testEsPalindromoNumeros() {
        assertTrue(gestor.esPalindromo("12321"));
        assertTrue(gestor.esPalindromo("2.2"));
        assertTrue(gestor.esPalindromo("5432112345"));
        assertFalse(gestor.esPalindromo("78956"));

    }

    @Test
    public void testEsPalindromoMezcla() {
        assertTrue(gestor.esPalindromo("444E444"));
        assertTrue(gestor.esPalindromo("Póndnop"));
        assertTrue(gestor.esPalindromo("*hola aloh*"));
        assertFalse(gestor.esPalindromo("asjkd5-@6d<"));

    }

}
