package com.company;
class cylender{
    private int radius;
    private int height;

    public cylender(int radius,int height){
        this.radius=radius;
        this.height=height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double SurfaceArea(){
//        return (2 * 3.14 * radius * radius) + (2 * 3.14 * radius * height);
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
        }

    public double SurfaceVolume(){
//        return 3.14 * radius * radius * height;
        return Math.PI * radius * radius * height;
    }


}
class rectangle{
    private int length;
    private int breadth;

    public rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere{
    private int radius1;
    public void setradius1(int radius1){
        this.radius1=radius1;
    }

    public int getradius1(){
        return radius1;
    }
    public double SareaSphere(){
        return 4 * Math.PI * radius1 * radius1;
    }
    public double volumeSp(){
        return (4 * Math.PI * radius1 * radius1 * radius1)/3;
    }
}


public class practiceset9_lon_access_modifire {
    public static void main(String[] args) {
//        quetion 1:create class cylender and use getter & setter for radius and height
//        cylender cy=new cylender();
//        cy.setHeight(10);
//        int h= cy.getHeight();
//        System.out.println(h);
//        cy.setRadius(5);
//        int r=cy.getRadius();
//        System.out.println(r);

//    quetion 2: use que 1 to calculate surface area and volume of the cylender
//        System.out.println(cy.SurfaceArea());
//        System.out.println(cy.SurfaceVolume());


////        use a constructor and repeat que 1
//        cylender mycy=new cylender(5,10);
//        System.out.println(mycy.getRadius());
//        System.out.println(mycy.getHeight());

//        overload a constructor use to initiate a ractangle of length 4 and breadth 5 for using custom parameter
//        rectangle r=new rectangle(50,20);
//        System.out.println(r.getBreadth());
//        System.out.println(r.getLength());
//

//        repeat for sphere
        Sphere sp=new Sphere();
        sp.setradius1(50);
        System.out.println(sp.getradius1());
        System.out.println(sp.SareaSphere());
        System.out.println(sp.volumeSp());






    }
}
