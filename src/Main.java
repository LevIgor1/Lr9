public class Main {
    public static void main(String[] args) {
        int variant = 7 % 5 + 1;
        System.out.println("Варіант: " + variant);
        Bird bird = new Bird("Ярослав");
        System.out.println(bird.fly());
    }
}