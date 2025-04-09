public class checkStringEmptyOrNot {
    public static void main(String[] args) {
       String s1=new String("  ")  ;
    System.out.println(isEmptyMethod(s1));
       
    }

    
    public static boolean isEmptyMethod(String str){

        if(str.length()==0){
            return true;

        }
        else{

            return false;
        }

        
    }



}
