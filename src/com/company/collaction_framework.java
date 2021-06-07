package com.company;

import java.util.*;


public class collaction_framework {
    public static void main(String [] args){
//        ArrayList<Integer> l1=new ArrayList<>();
//        ArrayList<Integer> l2=new ArrayList<>(5);
//        LinkedList<Integer> l1=new LinkedList<>();
//        LinkedList<Integer> l2=new LinkedList<>();
//        ArrayDeque<Integer> l1=new ArrayDeque<>();
//        ArrayDeque<Integer> l2=new ArrayDeque<>();
        HashSet<Integer> l1=new HashSet<>(6,0.5f);
        HashSet<Integer> l2=new HashSet<>(6,0.5f);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l2.add(18);
        l1.add(5);
        l1.add(8);
        l1.add(9);
        l1.add(5);
        l1.add(2);
        System.out.println(l1);
        System.out.println(l2);
/*
//        l1.add(0,6);
//        l1.add(0,3);
        l1.addAll(l2);
        l1.addLast(565);
        l1.addFirst(785);
//        System.out.println(l1.contains(5));
//        System.out.println(l1.indexOf(8));
//        l1.clear();
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.getFirst());
            System.out.print(", ");
        }
        System.out.println(l1.descendingIterator());
        System.out.println(l1.	getFirst());
        System.out.println(l1.	getLast());
//        System.out.println(l1.indexOf(17));
        System.out.println(l1.peekLast());
        System.out.println(l1.pollFirst());

 */
    }
}
