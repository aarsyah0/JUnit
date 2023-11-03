package com.example.test;

import static org.junit.Assert.assertTrue; // Mengimpor metode assertTrue dari pustaka JUnit
import org.junit.Test; // Mengimpor anotasi @Test dari pustaka JUnit

public class NimValidatorTest {
    @Test // Anotasi @Test menandai metode ini sebagai metode tes JUnit
    public void NimValidator_CorrectNimSimple_ReturnsTrue() {
        // Mendefinisikan email yang valid
        String validNim = "E41220559*";

        // Memanggil metode assertTrue untuk memverifikasi bahwa hasil validasi adalah benar
        assertTrue(NimValidator.isTrue(validNim));
    }
}
