package methods;

import com.sun.tools.javac.Main;

public class contoh {
    String name;
    contoh (String nama){
        this.name = nama;

        System.out.println("hello ini dieksekusi dari constructor"+ nama);
    }
   static void example (String nama, Integer umur) {
        System.out.println("Nama saya : " + nama);
        System.out.println("umur saya : " + umur);
    }
    static int greeting (int a, int b){
       return a * b ;
    }
    public static void main(String[] args) {
//       example("Dea", 20);
//        example("sunara", 24);
//
//        int hasil = greeting(10, 10);
//        System.out.println(hasil);
//
//        System.out.println("hello " + Math.sqrt(19));
//
        contoh play = new contoh("hallo");
        System.out.println("dea " + play.name);
    }
}