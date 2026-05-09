enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    // Дополнительный метод перечисления
    public String action() {
        switch (this) {
            case RED:
                return "Стой";
            case YELLOW:
                return "Жди";
            case GREEN:
                return "Иди";
            default:
                return "";
        }
    }
}

public class Practice2 {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.GREEN;
        System.out.println(light.action());
    }
}
