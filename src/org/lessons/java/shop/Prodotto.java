package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    int codice;
    String nome;
    String descrizione;
    double prezzo;
    double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {

        Random rand = new Random();
        this.codice = rand.nextInt(1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public double PrezzoProdotto() {
        return prezzo;
    }

    public double PrezzoConIva() {
        return prezzo + (prezzo * 0.22);
    }

    public String NomeCompleto() {
        return codice + "-" + nome;
    }

}
