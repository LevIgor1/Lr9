public class Parrot extends Bird{
    private String language;

    // Конструктор
    public Parrot(boolean canFly, String language) {
        super(canFly);
        this.language = language;
    }

    // Get-метод для language
    public String getLanguage() {
        return language;
    }

    // Метод, що демонструє здатність говорити
    public void speak() {
        System.out.println("Цей папуга говорить на " + language + " мові.");
    }

    // Реалізація абстрактного методу
    @Override
    public void fly() {
        if (canFly()) {
            System.out.println("Цей папуга може літати.");
        } else {
            System.out.println("Цей папуга не може літати.");
        }
    }
}
