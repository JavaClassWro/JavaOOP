public class Dog implements Animal {
    Dog(){}
    void Animal(){}
    public void sound() {
        System.out.println("Bark!");
    }
    public void sound(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Bark!");
        }
    }
}
