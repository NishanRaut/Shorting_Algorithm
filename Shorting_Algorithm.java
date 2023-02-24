import java.util.*;

public class Shorting_Algorithm{
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int length,number,i,j,emp;
        System.out.println("Enter length of an array: ");
        length=input.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter number: ");
        for(i=0;i<arr.length;i++){
            number=input.nextInt();
            arr[i]=number;
        }
        System.out.println("This is without shorting: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(i=0;i<arr.length;i++){
            for(j=arr.length-1;j>i;j--){
                if(arr[i]>arr[j]){
                    emp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=emp;
                }
            }
        }
        System.out.println("After shorting: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}