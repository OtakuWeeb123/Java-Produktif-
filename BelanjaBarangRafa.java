import java.util.Scanner;

public class BelanjaBarangRafa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Barang1: ");
        String namaBarang1 = input.nextLine();
        System.out.print("Harga Barang1: ");
        double hargaBarang1 = input.nextDouble();
        input.nextLine(); // Buang newline

        System.out.print("nama Barang2: ");
        String namaBarang2 = input.nextLine();
        System.out.print("Harga Barang2: ");
        double hargaBarang2 = input.nextDouble();

        System.out.println("=====================================");
        System.out.println("Barang yang dibeli: " + namaBarang1 + " dan " + namaBarang2);
        System.out.println("Harga: " + hargaBarang1 + " dan " + hargaBarang2);
        
    }
}