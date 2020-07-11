package AbstractPattern;

public class BagGiftItem extends GiftItem{

    public BagGiftItem() {
        super("Bag");
    }

    public BagGiftItem(float packaging) {
        super("Bag");
        this.setPackaging(packaging);
        construct();
    }


    @Override
    void construct() {
        System.out.println("This Item packaged by Gift Box");
    }
}
