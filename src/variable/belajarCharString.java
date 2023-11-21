package variable;

import java.util.Locale;

public class belajarCharString {
    public static void main(String[] args) {
//        example char
        char varchar = 'A';
        System.out.println(varchar);

        char bilangan = 69;
        System.out.println(bilangan);

//        Example String
        String varString = "hello";
//        System.out.println(varString);

//        Sring interpolation
//        System.out.println(varString + " " + "dea");

//        Sring interpolation menggunakan string format
//        System.out.println(String.format("%s selamat malam", varString));

        String nama ="Dea Sunara";
        System.out.println(nama. toLowerCase(Locale.ROOT));
        System.out.println(nama. toUpperCase(Locale.ROOT));
        System.out.println(nama. concat(" Sukabumi"));
        System.out.println(nama. charAt(9));
        System.out.println(nama. length());

//        use case string


    }
}
