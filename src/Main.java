import java.io.*;

/**
 * Created by mahdihs76 on 4/9/18.
 */
public class Main {

    public static void main(String[] args) {

        try {
            File f = new File("myJson.txt");
            InputStream stream = new FileInputStream(f);

            StringBuilder result = new StringBuilder();
            int byteCode = stream.read();
            while (byteCode != -1) {
                byteCode = stream.read();
                result.append((char) byteCode);
            }
            System.out.println(result);
            stream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
