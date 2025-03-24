public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array (3x3 matrix)
        String[][] matrix = {
                {"1 - 10", "|", },  // Row 1
                {"11 - 20", "|" , },  // Row 2
                {"21 - 30", "|", },
                {"31 - 40", "|", },
                {"41 - 50", "|", },
                {"51 - 60", "|", },
                {"61 - 70", "|", },
                {"71 - 80", "|", },
                {"81 - 90", "|", },
                {"91 - 100", "|", },

        };

        // Print the 2D array
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {  // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) {  // Loop through columns
                System.out.print(matrix[i][j] + " ");  // Print each element
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}


