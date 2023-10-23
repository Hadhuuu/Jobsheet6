import java.util.Scanner;

public class Pemilihan2Percobaan212 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        System.out.println("Masukkan Sudut 1");
        sudut1=input12.nextFloat();
        System.out.println("Masukkan Sudut 2");
        sudut2=input12.nextFloat();
        System.out.println("Masukkan Sudut 3");
        sudut3=input12.nextFloat();
//Operator
        totalSudut = sudut1 + sudut2 + sudut3;
//Kondisi
        if (totalSudut==180) {
            if ((sudut1==90) || (sudut2==90) || (sudut3==90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1==sudut2)&&(sudut2==sudut3)&&(sudut1==sudut3))
            System.out.println("Segitiga tersebut adalah Segitiga Sama Sisi");
            else if ((sudut1==sudut2)||(sudut2==sudut3)||(sudut3==sudut1))
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
        System.out.println("Bukan merupakan Segitiga");
    }
}