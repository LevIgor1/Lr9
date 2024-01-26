public class Penguin extends Bird{
    // Конструктор
    public Penguin() {
        super(false); // Пінгвіни не літають
    }

    // Метод, що демонструє здатність швидко бігати
    public void run() {
        System.out.println("Пінгвін вміє швидко бігати.");
    }

    // Реалізація абстрактного методу
    @Override
    public void fly() {
        System.out.println("Пінгвін не може літати.");
    }
}
