package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter {
    public String getFileExtension() {
        return "json";
    }

    public BookMetadataFormatter createFormatter() throws Exception {
        return new JSONBookMetadataFormatter();
    }
}
