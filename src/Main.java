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


    static class IntClass{
        int num;
        IntClass(){
            num = 0;

        }
        IntClass(int value){
            num = value;
        }

//        @Override
//        public String toString() {
//
//            return String.valueOf(num);
//
//        }
    }
    public static void main(String[] args) throws FileNotFoundException {


        Vector<String> vStr = new Vector<String>(6);
        vStr.addElement("Ghazal");
        vStr.addElement("Nusair");
        vStr.addElement("Omari");

        System.out.println("Vector Elements Before Adding Element At Index 2: "+vStr);
        System.out.println("Vector Size Is: "+vStr.size());
        vStr.insertElementAt("Marashdeh",2);

        System.out.println("Vector Elements After Adding Element At Index 2: "+vStr);
        System.out.println("Vector Size Is: "+vStr.size());
        vStr.removeElementAt(2);

        System.out.println("Vector Elements After Deleting Elemant At Index 2: "+vStr);
        System.out.println("Vector Size Is: "+vStr.size());

        System.out.print("Is Marashdeh Not There ? ");
        if(!vStr.contains("Marashdeh")){
            System.out.println("YES HE IS NOT THERE!!!");
        }else {
            System.out.println("NO HE IS THERE!!!");
        }

        System.out.println("Element At Index 1 Is: "+vStr.elementAt(1));
        System.out.println("What is the index of Nusair? "+vStr.indexOf("Mohammed"));

         Vector<IntClass> intClassVector = new Vector<IntClass>();
         intClassVector.addElement(new IntClass(5));
         intClassVector.addElement(new IntClass(3));
         intClassVector.addElement(new IntClass(2));
         intClassVector.addElement(new IntClass());
         System.out.println(new IntClass(4));
         System.out.println("Vector Elements Are: ");
         for( IntClass number: intClassVector ){
             System.out.print(number.num+" ");
         }



//        int[] listA = {4,7,8,9};
//        int[] listB = new int[listA.length];
//
//        for(int i=0;i<listA.length;i++){
//            listB[i]=listA[i];
//        }
//        System.out.println("List A Components: ");
//        printArray(listA);
//        System.out.println();
//        System.out.println("List B Components: ");
//        printArray(listB);
//        System.out.println();
//        if(areEqualsArray(listA,listB)){
//            System.out.println("Arrays are equale");
//        }else{
//            System.out.println("Arrays are not equale");
//        }
//        int[][] matrix = new int[2][3];
//
//
//        System.out.println("Enter 2D Array Values: ");
//        for(int row=0;row<matrix.length;row++){
//            for(int col = 0 ;col<matrix[row].length;col++){
//                System.out.print("Enter Value in row = "+ (row)+" in col = "+(col)+": ");
//                matrix[row][col] = console.nextInt();
//            }
//        }
//
//        System.out.println("Sum Of 2D Array Values: "+sumOfEntire2DArray(matrix));
//        System.out.println("Sum Of Each Row:");
//        sumByRow(matrix);
//
//        largestInEachRow(matrix);






        // printArray(4 printTarget,5 weight,2,3,4,5,6,7,8,9,9 list)


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


//    static void printArray(int[] printedArray){
//        for (int i = 0; i < printedArray.length; i++)
//            System.out.print(printedArray[i] + " ");
//    }
//    static void largestInEachRow(int[][] list){
//        for(int row = 0;row<list.length;row++){
//            int largestNumInRow = list[row][0];
//            for(int col = 1;col<list[row].length;col++){
//                if(list[row][col]>largestNumInRow){
//                    largestNumInRow = list[row][col];
//                }
//            }
//            System.out.println("Largest Number In Row "+(row+1)+" = "+largestNumInRow);
//        }
//    }
//    static void printArrayForEach(int[] array){
//
//        for(int number: array){
//            System.out.print(number + " ");
//        }
//    }
//    static void sumByRow(int[][] list){
//        int sum;
//        for (int row = 0; row < list.length; row++)
//        {
//            sum = 0;
//            for (int col = 0; col < list[row].length;
//                 col++)
//                sum = sum + list[row][col];
//            System.out.println("Sum of row " + (row + 1)
//                    + " = "+ sum);
//        }
//    }
//    static int sumOfArray(int[] array){
//        int sum = 0;
//        for (int i = 0; i < array.length; i++)
//            sum+=array[i];
//
//        return  sum;
//    }
//    static int sumOfEntire2DArray(int[][] list){
//        int sum = 0;
//        for(int row = 0;row<list.length;row++){
//            for(int col =0 ;col<list[row].length;col++){
//                sum+=list[row][col];
//            }
//        }
//        return  sum;
//    }
//    static boolean areEqualsArray(int[] array1,int[] array2){
//        if(array1.length != array2.length){
//            return false;
//        }
//
//        for(int i = 0 ;i<array1.length;i++){
//            if(array1[i] != array2[i]){
//                return  false;
//            }
//        }
//        return true;
//    }

}