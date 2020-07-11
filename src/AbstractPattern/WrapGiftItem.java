package AbstractPattern;

public class WrapGiftItem extends GiftItem{
    public WrapGiftItem() {
        super("Wrap");
    }

    public WrapGiftItem(float packaging) {
        super("Wrap");
        this.setPackaging(packaging);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("This Item packaged by Gift Wrap");
    }
}
