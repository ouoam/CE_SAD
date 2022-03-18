package creational;

//import javax.xml.parsers.ParserConfigurationException;
//import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Current usage
//        BookMetadataFormatter formatter;
//        try {
//            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.JSON);
//            formatter.append(TestData.dragonBook);
//            formatter.append(TestData.dinosaurBook);
//            System.out.print(formatter.getMetadataString());
//        } catch (IOException | ParserConfigurationException e) {
//            e.printStackTrace();
//        }

        // Expected usage
        BookMetadataExporter exporter = new CSVBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export("Catalog");
    }
}
