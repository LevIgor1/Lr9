public abstract class Bird {
    private boolean canFly;

    // Конструктор
    public Bird(boolean canFly) {
        this.canFly = canFly;
    }

    // Get-метод для canFly
    public boolean canFly() {
        return canFly;
    }

    // Абстрактний метод, що демонструє здатність літати
    public abstract void fly();
}
