public class AssignSoal4 {
    public static void main(String[] args) {
        //Init
        String[][] arrName = {
                {"Rudi", "Budi","Lila"},
                {"Erika", "Nina"},
                {"Lisa", "Anna"},
                {"Didit", "Resti","Hana"}
        };

        System.out.println("Array multidimensional dari array 'arrName':");
        for (int i = 0; i < arrName.length; i++){
            //kondisi dibuat dengan checking panjang array i
            for (int j = 0; j < arrName[i].length; j++){
                System.out.println(arrName[i][j] + "");
            }
            System.out.println();
        }
    }
}