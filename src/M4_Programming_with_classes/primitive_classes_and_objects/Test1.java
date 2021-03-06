package M4_Programming_with_classes.primitive_classes_and_objects;

public class Test1 {
    /*
     * Создайте класс Test1 двумя переменными.
     * Добавьте метод вывода на экран и методы изменения этих переменных.
     * Добавьте метод, который находит сумму значений этих переменных,
     * и метод, который находит наибольшее значение из этих двух переменных.
     */

    private int variable1 = 0;
    private int variable2 = 0;

    private void printoutVariables() {
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
    }

    private void changeVariable1() {
        variable1 += 42;
    }

    private void changeVariable2() {
        variable2 = variable1 - 8;
    }

    private int getSumOfVariables() {
        return variable1 + variable2;
    }

    private int getTheGreatest() {
        if (variable1 == variable2) return 0;
        return variable1 > variable2 ? variable1 : variable2;
    }
}
