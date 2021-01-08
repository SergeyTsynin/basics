package M5_Basics_of_OOP.task5.packs;

import M5_Basics_of_OOP.task5.exception.GiftPackingException;
import M5_Basics_of_OOP.task5.sweets.*;

public abstract class PackageForGift {
    /*
     * пакет полиэтиленовый
     * пакет бумажный
     * коробка картонная
     * ящик деревянный
     * вагон железнодорожный
     */
    private String name;
    private int maxWeight;
    private Sweet content;

    PackageForGift(String name, int maxWeight) {
        this.name = name;
        this.maxWeight = maxWeight;
        System.out.println("new " + name + " created");
    }

    public void packing(Sweet content) {
        if (isOverload(content)) {
            throw new GiftPackingException("Overload when packing " + content + " into " + this);
        }
        this.content = content;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    private boolean isOverload(Sweet content) {
        return content.getWeight() > maxWeight;
    }

    @Override
    public String toString() {
        return "PackageForGift{" +
                "name='" + name + '\'' +
                ", maxWeight=" + maxWeight +
                ", content=" + content +
                '}';
    }
}
