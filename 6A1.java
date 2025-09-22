// File: Light.java
class Light {
    String type;
    String color;
    double wattage;

    Light() {
        this("Incandescent");
        System.out.println("Light() constructor called.");
    }

    Light(String type) {
        this(type, "White");
        System.out.println("Light(String) constructor called.");
    }

    Light(String type, String color) {
        this(type, color, 60.0);
        System.out.println("Light(String, String) constructor called.");
    }

    Light(String type, String color, double wattage) {
        this.type = type;
        this.color = color;
        this.wattage = wattage;
        System.out.println("Light(String, String, double) constructor called.");
    }

    public void display() {
        System.out.println("Type: " + type + ", Color: " + color + ", Wattage: " + wattage + "W");
    }
}

// File: LED.java
class LED extends Light {
    int lifespanHours;

    LED() {
        this("Cool White");
        System.out.println("LED() constructor called.");
    }

    LED(String color) {
        this(color, 50000);
        System.out.println("LED(String) constructor called.");
    }

    LED(String color, int lifespanHours) {
        super("LED", color, 10.0);
        this.lifespanHours = lifespanHours;
        System.out.println("LED(String, int) constructor called.");
    }

    public void display() {
        super.display();
        System.out.println("Lifespan: " + lifespanHours + " hours");
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a new Light object:");
        Light standardLight = new Light();
        standardLight.display();
        System.out.println();

        System.out.println("Creating a new LED object:");
        LED ledLight = new LED();
        ledLight.display();
        System.out.println();

        System.out.println("Creating another LED object with specific parameters:");
        LED specificLed = new LED("Warm White", 60000);
        specificLed.display();
    }
}