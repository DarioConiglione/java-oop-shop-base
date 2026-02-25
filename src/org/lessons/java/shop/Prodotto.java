package org.lessons.java.shop;

public class Prodotto {

    int codice;
    String nome;
    String descrizione;
    double prezzo;
    double iva;

    Prodotto(int codice, String nome, String descrizione, double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

}
