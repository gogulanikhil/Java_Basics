package exceptionhandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//checked exceptions -> these can be seen during compile time can be handled by both throws keyword and also try catch block
public class RecursiveCallExceptionIO {
    public static List<Integer> getSequence(int n){
        List<Integer> sequList=new ArrayList<>();
        sequList.add(0);
        int prev=0;
        int curr=1;
        int index=1;
        while (index<=n){
            sequList.add(curr);
            int next=prev+curr;
            prev=curr;
            curr=next;
            index++;
        }
        return sequList;
    }
    public static void storeSequence(List<Integer> sequence) throws IOException {
        String textfile="FileStream.txt";
        File file=new File(textfile);
//uncomment this code to handle the exception by throws keyword at method level

//        FileWriter fileWriter=new FileWriter(file);
//         fileWriter.write(sequence.toString());
//         fileWriter.flush();
//         fileWriter.close();

//uncomment this code to handle the exception by try catch block
         try {
             FileWriter fileWriter=new FileWriter(file);
             fileWriter.write(sequence.toString());
             fileWriter.flush();
             fileWriter.close();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}
class output{
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int sequenceNo=scan.nextInt();
        List<Integer> getList=RecursiveCallExceptionIO.getSequence(sequenceNo);
        RecursiveCallExceptionIO.storeSequence(getList);
        scan.close();
    }
}
