package com.company;

import java.util.*;

public class TestCollection6 {
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mary");
        al.add("Lettie");
        al.add("Glo");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Mary");
        al2.add("Varkey");
        al.retainAll(al2);
        System.out.println("After retaining..");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
