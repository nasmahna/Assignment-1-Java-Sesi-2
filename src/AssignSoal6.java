import java.util.Scanner;

public class AssignSoal6 {
    public static void main(String[] args) {
        //Init Var
        Scanner sc = new Scanner(System.in);
        int distMet, distMin;

        //Assign distMet meter ke km, distMin minutes ke jam
        System.out.println("Masukkan jarak (Meter): ");
        distMet = sc.nextInt();
        var convertMeterKm = distMet / 1000;

        System.out.println("Masukkan jarak (Minutes): ");
        distMin = sc.nextInt();
        var convertMinHours = distMin / 60;
        //Output
        System.out.printf("Kecepatan kendaraan adalah %d/%d km/jam.", convertMeterKm, convertMinHours);
    }
}
