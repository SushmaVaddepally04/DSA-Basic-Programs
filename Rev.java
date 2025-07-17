import java.util.Scanner;
public class Rev {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int temp;
        System.out.println("Enter array of size "+size);
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=arr.length/2;i++){
            if(size>=arr.length/2){
               temp=arr[i];
               arr[i]=arr[size-1];
               arr[size-1]=temp;
               size--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}