package day12;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class Textasdfjkl {
    public static void main(String[] args) throws IOException {
        writeFile();
    }

    public static void writeFile() throws IOException {
        String fname = "TextFile.txt";
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(fname, true);
            pw = new PrintWriter(fw);
            String test = "So many people live right there. close eyes and write down here.";
            String[] ls = test.split("\\s+");
            for (int i = 0; i < ls.length; i++) {
                pw.println(ls[i]);
            }

        } catch (Exception e) {
            System.out.println("File exception is " + e.getMessage());
        } finally {
            if (fw != null) {
                fw.close();
            }
            if (pw != null) {
                pw.close();
            }
        }
    }

    public static void readByLine() {
        // int ch;
        String line = null;
        int c = 0;
        FileReader fr = null;
        Scanner sc = null;
        StringBuilder sb = new StringBuilder();
        try {
            fr = new FileReader("0724_파일입출력.txt", Charset.forName("UTF-8"));
            sc = new Scanner(fr);
            while (sc.hasNext()) {
                line = sc.nextLine();
                System.out.println(line);
                sb.append(line);
                c++;
            }
            // System.out.println(sb.toStinrg());
            System.out.println("ReadLine : " + c);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        } finally {
            try {
                fr.close();
                sc.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public static void readText() {
        int ch;
        int c = 0;
        FileReader fr = null;
        StringBuilder sb = new StringBuilder();
        try {
            fr = new FileReader("c:\\C104\\연습.txt");
            while ((ch = fr.read()) != -1) {
                // System.out.println((char)ch);
                sb.append((char) ch);
                c++;
            }
            System.out.println(sb.toString());
            System.out.println("ReadLine : " + c);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
            // TODO: handle exception
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }

}
