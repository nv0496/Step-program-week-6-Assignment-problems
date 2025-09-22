// File: Weather.java
class Weather {
    String condition;

    public Weather(String condition) {
        this.condition = condition;
    }

    public void describe() {
        System.out.println("The current weather is " + condition + ".");
    }
}

// File: Storm.java
class Storm extends Weather {
    String type;

    public Storm(String type) {
        super("stormy");
        this.type = type;
    }

    @Override
    public void describe() {
        System.out.println("There is a " + type + " storm.");
    }
}

// File: Thunderstorm.java
class Thunderstorm extends Storm {
    int lightningCount;

    public Thunderstorm(int lightningCount) {
        super("thunderstorm");
        this.lightningCount = lightningCount;
    }

    @Override
    public void describe() {
        System.out.println("A loud thunderstorm is occurring with " + lightningCount + " flashes of lightning.");
    }
}

// File: Sunshine.java
class Sunshine extends Weather {
    double uvIndex;

    public Sunshine(double uvIndex) {
        super("sunny");
        this.uvIndex = uvIndex;
    }

    @Override
    public void describe() {
        System.out.println("The sun is out. The UV index is " + uvIndex + ".");
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Weather System Hierarchy ---");

        Weather[] forecast = new Weather[4];
        forecast[0] = new Weather("partly cloudy");
        forecast[1] = new Storm("rain");
        forecast[2] = new Thunderstorm(15);
        forecast[3] = new Sunshine(8.5);

        for (Weather weather : forecast) {
            weather.describe();
        }
    }
}