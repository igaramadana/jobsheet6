import java.util.Scanner;

public class LatihanSuhu15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int suhu;
        String hujan;
        System.out.print("Masukkan Suhu: ");
        suhu = input15.nextInt();
        System.out.print("hujan? y/t: ");
        hujan = input15.next();

        if (suhu > 27) {
            System.out.println("Memakai dress");
            if (hujan.equals("y")) {
                System.out.println("Membawa payung");
            }else {
                System.out.println("memakai sunscreen");
            }
        }else {
            System.out.println("Memakai celana panjang.");
        }
    }
}
