
import java.util.Scanner;

public class sumOfEvenNoInArray {

    public static void main(String[] args) {
        int [] array=init();
        display(array); 
        sumofevenno(array);
        
    }


    public static void sumofevenno(int array[]){
        int sum=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){

                sum=sum+array[i];
                
            }
           

        }
        System.out.println( "sum of even numbers in array :"+sum);
    }

    

    public static int [] init(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int [] array=new int[size];

        for(int i=0; i<size; i++){
            System.out.println("enter element :");
            array[i]=sc.nextInt();
            System.out.println();
        }
        return array;
       

    }



    public static void display(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print("|"+ array[i]+"|");

        }
        System.out.println();
        System.out.println();

     
    }
   
}
