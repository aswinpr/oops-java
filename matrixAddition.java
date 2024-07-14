import java.util.Scanner;
class matrixAddition {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix :");
        n=sc.nextInt();
        int [][] arr1=new int[n][n];
        int [][] arr2=new int[n][n];
        int [][] sumarr=new int[n][n];
       
        System.out.println("enter elements into first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }

        }
        System.out.println("enter the elemnents into second matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of array is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sumarr[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sumarr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
