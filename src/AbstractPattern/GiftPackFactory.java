package AbstractPattern;

import java.util.List;

public class GiftPackFactory {
    private List<GiftItem> giftItems;
    private Address shippingAddress;
    private String packType;

    public List<GiftItem> getGiftItems() {
        return giftItems;
    }

    public void setGiftItems(List<GiftItem> giftItems) {
        this.giftItems = giftItems;
    }

    static GiftPackFactory buildGiftPack(String packType, List<GiftItem> giftItems) {
        GiftPackFactory giftPack = new GiftPackFactory();

        switch (packType) {
            case "Business":
                giftPack = BusinessGiftPackFactory.buildGiftPack(giftItems);
                break;

            case "Adults":
                giftPack = AdultsGiftPackFactory.buildGiftPack(giftItems);
                break;

            case "Kids":
                giftPack = KidsGiftPackFactory.buildGiftPack(giftItems);
                break;

            default:
                break;

        }

        return giftPack;
    }

    public float CalculateTotalPackaging() {
        return (float) getGiftItems().stream().mapToDouble(GiftItem::getPackaging).sum();
    }

}
