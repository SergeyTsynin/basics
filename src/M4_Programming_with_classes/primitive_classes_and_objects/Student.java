package M4_Programming_with_classes.primitive_classes_and_objects;

public class Student {
    /*
     * Создайте класс с именем Student, содержащий поля:
     * фамилия и инициалы, номер группы, успеваемость (массивиз пяти элементов).
     * Создайте массив из десяти элементов такого типа.
     * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
     */

    private String name = "nameless";
    private int groupNr = -1;
    private int[] rating = new int[5];

    public static void main(String[] args) {
        Student[] student = new Student[10];
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
        }

    }

    private boolean isRating9or10() {
        for (int value : rating) {
            if (value != 9 && value != 10) return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getGroupNr() {
        return groupNr;
    }
}
