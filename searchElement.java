import java.util.Scanner;
class searchElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements to be inserted: ");
        int n=sc.nextInt();
        int flag=1;
        String arr[]=new String[n];
        System.out.println("enter the elements into array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("Array elemts are :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        boolean found=false;
        //search element
        System.out.println("enter the element to be search");
        String elem=sc.nextLine();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(elem)){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("element found");
        }
        else{
            System.out.println("not found");
        }
    }
}

