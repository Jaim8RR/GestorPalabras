
import com.mycompany.pruebasaplicacionjava.GestorPalabras;
import org.junit.*;
import static org.junit.Assert.*;

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
    
     @Test
    public void testInvertirPalabraPalabrasSimples() {
        assertEquals("aloh", gestor.invertirPalabra("hola"));
        assertEquals("asem", gestor.invertirPalabra("mesa"));
        assertEquals("asac", gestor.invertirPalabra("casa"));
    }

    @Test
    public void testInvertirPalabra_Mayusculas() {
        assertEquals("ALOH", gestor.invertirPalabra("HOLA"));
        assertEquals("ASEM", gestor.invertirPalabra("MESA"));
        assertEquals("ASAC", gestor.invertirPalabra("CASA"));
    }

    @Test
    public void testInvertirPalabraNúmeros() {
        assertEquals("54321", gestor.invertirPalabra("12345"));
        assertEquals("0123456789", gestor.invertirPalabra("9876543210"));
    }
    
    @Test
public void testContarVocalesPalabrasSimples() {
    assertEquals(3, gestor.contarVocales("hablame"));
    assertEquals(4, gestor.contarVocales("olvidamos"));
    assertEquals(4, gestor.contarVocales("palindromo"));
    assertNotEquals(1, gestor.contarVocales("hola"));
}

@Test
public void testContarVocalesConEspacios() {
    assertEquals(5, gestor.contarVocales("pepe con un pan"));
    assertEquals(9, gestor.contarVocales("bienvenido caballero"));
    assertEquals(4, gestor.contarVocales("pompon blanco"));
    assertNotEquals(5, gestor.contarVocales("El carmin son bichos muertos"));
}

@Test
public void testContarVocalesConMayusculas() {
    assertEquals(3, gestor.contarVocales("hAblAmE"));
    assertEquals(4, gestor.contarVocales("OlvidAmoS"));
    assertEquals(4, gestor.contarVocales("palIndromO"));
    assertNotEquals(1, gestor.contarVocales("hOLa"));
}

@Test
public void testContarVocalesMezcla() {
    assertEquals(2, gestor.contarVocales("bb/*a a/*"));
    assertEquals(1, gestor.contarVocales("!<!ds a4342"));
    assertEquals(1, gestor.contarVocales("23# @|daw13dw3·"));
    assertNotEquals(5, gestor.contarVocales("2817rgy82bf 518--*-650"));
}

}
