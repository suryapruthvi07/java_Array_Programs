
import java.util.Scanner;

public class evenNoInArray {

    public static int [] init(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int [] array=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter element:");
            array[i]=sc.nextInt();
        }
        return array;
    }

    public static void display(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print("|"+array[i]+"|");
        }
        System.out.println();

    }


    public static void evenNumber(int  array []){
        System.out.println("even numbers :");
        for(int i=0; i<array.length; i++){

            if(array[i]%2==0){
                System.out.println( array[i]   + " : is even mumber " );
            }
           
        }
    }

    public static void main(String[] args) {
        int[] array=init();
        display(array);
        evenNumber(array);
    }
    
}
