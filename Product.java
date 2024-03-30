import java.util.*;
public class Product{
    int product_code;
    String product_name;
    double product_price;

    Product(int c,String n,double p){
        product_code=c;
        product_name=n;
        product_price=p;
    }
    void display(){
        System.out.println(product_code + "|" + product_name + "|" + product_price);
    }
    static void lowest(double p1,double p2,double p3){
        if(p1 < p2 && p1<p3){
            System.out.print("product 1 has lowest price ");
        }
        else if(p2 < p1 && p2 < p3){
            System.out.print("product 2 has lowest price ");
        }
        else{
            System.out.print("product 3 has lowest price ");
        }
    }
    public static void main(String args[]){
        Product obj1 = new Product(1, "Mobile", 25999);
        Product obj2 = new Product(2, "Watch", 5000);
        Product obj3= new Product(3, "Laptop", 80000);

        System.out.println("Product Information \n Product_code | Product_name | Product_price");
        obj1.display();
        obj2.display();
        obj3.display();
        lowest(obj1.product_price,obj2.product_price,obj3.product_price);//static 
    }

}
