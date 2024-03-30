import java.util.Scanner;
public class Complex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("enter real and imaginary part of first complex number :");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter real and imaginary part of second complex number :");
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println("  first complex number :"+ a +" + i"+b);
        System.out.println(" second complex number :"+ c +" + i"+d);
        int s1=a+c;
        int s2=b+d;
        System.out.println(" Result  :"+ s1 +" + i"+s2);
    }
}
