package com.company;
class employee{
    int id;
    int salary;
    String name;
    public void printdtls(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getsalary(){
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args){
        System.out.println("code with v4");
        employee vinayak=new employee(); // object = instantiaton of employee class
        employee john=new employee(); // object = instantiaton of employee class
        // setting Attributes (properties) for vinayak
        vinayak.id=21;
        vinayak.salary=40000;
        vinayak.name="code with v4";

        // setting Attributes (properties) for john
        john.id=43;
        john.salary=34000;
        john.name="john cena";
        int salary=vinayak.getsalary();
        System.out.println("my salry is "+salary);

        vinayak.printdtls();
        john.printdtls();
        int salary1=john.getsalary();
        System.out.println("my salry is "+salary1);

        //System.out.println(vinayak.id);
        //System.out.println(vinayak.name);

    }
}
