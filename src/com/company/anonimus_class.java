package com.company;
interface anonimus{
    void meth1();
    void meth2();
}
class anonimusDemo{

}


public class anonimus_class {
    public static void main(String[] args) {
        anonimus obj=new anonimus() {
            @Override
            public void meth1() {
                System.out.println("meth1");
            }

            @Override
            public void meth2() {
                System.out.println("meth1");
            }
        };
        obj.meth1();
    }
}
