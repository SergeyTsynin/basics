package M4_Programming_with_classes.composition_and_aggregation.task5;

public enum TourType {
    RELAXATION("Relaxation Tour"),
    EXCURSION("Excursion Tour"),
    HEALTH("Health Tour"),
    SHOPPING("Shopping Tour"),
    CRUISE("Cruise Tour"),
    OTHER("Other Tour");

    private final String type;

    TourType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
