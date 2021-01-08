package M5_Basics_of_OOP.task1;

public class Main {
    /*
     * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
     * вывести на консоль содержимое, дополнить, удалить.
     */
    public static void main(String[] args) {

        TextFile file = new TextFile("text.txt", new Directory("A:\\fakepath\\"));
        System.out.println("File name: " + file.getName());
        file.rename("newName.txt");

        file.addContent("Lorem ipsum dolor sit amet...");

        file.displayContent();
        System.out.println("File name: " + file.getName());
        file.delete();
    }
}
