package M4_Programming_with_classes.primitive_classes_and_objects;

public class Customer {
    /*
     * Создать класс Customer, спецификация которого приведена ниже.
     * Определить конструкторы, set- и get- методы и метод toString().
     * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
     * Задать критерии выбора данных и вывести эти данные на консоль.
     *
     * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
     * Найти и вывести:
     * a) список покупателей в алфавитном порядке;
     * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
     */

    private int id;
    private static int ID;
    private String firstName;
    private String lastName;
    private String patronym;
    private String address;
    private int CardNr;
    private int accountNr;

    public Customer(String firstName, String lastName, String patronym, String address) {
        this.id = ID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronym = patronym;
        this.address = address;
        this.CardNr = -1;
        this.accountNr = -1;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNr() {
        return CardNr;
    }

    public void setCardNr(int cardNr) {
        CardNr = cardNr;
    }

    public int getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(int accountNr) {
        this.accountNr = accountNr;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronym='" + patronym + '\'' +
                ", address='" + address + '\'' +
                ", CardNr=" + CardNr +
                ", accountNr=" + accountNr +
                '}';
    }
}
