// File: Food.java
abstract class Food {
    public final void prepare() {
        wash();
        cook();
        serve();
        System.out.println("Food preparation complete.\n");
    }

    protected abstract void wash();

    protected abstract void cook();

    protected abstract void serve();
}

// File: Pizza.java
class Pizza extends Food {
    @Override
    protected void wash() {
        System.out.println("Washing hands and ingredients for pizza.");
    }

    @Override
    protected void cook() {
        System.out.println("Baking pizza in the oven at 450F.");
    }

    @Override
    protected void serve() {
        System.out.println("Slicing and serving pizza hot.");
    }
}

// File: Soup.java
class Soup extends Food {
    @Override
    protected void wash() {
        System.out.println("Washing and chopping vegetables for soup.");
    }

    @Override
    protected void cook() {
        System.out.println("Simmering ingredients in a pot to make soup.");
    }

    @Override
    protected void serve() {
        System.out.println("Ladle soup into a bowl with a garnish.");
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Preparing a Pizza:");
        Food pizza = new Pizza();
        pizza.prepare();

        System.out.println("Preparing a Soup:");
        Food soup = new Soup();
        soup.prepare();
    }
}