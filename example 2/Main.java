public class Main {
    public static void main(String[] args) {
        Document wordDoc = DocumentCreator.getDocument("word");
        Document pdfDoc = DocumentCreator.getDocument("pdf");
        Document excelDoc = DocumentCreator.getDocument("excel");

        wordDoc.open();
        pdfDoc.open();
        excelDoc.open();
    }
}
