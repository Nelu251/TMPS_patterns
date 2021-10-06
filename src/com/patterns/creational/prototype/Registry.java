package com.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem (String type){
        Item item = null;

        try {
            item = (Item) (items.get(type).clone());
        }
        catch (CloneNotSupportedException cloneNotSupportedException){
            cloneNotSupportedException.printStackTrace();
        }

        return item;
    }
    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(25);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Potter");
        book.setNumberOfPages(500);
        book.setPrice(30);
        items.put("Book", book);
    }
}
