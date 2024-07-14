import java.io.*;
class fileEvenOdd {
    public static void main(String args[])throws IOException{
        FileInputStream f1=new FileInputStream("sample.txt");
        FileOutputStream f2=new FileOutputStream("even.txt");
        FileOutputStream f3=new FileOutputStream("odd.txt");
        int c;
        while((c=f1.read())!= -1){
            if(c%2==0){
                f2.write(c);
            }
            else{
                f3.write(c);
            }
        System.out.print((char)c);    
        }
       
    f1.close();
    f2.close();
    f3.close();
    }
}
