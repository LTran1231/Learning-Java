public class objectoriented {
    public static void main(String[] args) {
//        myDog is reference varible not an object
        Dog myDog = new Dog();
        Dog yourDog = new Dog();
        myDog.size = 50;
        yourDog.size = 15;
        myDog.bark();
        yourDog.bark();
        yourDog = myDog;
        myDog.bark();
        yourDog.bark();
        yourDog.size = 10;
        myDog.bark();
        
    }
    
}
//