package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird) d;  // upcasting
        Animal a = (Animal) b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        train(new Parrot());
        //this became not allowed as we put an abstract in the circus.animal.Animal class
        //circus.animal.Animal a2 = new circus.animal.Animal(); //should only create Ducks or Parrots
        //circus.animal.Bird b2 = new circus.animal.Bird();
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck){
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
