import java.util.Scanner;

public class Pemilihan2Percobaan115Modifikasi2 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        System.out.println("Masukkan Tahun: ");
        int tahun = input15.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else if ((tahun % 400) == 0) {
                System.out.println("Tahun Kabisat");
            } else if ((tahun % 100) == 0) {
                System.out.println("Bukan tahun kabisat");
            }     
        } else 
            System.out.println("Bukan Tahun Kabisat");
    }
}