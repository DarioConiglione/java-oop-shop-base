package org.lessons.java.shop;

public class Prodotto {

    int codice;
    String nome;
    String descrizione;
    double prezzo;
    double iva;

    public Prodotto(int codice, String nome, String descrizione, double prezzo, double iva) {
        this.codice = codice;
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
        return codice + nome;
    }

}
