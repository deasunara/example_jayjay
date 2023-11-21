package conditional;

public class ifConditional {
    public static void main(String[] args) {
        int hasil1= 76;

        String nilaiLulus= "Selamat anda lulus";
        String nilaiGagal= "Mohon maaf anda tidak lulus";

        String keputusan= (hasil1 > 75) ? nilaiLulus:nilaiGagal;

        System.out.println(keputusan);

        if (hasil1 < 40) {
            System.out.println("Niali kamu D");
        } else if (hasil1 > 50 && hasil1 < 70 ){
            System.out.println("Nilai kamu C");
        }else if (hasil1 > 70 && hasil1 < 80) {
            System.out.println("Nilai kamu B");
        }else {
            System.out.println("Nilai kamu A");
        }
    }
}
