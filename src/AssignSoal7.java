public class AssignSoal7 {
    public static void main(String[] args) {
        //Init
        int[][] numbers = {
                {1, 4, 10},
                {10, 8, 7, 11, 14},
                {3, 5, 7},
                {12, 90, 98, 7, 3 ,5},
                {3, 9, 10, 5, 1}
        };

        //Assign (akses semua elemen angka genap) indeks only
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                //modulo bagi 2 habis biar menandakan bilangan genap
                if (numbers[i][j] % 2 == 0) {
                    //print bil genap berdasarkan indeks
                    System.out.println("Angka genap " + numbers[i][j] + ": [" + i + "][" + j + "]");
                }
            }
        }
    }
}
