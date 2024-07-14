import java.util.Scanner;
class Employee{
    int eno;
    String ename;
    int salary;

    Employee(int eno,String ename,int salary){
        this.eno=eno;
        this.ename=ename;
        this.salary=salary;
    }
    void display(){
        System.out.println("no:"+eno+"name: "+ename+"salary : "+salary);
    }
}
class employeeSearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of employees : ");
        int n=sc.nextInt();

        Employee arr[]=new Employee[n];

        for(int i=0;i<n;i++){

            System.out.println("enter employee details : "+(i+1)+":");

            System.out.print("enter employee id : ");
            int id=sc.nextInt();

            System.out.print("enter employee name : ");
            String name=sc.nextLine();

            System.out.print("enter salary : ");
            int salary=sc.nextInt();

            arr[i]=new Employee(id,name,salary);
            
        }
        boolean found=false;
        System.out.print("enter eno to search : " );
        int s_eno=sc.nextInt();
        for(Employee emp:arr){
            if(emp.eno==s_eno){
                found=true;
                System.out.println("employee found");
                emp.display();
                break;
            }
            if (!found) {
                System.out.println("Employee not found.");
                }
        }
    sc.close();
    }
}
