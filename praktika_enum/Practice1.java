enum Season {
    // Инициализация элементов перечисления через конструктор
    WINTER("Зима", 3),
    SPRING("Весна", 3),
    SUMMER("Лето", 3),
    AUTUMN("Осень", 3);

    private final String title;
    private final int months;

    Season(String title, int months) {
        this.title = title;
        this.months = months;
    }

    public String getTitle() {
        return title;
    }

    public int getMonths() {
        return months;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Season season = Season.SUMMER;

        System.out.println(season.getTitle());
        System.out.println(season.getMonths());
    }
}
