package circus.animal;//If there is abstract, then don't have to implement all the methods
//that was inherited from the parent class.

public abstract class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }
}
