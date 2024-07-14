class product{
    String pro_code;
    String pro_name;
    int price;

    product(String pc,String n,int p){
        pro_code=pc;
        pro_name=n;
        price=p;
    }

    void display(){
        System.out.println(pro_code+" "+pro_name+" "+price);
    }
}
class Products{
    public static void main(String args[]){

        product p1=new product("pro1","laptop",59000);
        product p2=new product("pro2","Mobile",60000);
        product p3=new product("pro3","Monitor",27000);

        p1.display();
        p2.display();
        p3.display();

        product lowest=p1;
        if(p2.price<lowest.price){
            lowest=p2;
        }
        if(p3.price<lowest.price){
            lowest=p3;
        }

        System.out.println(lowest.pro_name+" has low price, that is :"+lowest.price);
    }
}