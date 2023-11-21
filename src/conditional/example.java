package conditional;

public class example {
    public static void main(String[] args) {
        int nilai = 3;

        if (nilai >= 1 && nilai <= 10) {
            if (nilai == 1 || nilai == 3 || nilai == 5 || nilai == 7 || nilai == 9) {
                System.out.println("Ganjil");
            } else {
                System.out.println("Genap");
            }
        } else {
            System.out.println("Angka di luar jangkauan");
        }
    }
}
