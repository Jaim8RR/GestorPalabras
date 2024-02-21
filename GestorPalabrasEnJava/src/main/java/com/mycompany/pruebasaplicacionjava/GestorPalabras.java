/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasaplicacionjava;

import java.text.Normalizer;

/**
 *
 * @author Jaime
 */
public class GestorPalabras {

    public boolean isPalindrome(String str) {
        String normalizedStr = Normalizer.normalize(str, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");                                  //replaces white spaces with"" (i have no idea how it works but it does)
        String cleanedStr = normalizedStr.replaceAll("[^\\p{L}\\p{N}]", "");//replaces áüî etc
        String lowerCaseStr = cleanedStr.toLowerCase();
        for (int i = 0; i < lowerCaseStr.length() / 2; i++) {
            if (lowerCaseStr.charAt(i) != lowerCaseStr.charAt(lowerCaseStr.length() - i - 1)) {
                return false;
            }
        }
        return (str.length() >= 1);
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
        return "aeiouáéíóúü".indexOf(c) != -1;
    }

    public String invertWord(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}
