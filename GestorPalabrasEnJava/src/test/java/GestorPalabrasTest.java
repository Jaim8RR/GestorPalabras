
import com.mycompany.Exceptions.NumberException;
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

    GestorPalabras manager = new GestorPalabras();

    @Test
    public void testIsPalindromeSimpleWords() throws NumberException{
        assertTrue(manager.isPalindrome("aa"));//par
        assertTrue(manager.isPalindrome("oso"));//impar
        assertTrue(manager.isPalindrome("radar"));
        assertFalse(manager.isPalindrome("palindromont"));
    }

    @Test
    public void testIsPalindromeCapitalLetters() throws NumberException{
        assertTrue(manager.isPalindrome("ANa"));
        assertTrue(manager.isPalindrome("OsSo"));
        assertTrue(manager.isPalindrome("RADAR"));
        assertFalse(manager.isPalindrome("PALINDROMONT"));
    }

    @Test
    public void testIsPalindromeWhiteSpaces() throws NumberException{
        assertTrue(manager.isPalindrome("Anita lava la tina"));
        assertTrue(manager.isPalindrome("Esperabas un test pero era yo, Dio!!oiD ,oy are orep tset nu sabarepsE"));
        assertFalse(manager.isPalindrome("Esto no es un palindromo"));
    }

    @Test
    public void testIsPalindromeSpecialCases() throws NumberException{
        assertTrue(manager.isPalindrome("ááa"));
        assertTrue(manager.isPalindrome("allí, ves sevilla"));
        assertTrue(manager.isPalindrome("<!ÑoÑoÑ!>"));
        assertFalse(manager.isPalindrome("palíndromo!"));

    }

    @Test(expected = NumberException.class)
    public void testIsPalindromeNumbers() throws NumberException{
        assertTrue(manager.isPalindrome("12321"));
        assertTrue(manager.isPalindrome("2.2"));
        assertTrue(manager.isPalindrome("5432112345"));
        assertFalse(manager.isPalindrome("78956"));

    }

    @Test(expected = NumberException.class)
    public void testIsPalindromeMixt() throws NumberException{
        assertTrue(manager.isPalindrome("444E444"));
        assertTrue(manager.isPalindrome("Póndnop"));
        assertTrue(manager.isPalindrome("*hola aloh*"));
        assertFalse(manager.isPalindrome("asjkd5-@6d<"));

    }

    @Test
    public void testRevertWordsSimplesWords() {
        assertEquals("aloh", manager.invertWord("hola"));
        assertEquals("asem", manager.invertWord("mesa"));
        assertEquals("asac", manager.invertWord("casa"));
    }

    @Test
    public void testRevertCapWords() {
        assertEquals("ALOH", manager.invertWord("HOLA"));
        assertEquals("ASEM", manager.invertWord("MESA"));
        assertEquals("ASAC", manager.invertWord("CASA"));
    }

    @Test
    public void testRevertWordNumbers() {
        assertEquals("54321", manager.invertWord("12345"));
        assertEquals("0123456789", manager.invertWord("9876543210"));
    }

    @Test
    public void testCounterVowelsSimpleWords() {
        assertEquals(3, manager.countVowels("hablame"));
        assertEquals(4, manager.countVowels("olvidamos"));
        assertEquals(4, manager.countVowels("palindromo"));
        assertNotEquals(1, manager.countVowels("hola"));
    }

    @Test
    public void testCounterVowelsWithSpaces() {
        assertEquals(5, manager.countVowels("pepe con un pan"));
        assertEquals(9, manager.countVowels("bienvenido caballero"));
        assertEquals(4, manager.countVowels("pompon blanco"));
        assertNotEquals(5, manager.countVowels("El carmin son bichos muertos"));
    }

    @Test
    public void testCountVowelsWithCaps() {
        assertEquals(3, manager.countVowels("hAblAmE"));
        assertEquals(4, manager.countVowels("OlvidAmoS"));
        assertEquals(4, manager.countVowels("palIndromO"));
        assertNotEquals(1, manager.countVowels("hOLa"));
    }

    @Test
    public void testCountVowelsMixt() {
        assertEquals(2, manager.countVowels("bb/*á a/*"));
        assertEquals(1, manager.countVowels("!<!ds a4342"));
        assertEquals(1, manager.countVowels("23# @|dáw13dw3·"));
        assertNotEquals(5, manager.countVowels("2817rgy82bf 518--*-650"));
    }

    @Test
    public void testCountVowelsAccented() {
        assertEquals(2, manager.countVowels("allí"));
        assertEquals(2, manager.countVowels("Árbol"));
        assertEquals(3, manager.countVowels("Más allá"));
        assertNotEquals(6, manager.countVowels("América Latina"));
    }

    @Test
    public void testCountVowelsUmlaut() {
        assertEquals(4, manager.countVowels("pingüino"));
        assertEquals(5, manager.countVowels("Lingüística"));
        assertEquals(4, manager.countVowels("Agüero"));
        assertNotEquals(4, manager.countVowels("Ambigüedad"));
    }

    @Test
    public void testCountVowelsWithoutVowels() {
        assertEquals(0, manager.countVowels("ddd"));
        assertEquals(0, manager.countVowels("nNm"));
        assertEquals(0, manager.countVowels("lmn"));
        assertNotEquals(1, manager.countVowels("xdf"));
    }

    @Test
    public void testCounterVowelsUppercaseWithAccentuation() {
        assertEquals(1, manager.countVowels("Ádd"));
        assertEquals(5, manager.countVowels("ÁÉÍÓÚ"));
        assertEquals(3, manager.countVowels("ÁÉÍ"));
        assertNotEquals(1, manager.countVowels("Xdd"));

    }
}
