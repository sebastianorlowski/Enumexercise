import java.awt.*;


public class main {

    public static void main(String[] args) {
        for(TshirtSize tshirtSize : TshirtSize.values()) {
            System.out.println("Number of object: " + (tshirtSize.ordinal()+1));
            System.out.println("His name: " + tshirtSize.name());
            System.out.println("His height: " + tshirtSize.getHeight());
            System.out.println("His chest length: " + tshirtSize.getChestLength());
            System.out.println("His waist length: " + tshirtSize.getWaistLength());

        }
    }

}
