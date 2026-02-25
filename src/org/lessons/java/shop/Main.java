package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto Software = new Prodotto("ERP", "Software per gestione aziendale", 10000, 22);
        System.out.println(Software.PrezzoProdotto());
    }

}
