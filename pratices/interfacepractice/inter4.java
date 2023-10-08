package interfacepractice;

import java.util.*;

interface sortable
{
 void sort(int[]arr);   
}
class bubble implements  sortable {

    @Override
    public void sort(int[] arr) {
        // TODO Auto-generated method stub
        int t=0;
        for(int i=0;i<arr.length;i++)
        {t=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
            System.out.println(arr[i]);
        }

    }
}
class selection implements sortable{

    @Override
    public void sort(int[] arr) {
       int min=0;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j; 
                }
                int t=arr[i];
                arr[i]=arr[min];
                arr[min] = t;
            }
            System.out.println(arr[i]);
       }
    }
    
}
public class inter4 {
    
    public static void main(String a[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter a size of array");
    int len=s.nextInt();
    int arr[]=new int[len];
System.out.println("enter a elements");
    for(int i=0;i<len;i++)
    {
        arr[i]=s.nextInt();
    }
    System.out.println("bubble sort");
    bubble b=new bubble();
    b.sort(arr);
    System.out.println("selection sort");
    selection sele = new selection();
    sele.sort(arr);
}
}
