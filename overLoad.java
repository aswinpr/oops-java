import java.util.Scanner;
class shapes{
    void area(int l,int b){
        System.out.println("area of rectangle is"+ l*b);
    }
    void area(int l){
        System.out.println("area of square is : "+l*l);
    }
    void area(double r){
        System.out.println("Area of circle is :"+3.14*(r*r));
    }
}
class overLoad{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        shapes obj=new shapes();

        System.out.println("enter length and breadth of rectangle : ");
        int l=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("enter length of square: ");
        int s=sc.nextInt();

        System.out.println("enter radius of circle : ");
        double r=sc.nextDouble();

        obj.area(l,b);
        obj.area(s);
        obj.area(r);

    }
}
