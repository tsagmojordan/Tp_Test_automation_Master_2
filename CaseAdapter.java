import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CaseAdapter {

    // Method to process each character and map to the corresponding value
    public double getMappedValue(char letter) {
        Random random = new Random();

        return switch (letter) {
            case 'a' -> 0.0;
            case 'b' -> random.nextDouble() * 1e-5; // Between 0 and 10^-5
            case 'c' -> random.nextDouble() * 12 + 3; // Between 3 and 15
            case 'd' -> random.nextDouble() * (1e4 - 1e1) + 1e1; // Between 3 and 15
            case 'e' -> random.nextDouble() * (1e10 - 1e6) + 1e6; // Between 3 and 15
            case 'f' -> random.nextDouble() * (-1e-5) + 0; // Between 3 and 15
            case 'g' -> random.nextDouble() * (-3 + 15) - 15; // Between 3 and 15
            case 'h' -> random.nextDouble() * (-1e1 + 1e4) - 1e4; // Between 3 and 15
            case 'i' -> random.nextDouble() * (1e10 - 1e6) - 1e10;
            default -> 0.0; // Default case for any other letters
        };
    }
    public String getMappedClassName(char letter) {

        return switch (letter) {
            case 'a' -> "nul";
            case 'b' -> "tres_proche_de_zero_positif";
            case 'c' -> "proche_de_zero_positif";
            case 'd' -> "normal_positif";
            case 'e' -> "tres_grand_positif";
            case 'f' -> "tres_proche_de_zero_negatif";
            case 'g' -> "proche_de_zero_negatif";
            case 'h' -> "normal_negatif";
            case 'i' -> "tres_grand_negatif";
            default -> ""; // Default case for any other letters
        };
    }

    // Method to read the file and separate numbers and letters
    public  ArrayList<ArrayList<Double>> readAndProcessFile(String path) {
        ArrayList<ArrayList<Double>> firstValues = new ArrayList<>();
        ArrayList<Double> secondValues = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Trim the line to remove leading/trailing spaces and check if it's not empty
                line = line.trim();
                 //          System.out.println(line);
                if (line.isEmpty()) {
                    // Skip empty lines
                    continue;
                }

                // Print the line to confirm it's being read correctly
                //System.out.println("Reading line: " + line);
                
                // Split each line into two parts
                String[] parts = line.split("\\s+"); // Split by space
                for (String part : parts) {

                    secondValues.add(this.getMappedValue(part.charAt(1)));
                    
                }
                

               
        
                //System.out.println("First letter:a " +  " -> " + secondValues.get(0));
                //System.out.println("Second letter:b " + secondValues.get(1) + " -> " );
    
                firstValues.add(secondValues);
                secondValues = new ArrayList<>();

                // Check if there are exactly two parts in the line
                
               
                
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Optionally, print the lists of mapped values
        //System.out.println("\nFirst values: " + firstValues);
        //System.out.println("Second values: " + secondValues);
        return firstValues; // Return the list of mapped values
    }

    public  ArrayList<ArrayList<JennyCase>> readAndProcessFile2(String path){
        ArrayList<ArrayList<JennyCase>> firstValues = new ArrayList<>();
        ArrayList<JennyCase> secondValues = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Trim the line to remove leading/trailing spaces and check if it's not empty
                line = line.trim();
                //          System.out.println(line);
                if (line.isEmpty()) {
                    // Skip empty lines
                    continue;
                }

                // Print the line to confirm it's being read correctly
                //System.out.println("Reading line: " + line);

                // Split each line into two parts
                String[] parts = line.split("\\s+"); // Split by space
                for (String part : parts) {

                    Double v=this.getMappedValue(part.charAt(1));
                    String n=this.getMappedClassName(part.charAt(1));
                    secondValues.add(new JennyCase(v,n));

                }




                //System.out.println("First letter:a " +  " -> " + secondValues.get(0));
                //System.out.println("Second letter:b " + secondValues.get(1) + " -> " );

                firstValues.add(secondValues);
                secondValues = new ArrayList<>();

                // Check if there are exactly two parts in the line



            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Optionally, print the lists of mapped values
        //System.out.println("\nFirst values: " + firstValues);
        //System.out.println("Second values: " + secondValues);
        return firstValues;
    }


        // Main method to run the program
}
