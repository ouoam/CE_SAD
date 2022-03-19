package creational;

public class YAMLBookMetadataExporter extends BookMetadataExporter {
    public String getFileExtension() {
        return "yaml";
    }

    public BookMetadataFormatter createFormatter() throws Exception {
        return new YAMLBookMetadataFormatter();
    }
}
