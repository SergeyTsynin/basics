package M4_Programming_with_classes.composition_and_aggregation;

import M4_Programming_with_classes.composition_and_aggregation.task5.Tour;
import M4_Programming_with_classes.composition_and_aggregation.task5.TourType;

public class Package_tour {
    /*
     * Туристические путевки.
     * Сформировать набор предложений клиенту по выбору туристической путевки различного типа
     * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
     * Учитывать возможность выбора транспорта, питания и числа дней.
     * Реализовать выбор и сортировку путевок.
     */
    public static void main(String[] args) {
        Tour rt1 = new Tour(TourType.RELAXATION, "bus", true, 1, 2);
        System.out.println(rt1);
        Tour rt2 = new Tour(TourType.EXCURSION, "plane", false, 1, -50);
        System.out.println(rt2);
        Tour t2 = new Tour(TourType.HEALTH, "qq", true, 12, 55);
        System.out.println(t2);
    }

}
