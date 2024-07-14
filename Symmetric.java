import java.util.Scanner;
class Symmetric {
    public static void main(String args[]){
        int flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];

        System.out.println("enter the elements into matrix 1");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("--------------------");
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[j][i]=a[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(a[i][j] != b[i][j]){
                flag=0;
                break;
            }
        }
    }
    if(flag==0){
        System.out.println("not Symmetric");
    }
    if(flag==1){
        System.out.println("Symmetric");
    }

    }
}
