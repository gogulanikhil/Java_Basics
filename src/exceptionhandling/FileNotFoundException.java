package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Collectors;

//to find filenotfoundexception
public class FileNotFoundException {
    static String filename;

    private static String toCheckFile(String filename)  {
        BufferedReader bufferedReader;
//        you can use try catch block or else throws the exception at method signature
        try {
            bufferedReader = new BufferedReader(new FileReader(filename));
        } catch (java.io.FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return bufferedReader.lines().collect(Collectors.joining());
    }

    public static void main(String[] args) {
//      to not get an exception create a file by code or manually and pass the filename
        System.out.println(FileNotFoundException.toCheckFile(FileNotFoundException.filename= "NoFile.txt"));

    }
}