import java.util.Scanner;
class Arraydisplayusingfunction
{      
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    { 
        System.out.println("enter the size");
        int size=sc.nextInt();
        int array[]=new int[size];
        //arrayDisplay(array,size);
        arrayInitialized(array,size);//array calling
        //arrayDisplay(array,size);
        addElementinarray(array,size);
        arrayDisplay(array,size);
        arraysum(array,size);
        arraysearchelement(array,size);
        arraycount(array,size);
        arraymax(array,size);
        arraymin(array,size);
        Findingfirsttowmaxelementofarray(array,size);
        Findingfirsttowminelementofarray(array,size);
    }
    public static void arrayInitialized(int[] array,int size)//array defination
    {  
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a element");
            array[i]= sc.nextInt();
        }
    }
    public static void addElementinarray(int array[],int size)
    {   
        System.out.println("enter a element to added in array ");
        int element=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            array[i]=array[i]+element;
        }
    }
    public static void arrayDisplay(int array[],int size)
    {
        System.out.print("[");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]);
            if(i<size-1)
            System.out.print(",");
        }
        System.out.println("]");
    }
    static void arraysum(int array[],int size)
    {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+array[i];
        }
        System.out.println(" sum of array element  "+sum);
    }
    static void arraysearchelement(int array[],int size)
    {
        System.out.println("enter a key you want to search");
        int key=sc.nextInt();
        boolean keyfound=false;
        for(int i=0;i<size;i++)
        {
            if(key==array[i])
            {  
                keyfound=true;
            } 
        }
        if(keyfound){
            System.out.println(key+" is found");
        }
        else
        System.out.println(key+" is not found");
    }
    public static void arraycount(int array[],int size)
    {
        int count=0;
        System.out.println("enter a key you want to count;");
        int key=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(key==array[i])
            count++;
        }
        if(count>0)
        System.out.println("key found "+count+" times");
        else
        System.out.println(key+" not found");
    }
    public static void arraymax(int array[],int size)
    {
        int max=array[0];
        for(int i=0;i<size;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }
       }
       System.out.println("max element of array is "+max);
 
    }
    public static void arraymin(int array[],int size)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(min>array[i])
            {
                min=array[i];
            }
       }
       System.out.println("min element of array is "+min);
    }
    public static void Findingfirsttowmaxelementofarray(int array[],int size)
    {
        int max1=array[0];
        int max2=array[0];
        int max=array[0];
        for(int i=0;i<size;i++)
        {
            if(max1<array[i])
            {
                max1=array[i];
            }
         }
         for(int i=0;i<size;i++)
         {
            if(max2<array[i]&& array[i]!=max1)
            {
                max2=array[i];
            }
         }
         System.out.println("first max element of array is "+max1);
         System.out.println("second max element of array is "+max2);
}
public static void Findingfirsttowminelementofarray(int array[],int size)
{
    int min1=Integer.MAX_VALUE;
    int min2=Integer.MAX_VALUE;
    for(int i=0;i<size;i++)
    {
        if(min1>array[i])
        {
            min1=array[i];
        }
   }
   for(int i=0;i<size;i++)
   {
      if(min2>array[i]&& array[i]!=min1)
      {
          min2=array[i];
      }
   }
   System.out.println("first min element of array is "+min1);
    System.out.println("second min element of array is "+min2);

}
}