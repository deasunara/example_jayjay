package iteration;

public class forLoop {
    public static void main(String[] args) {
//        for array
        String [] buahBuahan ={"hitam","biru", "putih", "merah", "kuning"};

        for (String buah: buahBuahan){
           if (buah == "putih")continue;
            System.out.println(buah);
        }

//        for (int i=0; i <5; i++) {
//            System.out.println(i);
//        }

//        for break
//        for (int i=0; i <5; i++){
//            if (i == 2) continue;
//            System.out.println(i);
//        }
    }
}
