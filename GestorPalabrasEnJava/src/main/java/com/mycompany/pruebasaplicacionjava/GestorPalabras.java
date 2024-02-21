/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasaplicacionjava;

/**
 *
 * @author Jaime
 */
public class GestorPalabras {
    public boolean isPalindrome(String word) {
        String formattedWord = word.replaceAll("\\s+", "").toLowerCase();
        
        for (int i = 0; i < formattedWord.length() / 2; i++) {
            if (formattedWord.charAt(i) != formattedWord.charAt(formattedWord.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int countVowels(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
        char character = Character.toLowerCase(
                word.charAt(i));
        if (isVowel(character)) {
            counter++;
        }
    }
        return counter;
    }
    
    private boolean isVowel(char c) {
    return "aeiouáéíóúü".indexOf(c)!= -1;
    }
    
    public String invertWord(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}
