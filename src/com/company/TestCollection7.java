package com.company;

import java.util.*;

class Book
{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id,String name,String author,String publisher,int quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class TestCollection7 {
    public static void main(String[] args)
    {
        ArrayList<Book> al = new ArrayList<Book>();
        Book b1 =new Book(101,"the book","bdfhbh","sdfsdf",1);
        Book b2 = new Book(102,"jshdb","bhbshdhf","bdgbsgdf",3);
        Book b3 = new Book(102,"sbduh","hsbduhb","hsbudhbf",8);
        al.add(b1);
        al.add(b2);
        al.add(b3);
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            Book st = (Book)itr.next();
            System.out.println(st.id+" "+st.name+" "+st.author+" "+st.publisher+""+st.quantity);
        }
    }
}
