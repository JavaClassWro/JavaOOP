public interface Animal {
    public void sound();
    static void staticMethod() {
        System.out.println("Hi from static!");
    }
    default void defaultMethod() {
        System.out.println("Hi from default!");
    }
}
