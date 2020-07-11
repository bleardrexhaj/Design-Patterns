package AbstractPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GiftItem> giftItems = new ArrayList<>();
        giftItems.add(new BagGiftItem());
        giftItems.add(new WrapGiftItem());

        GiftPackFactory giftPack = GiftPackFactory.buildGiftPack("Business", giftItems);

        System.out.println("Total Package Price: " + giftPack.CalculateTotalPackaging());
    }
}
