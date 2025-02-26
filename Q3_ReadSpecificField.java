package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q3_ReadSpecificField {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("sample.json")))
        {
            String line;

            while((line = br.readLine())!=null){
                String[] values = line.split(",");
                if(values[0].contains("email") || values[0].contains("name")){
                    System.out.println(values[0].toString());
                }
            }
        }
        catch(IOException e){e.printStackTrace();}
    }
}
