// File: Tool.java
class Tool {
    public String publicField = "This is a public field.";
    protected String protectedField = "This is a protected field.";
    private String privateField = "This is a private field.";

    public String getPrivateField() {
        return privateField;
    }
}

// File: Hammer.java
class Hammer extends Tool {
    public void testAccessibility() {
        System.out.println("Hammer class (child) trying to access Tool class (parent) fields:");
        
        // Public field is accessible from anywhere.
        System.out.println("Public Field: " + publicField);
        
        // Protected field is accessible within the same package and by subclasses.
        System.out.println("Protected Field: " + protectedField);

        // Private field is not directly accessible. We need a public getter method.
        // System.out.println(privateField); // This would cause a compile-time error.
        System.out.println("Private Field (accessed via public getter): " + getPrivateField());
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        Hammer hammer = new Hammer();
        hammer.testAccessibility();
    }
}