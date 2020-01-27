package creational.abstractFactory.banking;

import creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("java dev writes Java code");
    }
}
