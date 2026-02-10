class Employee{
    String name;
    String job;
    double salary;
    double annual;
    Employee(String n,String j,double s){
        name=n;
        job=j;
        salary=s;
    }
    void updatesalary(){
         annual=salary*12;
    }




    void display(){
        System.out.println("Name :" + name);
        System.out.println("job :" + job);
        System.out.println("salary :" + salary);
        System.out.println("annual_salary :" + annual);


    }
    


}




public class employ {
    public static void main(String args[]){
        Employee e=new Employee("honey","developer",200000 );
        Employee e1=new Employee("miny","upsc",500000 );
        e.updatesalary();
        e1.updatesalary();
        e.display();
        e1.display();

    }
    
}
