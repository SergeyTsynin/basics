package M5_Basics_of_OOP.task1;

public class TextFile extends File {
    private StringBuilder content = new StringBuilder();

    public TextFile(String name, Directory directory) {
        super(name, directory);
    }

    public void addContent(String text) {
        super.isFileExistCheck();
        content.append(text);
    }

    public void displayContent() {
        super.isFileExistCheck();
        System.out.println(content);
    }
}
