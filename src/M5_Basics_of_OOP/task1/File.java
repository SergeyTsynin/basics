package M5_Basics_of_OOP.task1;

public abstract class File {
    private Directory directory;
    private String name;
    private boolean isExist;

    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
        this.isExist = true;
    }

    public void rename(String name) {
        isFileExistCheck();
        this.name = name;
    }

    public void delete() {
        isFileExistCheck();
        isExist = false;
    }

    public String getName() {
        isFileExistCheck();
        return name;
    }

    private boolean isExist() {
        return isExist;
    }

    public void isFileExistCheck() {
        if (!isExist()) {
            throw new FileNotFoundException();
        }
    }

    public Directory getDirectory() {
        isFileExistCheck();
        return directory;
    }
}
