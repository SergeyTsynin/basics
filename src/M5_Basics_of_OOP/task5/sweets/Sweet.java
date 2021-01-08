package M5_Basics_of_OOP.task5.sweets;

public abstract class Sweet {

    private String mark;
    private String name;
    private int weight;

    public Sweet(String mark, String name, int weight) {
        setMark(mark);
        setName(name);
        setWeight(weight);
        System.out.println("new " + mark + " " + name + " created");
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    private void setMark(String mark) {
        if (isValidString(mark)) {
            this.mark = mark;
        }
    }

    private void setName(String name) {
        if (isValidString(name)) {
            this.name = name;
        }
    }

    private void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    private boolean isValidString(String string) {
        return string != null && !string.isEmpty();
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "mark='" + mark + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
