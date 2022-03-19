package creational;

import org.json.simple.JSONValue;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    protected ArrayList<HashMap<String, Object>> books;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        books = new ArrayList<>();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        HashMap<String, Object> book = new HashMap<>();
        book.put(Book.Metadata.ISBN.value, b.getISBN());
        book.put(Book.Metadata.TITLE.value, b.getTitle());
        book.put(Book.Metadata.PUBLISHER.value, b.getPublisher());

        ArrayList<String> authors = new ArrayList<>();
        Collections.addAll(authors, b.getAuthors());
        book.put(Book.Metadata.AUTHORS.value, authors);

        books.add(book);
        return this;
    }

    @Override
    public String getMetadataString() {
        return JSONValue.toJSONString(books);
    }
}
