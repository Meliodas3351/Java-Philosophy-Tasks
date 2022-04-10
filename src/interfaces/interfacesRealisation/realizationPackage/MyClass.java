package interfaces.interfacesRealisation.realizationPackage;

import interfaces.interfacesRealisation.interfacePackage.MyInterface;

public class MyClass implements MyInterface {

    @Override
    public void printIntegers(int... x) {
        for (int k : x) {
            System.out.print(k + "\t");
        }
    }

    @Override
    public void printStrings(String... s) {
        for (String k : s) {
            System.out.println(k);
        }
    }

    @Override
    public void printCharacters(char... c) {
        for (char k : c) {
            System.out.println(k + "\t");
        }
    }
}
