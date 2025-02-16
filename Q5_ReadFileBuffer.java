 import java.io.*;
public class Q5_ReadFileBuffer {
    public static void main(String[] args) {
        String path= "Read.txt";
        try {
            BufferedReader br=new BufferedReader( new FileReader(path));
            String line;
            while((line =br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
