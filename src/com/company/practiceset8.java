package com.company;
class Employee{
    int salary;
    String name;

    public int printSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}

class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFreind(){
        System.out.println("Calling to Abhijit...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length*breath);
    }
}

class Circle{
    int redius;
    Double pie=3.14;
    public Double area(){
        return pie*(redius*redius);
    }
    public Double perimeter(){
        return 2*pie*redius;
    }

}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
}

public class practiceset8 {
    public static void main(String[] args){
        // Quation 1: create a class Employee with following properties and method:
        /*  1. Salary (property) (int)
            2. getalary (method returning int)
            3. nmae (property) (String)
            4. getname (method returning String)
            4. setname (method changing name)

        Employee v4= new Employee();
        v4.setName("code with v");
        v4.salary=30000;
        //v4.name="Vinayak";
        int salary=v4.printSalary();
        String name=v4.getName();
        System.out.println(name);
        System.out.println(salary);

        // Quation 2: create a class CellPhone with method to print "Ringing... " , "Vibrating... " , etc..
        cellPhone vk=new cellPhone();
        vk.callFreind();
        vk.vibrate();
        vk.ring();

        // Quation 3: Create a clsss Square with method to initialise to its side,calculate area,perimeter.
        Square sq=new Square();
        sq.side=3;
        System.out.println("the area of Square is "+sq.area());
        System.out.println("the perimeter of Square is "+sq.perimeter());


        // Quation 4: create a class rectangle  with method to initialise to its side,calculate area,perimeter.
        Rectangle rect=new Rectangle();
        rect.length=5;
        rect.breath=3;
        System.out.println("the area of Rectangle is "+rect.area());
        System.out.println("the perimeter of Rectangle is "+rect.perimeter());



        // Quation 5: create a class Circle with method to initialise to its radius,calculate area,perimeter.
        Circle cr=new Circle();
        cr.redius=3;
        System.out.println("the area of circle is "+cr.area());
        System.out.println("the perimeter of circle is "+cr.perimeter());


        // Quation 6: Create a class TommyVecetti for Rockstar games capable of hitting (print hitting) , running , firng ,etc..
        Tommy player= new Tommy();
        player.hit();
        player.run();
        player.fire();


 */


    }
}
