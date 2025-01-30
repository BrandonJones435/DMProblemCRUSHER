import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList; 

public class DMProblemCrusherDriver implements DMProblemCrusherInterface{
    ArrayList<String> truthVar = new ArrayList<String>();

    public void readFile() {
        // Read the first row from the file SampleTT.csv. 
        try {
            BufferedReader br = new BufferedReader(new FileReader("SampleTT.csv"));
            String line = br.readLine();
            String[] varNames = line.split(",");
            for (int i = 0; i < varNames.length; i++) {
                truthVar.add(varNames[i]);
            }
            System.out.print(truthVar);
        } catch (Exception e) {
            System.out.println("Error reading file");
          }
    }
    public static void main(String[] args) {
        DMProblemCrusherDriver driver = new DMProblemCrusherDriver();
        driver.readFile();
    }
}

