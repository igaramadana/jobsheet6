import java.util.Scanner;
public class LatihanKasir15 {
    public static void main(String[] args) {
        int total, diskon, bayar;
        String kartu;
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Apakah Peanggan mempunyai kartu anggota y/t? : ");
        kartu = sc15.nextLine();
        System.out.print("Berapa total harga baranag belanjaan? Rp ");
        total = sc15.nextInt();
        if (kartu.equals("y")) {
            if (total > 500000) {
                diskon = 50000;
            } else {
                diskon = 25000;
            }
        } else {
            if (total > 200000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }
        bayar = total - diskon;
        System.out.println("Total yang harus dibayar: Rp" + bayar);
    }
}
