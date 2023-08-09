import java.util.Scanner;

public class Tes5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Kalkulator Sederhana");
            System.out.println("Pilih operasi:");
            System.out.println("1. Fahrenheit (F)");
            System.out.println("2. Reamur (R)");
            System.out.println("3. Kelvin (K)");
            System.out.println("0. Keluar");

            int pilihan = input.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan pengkonfersi suhu ini. Sampai jumpa!");
                break;
            } else if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan celsius: ");
                double C = input.nextDouble();

                double hasil = 0;

                switch (pilihan) {
                    case 1:
                        hasil = ( C * 9/5 ) + 32 ;
                        break;
                    case 2:
                        hasil = C * 4/5 ;
                        break;
                    case 3:
                        hasil = C + 273 ;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Coba lagi.");
                        continue; // Kembali ke awal loop
                }

                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }

            System.out.println(); // Membuat baris kosong sebagai jeda antara operasi
        }

        input.close();
    }
}