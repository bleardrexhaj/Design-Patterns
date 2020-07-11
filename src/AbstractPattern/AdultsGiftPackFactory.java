package AbstractPattern;

import java.util.ArrayList;
import java.util.List;

public class AdultsGiftPackFactory extends GiftPackFactory {
    static GiftPackFactory buildGiftPack(List<GiftItem> giftItems) {
        GiftPackFactory giftPack = new GiftPackFactory();
        System.out.println("The customer places an order of type Adults Package");
        List<GiftItem> items = new ArrayList<>();
        for (GiftItem giftItem : giftItems) {
            GiftItem newGiftItem = null;
            switch (giftItem.getPackagingType()) {
                case "Bag":
                    newGiftItem = new BagGiftItem(0.00f);
                    break;

                case "Box":
                    newGiftItem = new BoxGiftItem(0.25f);
                    break;

                case "Wrap":
                    newGiftItem = new WrapGiftItem(0.00f);
                    break;

                default:
                    break;

            }
            items.add(newGiftItem);
        }

        giftPack.setGiftItems(items);

        return giftPack;
    }

}
