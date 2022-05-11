// Program for IO concept
// InputStreamReader, BufferedReader, FileReader, FileWriter

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

class IOConcept
{
    static public void main(String...args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        String data = br.readLine();

        FileWriter fw = new FileWriter("IOConcept.txt", true);
        fw.write(data);
        fw.close();

        FileReader fr = new FileReader("IOConcept.txt");
        BufferedReader br1 = new BufferedReader(fr);
        String completeData = br1.readLine();
        out.println(completeData);
    }
}