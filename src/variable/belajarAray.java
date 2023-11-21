package variable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class belajarAray {
    public static void main(String[] args) {

//        Array Integer
        Integer [] arrayBilangan = {24, 2, 5};
        System.out.println(Arrays.toString(arrayBilangan));

//        Array String
        String[] arrayString = {"manga", "apel", "Melon"};
        System.out.println(Arrays.toString(arrayString));

//        Akses Data
        System.out.println(arrayBilangan[1]);
        System.out.println(arrayString[2]);

//        print array loop

        for (Integer bil: arrayBilangan){
            System.out.println();
        }

        Arrays.sort(arrayBilangan);
        System.out.println(Arrays.toString(arrayBilangan));


    }
}
