
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;



        Integer sumofTextNumbers = 0;
        try {


        while ((st = br.readLine())!=null) {
            sumofTextNumbers += Integer.parseInt(st);
            System.out.println(st);
        }
        System.out.println("summa"+sumofTextNumbers);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
