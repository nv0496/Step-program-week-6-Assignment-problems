// File: BasicMath.java
class BasicMath {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a * b;
    }
}

// File: AdvancedMath.java
class AdvancedMath extends BasicMath {
    public int calculate(int a, int b, int c) {
        return a * b + c;
    }

    public double calculate(double a, double b, double c) {
        return a + b - c;
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Using BasicMath object:");
        BasicMath basic = new BasicMath();
        System.out.println("calculate(10, 5) = " + basic.calculate(10, 5));
        System.out.println("calculate(10.5, 5.5) = " + basic.calculate(10.5, 5.5));
        System.out.println();

        System.out.println("Using AdvancedMath object:");
        AdvancedMath advanced = new AdvancedMath();
        System.out.println("calculate(10, 5) = " + advanced.calculate(10, 5));
        System.out.println("calculate(10.5, 5.5) = " + advanced.calculate(10.5, 5.5));
        System.out.println("calculate(10, 5, 2) = " + advanced.calculate(10, 5, 2));
        System.out.println("calculate(10.5, 5.5, 2.0) = " + advanced.calculate(10.5, 5.5, 2.0));
    }
}