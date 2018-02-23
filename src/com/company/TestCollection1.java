package com.company;

import java.util.*;

public class TestCollection1 {
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mary");
        al.add("Lettie");
        al.add("Glo");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
