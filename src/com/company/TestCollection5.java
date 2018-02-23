package com.company;

import java.util.*;

public class TestCollection5 {
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mary");
        al.add("Lettie");
        al.add("GLo");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Mary");
        al2.add("Mekha");
        al.removeAll(al2);
        System.out.println("After removing ..");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
