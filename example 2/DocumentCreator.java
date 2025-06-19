public class DocumentCreator {
    public static Document getDocument(String type) {
        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        } else if (type.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        } else {
            throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
