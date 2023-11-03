package com.example.test;

public class NimValidator {
    // Deklarasi metode statis 'isTrue' untuk memvalidasi email
    public static boolean isTrue(String nim) {
        // Definisi ekspresi reguler untuk memeriksa format email
       String formatNIM = "^[A-Za-z0-9+_.-]+[*]";
        // Memeriksa apakah 'email' cocok dengan ekspresi reguler
        // Jika cocok, maka email dianggap valid dan metode mengembalikan 'true'

        return nim.matches(formatNIM);
    }
}
