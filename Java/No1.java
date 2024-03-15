package Testing1;
import java.lang.String;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String spacing = "=================";
        System.out.println(spacing + "DATA MAHASISWA" + spacing);

        System.out.printf("Nama\t\t: ");
        String nama = userInput.nextLine();

        System.out.printf("NIM\t\t\t: ");
        String nim = userInput.nextLine();

        System.out.printf("Asal Kampus\t: ");
        String asal = userInput.nextLine();

        System.out.printf("IPK\t\t\t: ");
        float ipk = userInput.nextFloat();

        System.out.println(spacing + "KONFIRMASI REGISTRASI" + spacing);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + nim);
        System.out.println("Asal Kampus\t: " + asal);
        System.out.println("IPK\t\t\t: " + ipk);
        System.out.println(nama + " Kamu berhasil melakukan registrasi, silahkan menunggu pengumuman selanjutnya");
    }
}
