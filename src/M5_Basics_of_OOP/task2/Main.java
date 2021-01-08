package M5_Basics_of_OOP.task2;

public class Main {
    /*
     * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
     * нескольких товаров.
     */
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addNewProduct("Axe", 5, 2);
        payment.addNewProduct("Bow", 100, 1);
        payment.addNewProduct("Mug", 20, 42);

        payment.showProductsList();
        System.out.println("Total: " + payment.getTotalPrice());
    }
}
