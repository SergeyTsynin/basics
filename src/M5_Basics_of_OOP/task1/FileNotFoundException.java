package M5_Basics_of_OOP.task1;

public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException(String message) {
        super("File not found " + message);
    }

    public FileNotFoundException() {
        super("File not found");
    }
}
