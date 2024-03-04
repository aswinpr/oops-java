import java.util.Scanner;
class MatrixAddition{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit of array");
		int n=sc.nextInt();
		int sum=0;
		int[][]a=new int[10][10];
		int[][]b=new int[10][10];
		int[][]c=new int[10][10];
		System.out.println("enter the elements of array 1");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements of array 2");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("sum of array is:");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}
}
