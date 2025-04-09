public class printDigitinString{
    public static void main(String[] args) {
        String s1="pruthvi@143";
        digit(s1);
    }
    public static void digit(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>48 && str.charAt(i)<57){
                System.out.println(str.charAt(i));
            }
        }
    }
}