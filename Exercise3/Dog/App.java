public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Chusky myPet = new Chusky();

        myPet.bark();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.height);
    }
}