import java.util.*;

class Cpu {
    int price;

    public class Processor {
        int no_of_cores;
        String manufacturer;

        Processor(int no_of_cores, String manufacturer) {
            this.no_of_cores = no_of_cores;
            this.manufacturer = manufacturer;
        }

        void display1() {
            System.out.println("Processor specification : ");
            System.out.println("no of cores : " + no_of_cores);
            System.out.println("Manufacturer : " + manufacturer);
        }
    }

    static class Ram {
        int memory;
        String manufacturer;

        Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display2() {
            System.out.println("RAM details : ");
            System.out.println("memory size : " + memory);
            System.out.println("Manufacturer : " + manufacturer);
        }
    }
}

class ComputerSystem {
    public static void main(String args[]) {
        Cpu ob = new Cpu();
        Cpu.Processor obj1 = ob.new Processor(6, "Intel");
        Cpu.Ram obj2 = new Cpu.Ram(16, "Crucial");
        obj1.display1();
        obj2.display2();
    }
}
