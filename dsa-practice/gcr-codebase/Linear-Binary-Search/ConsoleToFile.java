import java.io.*;

public class ConsoleToFile {

    public static void main(String[] args) {

        String filePath = "output.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(filePath)) {

            String input;
            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                input = br.readLine();
                if (input.equalsIgnoreCase("exit")) break;
                fw.write(input + System.lineSeparator());
            }

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
