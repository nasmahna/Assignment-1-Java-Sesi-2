import java.util.Scanner;

public class AssignSoal1 {
    public static void main(String[] args) {
        //Program konversi suhu
        Scanner sc = new Scanner(System.in);

        //VarType
        double celcius, farenheit, kelvin, reamur;

//        //hard
//        System.out.println("Celcius-Farenheit");
//        celcius = 30;
//        farenheit =  (9/5) * celcius + 32;
//        System.out.println("Hasil konversi Celcius-Farenheit: " + farenheit);

        //soft
        System.out.println("Menu: \n" +
                "[1] Celcius-Farenheit\n [2] Celcius-Kelvin\n [3] Celcius-Reamur");
        System.out.println("Masukkan pilihan Menu: ");
        int menu = sc.nextInt();
        if (menu == 1){
            System.out.println("Celcius-Farenheit");
            System.out.println("Masukkan nilai celcius: ");
            celcius = sc.nextFloat();
            farenheit =  (9/5) * celcius + 32;
            System.out.println("Hasil konversi Celcius-Farenheit: " + farenheit);
        } else if (menu == 2){
            System.out.println("Celcius-Kelvin");
            System.out.println("Masukkan nilai celcius: ");
            celcius = sc.nextFloat();
            kelvin =  celcius + 273.15;
            System.out.println("Hasil konversi Celcius-Kelvin: " + kelvin);
        } else if (menu == 3) {
            System.out.println("Celcius-Reamur");
            System.out.println("Masukkan nilai celcius: ");
            celcius = sc.nextFloat();
            reamur =  (4/5) * celcius;
            System.out.println("Hasil konversi Celcius-Reamur: " + reamur);
        } else {
            System.out.println("Pilihan Tidak Tersedia!");
        }
    }
}
