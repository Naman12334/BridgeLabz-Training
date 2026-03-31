import java.io.*;

public class FileReadComparison {

    public static void main(String[] args) throws Exception {

        String filePath = "largefile.txt";

        
        long start1 = System.currentTimeMillis();
        int count1 = countWordsUsingFileReader(filePath);
        long end1 = System.currentTimeMillis();

       
        long start2 = System.currentTimeMillis();
        int count2 = countWordsUsingInputStreamReader(filePath);
        long end2 = System.currentTimeMillis();

        System.out.println("FileReader Word Count: " + count1 + " Time: " + (end1 - start1));
        System.out.println("InputStreamReader Word Count: " + count2 + " Time: " + (end2 - start2));
    }

    static int countWordsUsingFileReader(String file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        int count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            count += line.split("\\s+").length;
        }
        br.close();
        return count;
    }

    static int countWordsUsingInputStreamReader(String file) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "UTF-8"));
        int count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            count += line.split("\\s+").length;
        }
        br.close();
        return count;
    }
}
