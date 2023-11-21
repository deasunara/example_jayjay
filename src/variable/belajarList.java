package variable;

import java.util.ArrayList;
import java.util.List;

public class belajarList {
    public static void main(String[] args) {
//        list Integer
        List<Integer> listBilangan = new ArrayList<>();
        listBilangan.add(3);
        listBilangan.add(9);
        listBilangan.add(9);


//        List String
        List<String> listString = new ArrayList<>();
        listString.add("kuda");
        listString.add("monyet");
        listString.add("babi");

        System.out.println(listString);

        listString.forEach((bilangan) -> {
            System.out.println("isi dari list bilangan: " + bilangan);
            System.out.println(listBilangan.contains(4));
        });

    }
}
