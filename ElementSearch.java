import java.util.Scanner;
public class ElementSearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int flag=0;
        System.out.println("enter the element to search : ");
        int s=sc.nextInt();
        for(int i=0;i<n;i++){
            if(s==i){
                flag=1;
            }
            else{
                flag=0;
            }
        }
        if(flag==0){
            System.out.println("element not found");
        }
        else{
            System.out.println("element is in the array");
        }
    }
}
