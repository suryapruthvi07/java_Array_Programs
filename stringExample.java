
import java.util.Scanner;

class stringExample{

    public static void stringEx(){
        
        String s="pruthvi";
        String s1=new String("pruthvi");
        s1.concat("pruthvi");
        String s2="pruthvi";
        s2=s1.concat(s2);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        
    }
    public static void methodsOfString(String str){
        System.out.println("length: " + str.length());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        methodsOfString(str);

        stringEx();



      
        }
    }
