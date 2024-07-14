import java.util.Scanner;

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
class OddEven{
    void oddeven(int x)throws Oddexception,Evenexception{
        if(x%2==0){
            throw new Evenexception("even");
        }
        else{
           throw new Oddexception("odd"); 
        }
    }
}

class oddEvenException {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        OddEven obj=new OddEven();

        System.out.println("enter the number : ");
        int n=sc.nextInt();
        try{
            obj.oddeven(n);
        }
        catch(Evenexception e){
            System.out.println(e);
        }
        catch(Oddexception e){
            System.out.println(e);
        }
    }
}
