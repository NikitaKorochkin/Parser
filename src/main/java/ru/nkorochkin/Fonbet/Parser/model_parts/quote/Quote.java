package ru.nkorochkin.Fonbet.Parser.model_parts.quote;

public class Quote {

    private String name;
    private double quote;

    public Quote(String name, double quote) {
        this.name = name;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuote() {
        return quote;
    }

    public void setQuote(double quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return " Ставка '" + name + '\'' +
                " Коэф." + quote;
    }
}
