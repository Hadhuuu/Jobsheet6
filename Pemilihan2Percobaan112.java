import java.util.Scanner;

/**
 * Pemilihan2Percobaan112
 */
public class Pemilihan2Percobaan112 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan Tahun : ");
        tahun=input12.nextInt();
        if ((tahun % 4 ) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan tahun kabisat");
    }
}