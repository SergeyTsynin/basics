package M5_Basics_of_OOP.task2;

import java.util.ArrayList;

class Payment {
    private Product product;
    private ArrayList<Product> products = new ArrayList<>();

    void addNewProduct(String name, int price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    void showTotal() {
        product.showInfo();
    }

    void showProduct(int productNumber) {
        products.get(productNumber).showInfo();
    }

    void showProductsList() {
        for (Product value : products) {
            value.showInfo();
        }
    }

    int getTotalPrice() {
        int result = 0;
        for (Product value : products) {
            result += value.getProductTotalPrice();
        }
        return result;
    }

    private class Product {
        private String name;
        private int price;
        private int quantity;

        Product(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        int getProductTotalPrice() {
            return price * quantity;
        }

        void showInfo() {
            System.out.println("Product: " + name + " price:" + price + " qty:" + quantity + " = " + getProductTotalPrice());
        }
    }
}
