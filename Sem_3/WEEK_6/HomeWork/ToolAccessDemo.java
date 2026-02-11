class Tool {
    private String privateName = "PrivateTool";   // Only via getter
    protected String protectedName = "ProtectedTool"; // Accessible in child
    public String publicName = "PublicTool";      // Accessible everywhere

    public String getPrivateName() {
        return privateName;
    }
}

class Hammer extends Tool {
    public void showAccess() {
        // System.out.println(privateName); ❌ Not accessible directly
        System.out.println("Private (via getter): " + getPrivateName()); 
        System.out.println("Protected: " + protectedName); 
        System.out.println("Public: " + publicName); 
    }
}

public class ToolAccessDemo {
    public static void main(String[] args) {
        Hammer hammer = new Hammer();
        hammer.showAccess();
    }
}
