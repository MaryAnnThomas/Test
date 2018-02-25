package com.company;

import java.*;
import java.util.Iterator;
import java.util.LinkedList;

class Book1
{
    int id;
    String name,author,publisher;
    int quantity;
    public Book1(int id,String name,String author,String publisher,int quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class TestLinkedList2 {
    public static void main(String arga[])
    {

        LinkedList<Book1> al = new LinkedList<Book1>();
        Book1 b1 = new Book1(1,"hbsd","sndh","gsdyg",8);
        Book1 b2 = new Book1(2,"nhsfhs","bsbdu","yvyvs",2);
        Book1 b3 = new Book1(3,"bshbc","buhdbu","hbhbsub",9);
        al.add(b1);
        al.add(b2);
        al.add(b3);
        Iterator<Book1> itr = al.iterator();
        while(itr.hasNext())
        {
            Book1 str = itr.next();
            System.out.println(str.id+" "+str.name+" "+str.author+" "+str.publisher+" "+str.quantity);
        }

    }
}
