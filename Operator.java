import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan Bilangan 2: ");
        int bil2 = input.nextInt();

        int hasil = bil1 + bil2;
        int hasil2 = bil1 - bil2;
        int hasil3 = bil1 * bil2;
        int hasil4 = bil1 / bil2;
        int hasil5 = bil1 % bil2;
        
        System.out.println("Bilangan 1 " + bil1);
        System.out.println("Bilangan 2 " + bil2);
        System.out.println("Hasil Penjumlahan Kedua Bilangan "+hasil);
        System.out.println("Hasil Pengurangan Kedua Bilangan "+hasil2);
        System.out.println("Hasil Perkalian Kedua Bilangan "+hasil3);
        System.out.println("Hasil Pembagian Kedua Bilangan "+hasil4);
        System.out.println("Hasil Modulus Kedua Bilangan "+hasil5);
    }
}
