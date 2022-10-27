public class DogRunner {
    public static void main(String [] args) {
        Dog dog1 = new Dog("Spot", 10, false);
        Dog dog2 = new Dog("Petunia", 12, true);
        Dog dog3 = new Dog("Lucky", 3, false);
        Dog dog4 = new Dog("Spot", 5, true);
        Dog dog5 = new Dog("Petunia", 12, true);
        Dog dog6 = dog1;
        Dog dog7 = dog2;
        Dog dog8 = dog6;

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);
        System.out.println(dog6);
        System.out.println(dog7);
        System.out.println(dog8);
    }
}
