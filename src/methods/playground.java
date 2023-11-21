package methods;

public class playground {
//    Static
    static void greating (){
        System.out.println("Hello");
        System.out.println("Umur saya");
    }
//    non Static
    void example (){
        System.out.println("jayjay");
    }
    public static void main(String[] args) {
//        non static
        playground play = new playground();
        play.example();

//        static
        greating();
// math methode
        Math.max(5,10);

        System.out.println("hello");
        System.out.println(Math.max(5,8));
    }
}
