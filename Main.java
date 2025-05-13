import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] arry = new int[10];
        int size = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("<----------------------------------Insert Data--------------------------------------->");

        System.out.println("Enter data: ");

        for (int r=0; r< size; r++){
            arry[r] = scanner.nextInt();
        }
        System.out.println("<------------------------------------------------------------------------->");

        for (int i = 0; i<size; i++){
            System.out.println(arry[i]);
        }
        System.out.println("<------------------------------------------------------------------------->");

        System.out.println("enter your index: ");
        int inputIndex = scanner.nextInt();

        System.out.println("enter your element: ");
        int inputElement = scanner.nextInt();

        size++;

        for (int k = size; k>=inputIndex; k--){
            arry[k] = arry[k-1];
        }

        arry[inputIndex] = inputElement;

        System.out.println("<------------------------------------------------------------------------->");

        for (int i = 0; i<size; i++){
            System.out.println(arry[i]);
        }


        System.out.println("<----------------------------------Delete Data--------------------------------------->");

        System.out.println("Enter the  delete index: ");
        int deleteIndex = scanner.nextInt();

        for (int c = deleteIndex; c < size; c++ ) {
            arry[c] = arry[c+1];
        }
        size--;

        for (int i = 0; i<size; i++){
            System.out.println(arry[i]);
        }
        System.out.println("<------------------------------------------------------------------------->");

        System.out.println("<----------------------------------------search Data--------------------------------->");


        System.out.println("Enter the index for search: ");
        int searchIndex = scanner.nextInt();

        int l;

        for ( l = 0; l < size; l++){
            if (arry[l] == searchIndex){
                break;
            }else {
                System.out.println("plz.... new enter...");
            }
        }

        System.out.println("you search Number is : " + l);


        System.out.println("<----------------------------------------update Data--------------------------------->");

        System.out.println("Enter update index: ");
        int updateInput = scanner.nextInt();

        System.out.println("Enter new update index: ");
        int updateNewInput = scanner.nextInt();

        arry[updateInput] = updateNewInput;

        for (int i = 0; i<size; i++){
            System.out.println(arry[i]);
        }









    }
}