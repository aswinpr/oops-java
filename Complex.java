import java.util.Scanner;
class Complex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter real and imaginary part of first complex number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter real and imaginary part of second complex number:");
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("first complex number:"+a+"+"+b+"i");
        System.out.println("second complex number:"+c+"+"+d+"i");
        int s1=a+c;
        int s2=b+d;
        System.out.println("Result is "+s1+"+"+s2+"i");
    }    
}
