
import java.util.Scanner;

public class sumOfArrayElement {

    public static int [] init(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int [] array=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter element :");
            array[i]=sc.nextInt();
            System.err.println();
        }
        return array;
        
    }

    public static void display(int array[]){
        System.out.print("array is :");
        for(int i=0; i<array.length; i++){
           
            System.out.print("|"+ array[i]+"|");
        }
        System.out.println();
        System.out.println();
    }

    public static void sumofelementinarray(int array[]){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum=sum+array[i];

        }
    
        System.out.println("sum of array element:"+ sum);
    }

    public static void main(String[] args) {
        int [] array=init();
        display(array);
        sumofelementinarray(array);
       

    }
    
}
