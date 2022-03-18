package creational;

public class CSVBookMetadataExporter extends BookMetadataExporter {
    public String getFileExtension() {
        return "csv";
    }

    public BookMetadataFormatter createFormatter() throws Exception {
        return new CSVBookMetadataFormatter();
    }
}
