public class Ostrich extends Bird{
    // Конструктор
    public Ostrich() {
        super(false); // Страуси не літають
    }

    // Метод, що демонструє здатність швидко бігати
    public void run() {
        System.out.println("Страус вміє швидко бігати.");
    }

    // Реалізація абстрактного методу
    @Override
    public void fly() {
        System.out.println("Страус не може літати.");
    }
}
