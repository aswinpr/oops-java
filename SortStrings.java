import java.util.*;
class SortStrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of array:");
        int n=sc.nextInt();
        int i;
        String[] arr=new String[n];
        System.out.println("enter the elements of array :");
        for(i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("array elements are :");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("sorted array elements are :");
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
}