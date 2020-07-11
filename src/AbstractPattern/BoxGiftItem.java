package AbstractPattern;

public class BoxGiftItem extends GiftItem {
    public BoxGiftItem(float v) {
        super("Box");
        this.setPackaging(v);
        construct();
    }

    @Override
    void construct() {
        System.out.println("This Item packaged by Gift Box");
    }
}
