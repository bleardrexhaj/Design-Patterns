package AbstractPattern;

public abstract class GiftItem {
    private String giftId;
    private String giftName;
    private String description;
    private String packagingType;
    private float packaging;

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public float getPackaging() {
        return packaging;
    }

    public void setPackaging(float packaging) {
        this.packaging = packaging;
    }

    public GiftItem(String packagingType) {
        this.packagingType = packagingType;
    }

    abstract void construct();
}
