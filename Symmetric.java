import java.util.Scanner;
class Symmetric{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit of array : ");
	int n=sc.nextInt();
	int [][]a=new int[10][10];
	int flag=1;
	System.out.println("enter elements of array :");
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			System.out.print(a[i][j]+" ");	
		}
		System.out.println();
	}
	
	int [][]b=new int[10][10];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			b[j][i]=a[i][j];
		}
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
		System.out.println(" Not Symmetric");

	}
	if(flag==1){
		System.out.println("Symmetric");
		
	}
	
	
	}
}