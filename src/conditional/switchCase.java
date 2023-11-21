package conditional;

public class switchCase {
    public static void main(String[] args) {
        int bulan = 9;
        String StringBulan;

        switch (bulan){
            case 1:
                StringBulan ="Januari";
                break;
            case 2:
                StringBulan ="Febuari";
                break;
            case 3:
                StringBulan ="Maret";
                break;
            case 4:
                StringBulan ="April";
                break;
            case 5:
                StringBulan ="Mei";
                break;
            case 6:
                StringBulan ="Juni";
                break;
            case 7:
                StringBulan ="Juli";
                break;
            default:
                StringBulan = "Nilai salah,harap isi dengan benar";
        }
        System.out.println(StringBulan);
    }
}
