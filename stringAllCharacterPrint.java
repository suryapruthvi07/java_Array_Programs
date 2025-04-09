public class stringAllCharacterPrint {
    public static void main(String[] args) {


        String str="BRIGHT PATH";
        display(str);
    }

    public static void display(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }
    }


}
