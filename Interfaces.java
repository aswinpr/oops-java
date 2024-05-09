import java.util.Scanner;
class Shapes{
	void area();
	void perimeter();
}

class Circle implements Shapes{

	int r;
	Scanner sc=new Scanner(System.in);
	void area(){
		System.out.println("enter the radius : ");
		int r=sc.nextInt();
		float area = 3.14*r*r;
		System.out.println("area of circle is "+ area);
	}
	void perimeter(){
		System.out.println("enter the perimeter : ");
		int r=sc.nextInt();
		float peri = 2*(3.14*r*r);
		System.out.println("permieter of circle is "+peri);
	}
}
class Rectangle implements Shapes{
	int l,b;
	Scanner s=new Scanner(System.in);
	void area(){
		System.out.println("enter the length : ");
		int l=sc.nextInt();
		System.out.println("enter the breadth : ");
		int b=sc.nextInt();
		int area=l*b;
		System.out.println("area of rectangle is "+area);
	}
	void perimeter(){
		System.out.println("enter the length : ");
		int l=sc.nextInt();
		System.out.println("enter the breadth : ");
		int b=sc.nextInt();
		int peri=2*(l*b);
		System.out.println("perimeter of rectangle is "+peri);
	}
}
class Interfaces{
	public static void main(String args[]){
	Circle obj=new Circle();
	Rectangle obj1=new Rectangle();
	System.out.println("1.area of circle\n2.perimeter of circle\n3.area of rectangle\n4.perimeter of rectangle\n5.exit");
	do{
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice){
			case 1: obj.area();
				break;
			case 2: obj.perimeter();
				break;
			case 3: obj1.area();
				break;
			case 4: obj2.perimeter();
				break;
			case 5: 
				break;
			default:System.out.println("invalid choice");	
		}
	}
	while(choice !=5);
	}
}
