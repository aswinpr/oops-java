class Cpu{
    int price;

    public Cpu(int price){
        this.price=price;
    }


class Processor{
    int no_of_cores;
    String name;

    Processor(int no_of_cores,String name){
        this.no_of_cores=no_of_cores;
        this.name=name;
    }
    void display(){
        System.out.println("---------Processor details--------------");
        System.out.println("no of cores : "+no_of_cores);
        System.out.println("manufacturer : "+name);
        System.out.println("price : "+price);
    }
}
static class Ram{
    int memory;
    String name;

    Ram(int memeory,String name){
        this.memory=memeory;
        this.name=name;
    }
    void display(){
        System.out.println("-------------Ram Details----------------");
        System.out.println("Memory :"+memory);
        System.out.println("Manufacturer"+name);
    }
}
}

class innerClass {
    public static void main(String args[]){
        Cpu obj=new Cpu(60000);
        Cpu.Processor p=obj.new Processor(6,"intel");
        Cpu.Ram r=new Cpu.Ram(16, "Crucial");
        p.display();
        r.display();
    }
}
