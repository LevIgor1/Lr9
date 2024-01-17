public class Main {
    public static void main(String[] args) {
        int variant = 7 % 5 + 1;
        System.out.println("Варіант: " + variant);
        System.out.println("Народився Ярослав");
        Bird bird = new Bird("Ярослав");
        System.out.println(bird.fly());
        System.out.println("Нарожився Гоша");
        Penguin bird1 = new Penguin("Гоша");
        System.out.println(bird1.fly());
        System.out.println(bird1.swim());
    }
}