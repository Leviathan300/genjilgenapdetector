import java.util.Scanner;

public class Tes12{
    public static void main(String[] args) {

            Scanner x = new Scanner(System.in);

            System.out.println("Masukkkan angka: ");
            int angka = x.nextInt();

            if(angka %2 == 0){
                System.out.println("angka ini genap");
            }

            else{
                System.out.println("angka ini ganjil");
            }

            
    }
}