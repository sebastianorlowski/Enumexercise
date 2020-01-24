import java.awt.*;

public enum TshirtSize implements Size {
    XS(40, 60,50),
    S (45, 65, 55),
    M (50, 70, 60),
    L(55, 75, 65),
    XL(60, 80, 70);

    private int height;
    private int chestLength;
    private int waistLength;

    TshirtSize(int height, int chestLength, int waistLength) {
    this.height = height;
    this.chestLength = chestLength;
    this.waistLength = waistLength;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getChestLength() {
        return chestLength;
    }

    public int getWaistLength() {
        return waistLength;
    }
}
