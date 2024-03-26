import java.util.Scanner;

public class AssignSoal5 {
    public static void main(String[] args) {
        //Init
        long minutes;

        //Konversi menit ke detik
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan menit: ");
        minutes = sc.nextLong();
        var convertSecond = (minutes * 60);

        //output
        System.out.println(String.format("Hasil konversi menit ke detik: " + convertSecond));
    }
}
