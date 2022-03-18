package creational;

import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void print(PrintStream stream) throws Exception {
        BookMetadataFormatter formatter = createFormatter();
        for (Book book : books) {
            formatter.append(book);
        }
        stream.print(formatter.getMetadataString());
    }

    public void export(String filename) {
        try {
            PrintStream printStream = new PrintStream(filename + "." + getFileExtension());
            print(printStream);
            printStream.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        } catch (Exception e) {
            System.err.print(e.getClass().getName());
            System.err.print(": ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public abstract String getFileExtension();
    public abstract BookMetadataFormatter createFormatter() throws Exception;
}
