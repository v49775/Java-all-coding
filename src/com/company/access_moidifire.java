package com.company;

class MyEmployee{
    private int id;
    private String name;
    public void setId(int n){
        this.id=n;
    }
    public int getId(){
        return id;
    }

    public void setName(String n) {
        this.name=n;
    }
    public String getName(){
        return name;
    }
}
public class access_moidifire {

    public static void main(String[] args) {
        MyEmployee v4 = new MyEmployee();
        //v4.id=10;
        //v4.name="vinayak"; // it is throws an error due to private access modifire
        //System.out.println("my name is "+ v4.name+ " and my id is "+ v4.id);
        v4.setName("vinayak");
        System.out.println(v4.getName());
        v4.setId(156);
        System.out.println(v4.getId());
    }
}

