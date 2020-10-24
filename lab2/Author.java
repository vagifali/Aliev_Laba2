package ru.mirea.gib04.lab2;

import java.lang.*;
public class Author {
    private String author;
    private String name;
    private int page;
    public Author(String s, int i, String s1) {
        author = "Maxim Gorkiy";
        name = "The Lower Depths";
        page = 120;
    }
    public Author(int p) {
        author = "Alexandr Pushkin";
        name = "The tale of Tsar Saltany";
        page = p;
    }
    public Author(int p, String n) {
        author = "Fedor Dostoevsky";
        name = n;
        page = p;
    }
    public String getAuthor() { return author; }
    public int getPage() { return page; }
    public String getName() { return name; }
}