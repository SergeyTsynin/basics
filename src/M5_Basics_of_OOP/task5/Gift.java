package M5_Basics_of_OOP.task5;

import M5_Basics_of_OOP.task5.exception.GiftPackingException;
import M5_Basics_of_OOP.task5.packs.PackageForGift;
import M5_Basics_of_OOP.task5.sweets.Sweet;

public class Gift {

    private Sweet sweet;
    private PackageForGift pack;

    Gift(Sweet sweet, PackageForGift pack) {
        this.sweet = sweet;
        this.pack = pack;

        System.out.println("creating done!");

        try {
            pack.packing(sweet);
            System.out.println("packing done!");
            System.out.println("completed: " + this.pack);
        } catch (GiftPackingException e) {
            System.out.println("error, can't pack: " + e);
        }
    }

    @Override
    public String toString() {
        return "Gift{" +
                "sweet=" + sweet +
                ", pack=" + pack +
                '}';
    }
}
