package class22;

public class FileTester {
    public static void main(String[] args) {
        File []file={
                new JavaFile(),
                new PdfFile(),
                new WordFile()
        };
        for (File f:file){
            f.close();
            f.edit();
            f.open();
        }
    }
}
