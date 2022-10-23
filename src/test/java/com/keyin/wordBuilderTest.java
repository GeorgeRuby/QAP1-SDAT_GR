package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class wordBuilderTest {
    @Test
    public void encryptWordTestTrue() {
        wordBuilder myWordBuilder = new wordBuilder();

        String encryptedWord = myWordBuilder.encryptWord("George", "Ruby");

        System.out.println("Result: " + encryptedWord);

        Assertions.assertTrue(encryptedWord.contains("%100"));


    }

    @Test
    public void encryptWordNotNullTest() {
        wordBuilder myWordBuilder = new wordBuilder();

        String encryptedWord = myWordBuilder.encryptWord("George", "Ruby");

        System.out.println("Result: " + encryptedWord);

        Assertions.assertNotNull(encryptedWord);

    }


    @Test
    public void encryptWordTestFalse() {
        wordBuilder myWordBuilder = new wordBuilder();

        String encryptedWord = myWordBuilder.encryptWord("George", "Ruby");

        System.out.println("Result: " + encryptedWord);

        Assertions.assertFalse(encryptedWord.contains("%900"));

    }


}