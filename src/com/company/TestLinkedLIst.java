package com.company;

import java.util.*;

public class TestLinkedLIst {
    public static void main(String[] args)
    {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Mary");
                al.add("Lettie");
        al.add("Glo");

        Iterator<String> itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
