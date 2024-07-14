import java.util.Scanner;
class SearchArrayInt {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit : ");
        int n=sc.nextInt();
        int flag=1;
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter elemnt to be search : ");
        int ele=sc.nextInt();
        for(int i=0;i<n;i++){
            if(ele==arr[i]){
                flag=0;
            }
        }
        if(flag==0){
            System.out.println("element found");
        }
        if(flag==1){
            System.out.println("not found");
        }
    }
}
