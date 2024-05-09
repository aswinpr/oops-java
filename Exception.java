import java.util.*;
class Oddexception extends Exception{
    Oddexception(String s){
        super(s);
    }
}
class Evenexception extends Exception{
    Evenexception(String s){
        super(s);
    }
}
class oddeven{
    void oddevenx(int x)throws Oddexception,Evenexception{
        if(x%2==0){
            throw new Evenexception("even number");
        }
        else{
            throw new Oddexception("even number");
        }
    }
public static void main(String args[]){
try{
    oddeven o=new oddeven();
    Scanner sc=new Scanner(Sysytem.in);
    System.out.println("enter number");
    int a=sc.nextInt();
    o.oddevenx(a);
}
catch (Oddexception e){
    System.out.println(e);
}
catch (Evenexception e){
    System.out.println(e);
}
}
}
