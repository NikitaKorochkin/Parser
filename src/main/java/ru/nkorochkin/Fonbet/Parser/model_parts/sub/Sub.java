package ru.nkorochkin.Fonbet.Parser.model_parts.sub;

import com.google.gson.annotations.SerializedName;
import ru.nkorochkin.Fonbet.Parser.model_parts.quote.Quote;

import java.util.List;

public class Sub {

    private String name;

    @SerializedName("quotes")
    private List<Quote> quoteList;

    public Sub(String name, List<Quote> quoteList) {
        this.name = name;
        this.quoteList = quoteList;
    }

    public List<Quote> getQuoteList() {
        return quoteList;
    }

    public void setQuoteList(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " " + quoteList + '\n';
    }
}
