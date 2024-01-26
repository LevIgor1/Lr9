public class Main {
    public static void main(String[] args) {
        int variant = 7 % 5 + 1;
        System.out.println("Варіант: " + variant);
        Penguin penguin = new Penguin();
        Ostrich ostrich = new Ostrich();
        Parrot parrot = new Parrot(true, "англійській");

        penguin.run();
        ostrich.run();
        parrot.speak();

        // Виклик абстрактного методу
        penguin.fly();
        ostrich.fly();
        parrot.fly();

    }
}