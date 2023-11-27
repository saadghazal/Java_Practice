import java.io.*;
import  java.util.*;
import  javax.swing.JOptionPane;
public class Main {

    static Scanner console = new Scanner(System.in);


    void ghazal(int age){

    }
    void ghazal(){

    }
    void ghazal(double weight){

    }
    void ghazal(int age,double weight){

    }
    void ghazal(String weight,int age){

    }


    public static void main(String[] args) throws FileNotFoundException {

        int[] list = new int[5];
        int sum = 0;

        int i;

        for (i = 0; i < list.length; i++)
                list[i] = console.nextInt();

        System.out.println();
        System.out.println("The List Of Numbers Is: ");
        for (i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

        int largestNumber = list[0];

        System.out.println();
        System.out.print("The Sum Of The Numbers Is: ");
        for (i = 0; i < list.length; i++)
            sum+=list[i];

        System.out.println(sum);

        System.out.print("The AVG Of The Numbers Is: ");
        System.out.println(sum * 1.0/list.length* 1.0);




        System.out.print("The Largest Number Of The Numbers Is: ");
        for (i = 1; i < list.length; i++){
            if(list[i]>largestNumber){
                largestNumber = list[i];
            }
        }
        System.out.println(largestNumber);




//        Scanner inputFile = new Scanner(new FileReader("input.txt"));
//        PrintWriter outputFile = new PrintWriter("output.txt");
//        // ODD NUMBERS
//        // 1 3 5 7 9
//        outputFile.println("ODD NUMBERS");
//        while (inputFile.hasNext()){
//            int number = inputFile.nextInt();
//            if(number%2 != 0){
//                outputFile.println(number + "\t");
//            }
//        }
//
//        outputFile.close();
//
//        String name = inputFile.next();
//        String familyName = inputFile.next();
//        int age = inputFile.nextInt();
//        double height = inputFile.nextDouble();
//
//        outputFile.print("Your Name: "+ name + "\nFamily Name: "+familyName);
//
//        JOptionPane.showMessageDialog(null,"Your Name: "+ name + "\nFamily Name: "+familyName);
//
//        outputFile.close();

        /// hi minimum length is 8

//        System.out.printf("%10.4f  %10s",15.674,"hi");
//
//        double circleRadius = Double.parseDouble(JOptionPane.showInputDialog("Enter circle radius"));
//
//        double circleArea = Math.PI * circleRadius * circleRadius;



//        JOptionPane.showMessageDialog(null,"Your Circle Area "+String.format("%.2f",circleArea),"Circle Area",JOptionPane.INFORMATION_MESSAGE);

//        String name = JOptionPane.showInputDialog("Enter your name");
//        String field = JOptionPane.showInputDialog("Enter your field");
//        JOptionPane.showMessageDialog(null,"your name is "+name +"\n your field is "+field,"Your Info",JOptionPane.INFORMATION_MESSAGE);

//        String username = JOptionPane.showInputDialog("Enter your username");
//
//        System.out.print(username);

        System.exit(0);

    }
}