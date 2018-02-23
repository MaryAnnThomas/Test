package com.company;

import java.util.*;

public class TestCollection4 {
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mary");
        al.add("Lettie");
        al.add("Glo");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Mekha");
        al2.add("Varkey");
        al.addAll(al2);
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

