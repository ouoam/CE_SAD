package creational;

public class XMLBookMetadataExporter extends BookMetadataExporter {
    public String getFileExtension() {
        return "xml";
    }

    public BookMetadataFormatter createFormatter() throws Exception {
        return new XMLBookMetadataFormatter();
    }
}
