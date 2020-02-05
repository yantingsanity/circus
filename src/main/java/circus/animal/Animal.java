package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {

    //this means that all subclasses need to have this method
    public abstract String speak();

}
