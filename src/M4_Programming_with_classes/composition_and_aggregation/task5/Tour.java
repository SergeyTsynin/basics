package M4_Programming_with_classes.composition_and_aggregation.task5;

import java.util.Objects;

public class Tour {

    private String transportType;
    private boolean feed;
    private int numberOfDays;
    private int price;
    //    private User user;
    private TourType tType;

    public Tour(TourType tType, String transportType, boolean feed, int numberOfDays, int price) {

        this.transportType = Objects.requireNonNull(transportType);
        this.feed = feed;
        this.numberOfDays = numberOfDays;
        this.price = price;
        this.tType = tType;
    }

    @Override
    public String toString() {
        return this.tType.getType() +
                " {transportType='" + transportType + '\'' +
                ", feed=" + feed +
                ", numberOfDays=" + numberOfDays +
                ", price=" + price +
                ',';
    }
}
