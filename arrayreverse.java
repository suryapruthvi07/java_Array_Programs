import java.util.Scanner;

public class arrayreverse {
    public static void main(String args[]){
        int [] array=init();
       
        display( array );
        System.out.println("");
        System.out.println("");
     
    
        reverseArray(array); 
        displayreverse( array); 
    }

    public static int [] init(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size :");
        int size=sc.nextInt();
        int [] array=new int [size];
        for(int i=0; i<size; i++){
            System.out.println("enter element :");
            array[i]=sc.nextInt();
        }
        return array;
    }


    public static void display(int [] array){
        System.out.println("array is :");
        for(int i=0; i<array.length; i++){


            System.err.print("|" + array[i] +"|");

        }

    }
    public static void displayreverse(int [] array){
        System.out.println("reverse array is :");

        for(int i=0; i<array.length; i++){
          System.err.print("|" + array[i] +"|");

        }

    }

    public static void reverseArray(int [] array){
        for(int i=0; i<array.length/2; i++)
        {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;

        }
    }
}
