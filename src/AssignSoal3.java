import java.util.Arrays;

public class AssignSoal3 {
    public static void main(String[] args) {
        //Init + Assign
        int[] arrNum = new int[]{1, 2, 10, 12};
        int sum = 0;
        int length = arrNum.length;

        //Accessing num in array list
        var idx = arrNum[1];
        System.out.println(String.format("Index ke-2 array bernilai: " + idx));

        //Array length
        System.out.println(String.format("Panjang array: " + length));

        //Avg array
        for (int i = 0; i < arrNum.length; i++) {
            sum += arrNum[i];
        }
        var avg = sum / length;
        System.out.println(String.format("Rata-rata array: " + avg));
    }
}
