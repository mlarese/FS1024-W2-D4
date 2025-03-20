package it.epicode.libri;

import java.util.Objects;

public class Libro {
    private String titolo;
    private int annoPubblicazione;
    private Autore autore;
    private CasaEditrice casaEditrice;
    private double prezzo;
    private int numeroPagine;

    public Libro(String titolo, int annoPubblicazione, Autore autore, CasaEditrice casaEditrice, double prezzo, int numeroPagine) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.autore = autore;
        this.casaEditrice = casaEditrice;
        this.prezzo = prezzo;
        this.numeroPagine = numeroPagine;
    }

    public Libro() {
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public CasaEditrice getCasaEditrice() {
        return casaEditrice;
    }

    public void setCasaEditrice(CasaEditrice casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }



    // per il confronto e inserimento in un hashmap bisogna definire sia equals che hashcode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return annoPubblicazione == libro.annoPubblicazione && Double.compare(prezzo, libro.prezzo) == 0 && numeroPagine == libro.numeroPagine && Objects.equals(titolo, libro.titolo) && Objects.equals(autore, libro.autore) && Objects.equals(casaEditrice, libro.casaEditrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, annoPubblicazione, autore, casaEditrice, prezzo, numeroPagine);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", autore=" + autore +
                ", casaEditrice=" + casaEditrice +
                ", prezzo=" + prezzo +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
