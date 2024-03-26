public class AssignSoal4 {
    public static void main(String[] args) {
        //Init
        String[][] arrName = {
                {"Rudi", "Budi","Lila"},
                {"Erika", "Nina"},
                {"Lisa", "Anna"},
                {"Didit", "Resti","Hana"}
        };

        // Assign = divide into 5 groups with multidimensional array
        int groupCount = 5;
        int namesPerGroup = (int) Math.ceil((double) getTotalNames(arrName) / groupCount);
        String[][][] groups = new String[groupCount][][];
        int currentIndex = 0;

        // Initialize groups
        for (int i = 0; i < groupCount; i++) {
            groups[i] = new String[arrName.length][];
        }

        // Assign names to groups
        for (int i = 0; i < arrName.length; i++) {
            for (int j = 0; j < arrName[i].length; j++) {
                groups[currentIndex][i] = new String[arrName[i].length];
                groups[currentIndex][i][j] = arrName[i][j];
                currentIndex = (currentIndex + 1) % groupCount;
            }
        }

        // Display groups
        for (int i = 0; i < groupCount; i++) {
            System.out.println("Grup " + (i + 1) + ":");
            for (int j = 0; j < arrName.length; j++) {
                if (groups[i][j] != null) {
                    System.out.println("Tim " + (j + 1) + ": " + String.join(", ", groups[i][j]));
                }
            }
            System.out.println();
        }
    }

    // Helper method to get the total number of names
    private static int getTotalNames(String[][] arr) {
        int count = 0;
        for (String[] row : arr) {
            count += row.length;
        }
        return count;
    }
}