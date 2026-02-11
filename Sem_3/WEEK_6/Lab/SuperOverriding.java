class Box {
    public void pack() {
        System.out.println("Box is packed");
    }

    public void unpack() {
        System.out.println("Box is unpacked");
    }
}

class GiftBox extends Box {
    @Override
    public void pack() {
        super.pack(); // Call parent functionality
        System.out.println("Gift box decorated with ribbon");
    }

    @Override
    public void unpack() {
        super.unpack();
        System.out.println("Gift box opened with surprise inside");
    }
}

public class SuperOverriding {
    public static void main(String[] args) {
        GiftBox gift = new GiftBox();
        gift.pack();
        gift.unpack();
    }
}
