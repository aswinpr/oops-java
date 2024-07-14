import java.util.Scanner;
import java.util.Arrays;
class SortArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("enter the elements into the array :" );
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("array elements are:");
        for(String str:arr){
            System.out.println(str);
        }
        Arrays.sort(arr);
        System.out.println("Array after Sorted :");
        System.out.println(Arrays.toString(arr));

    }
}
