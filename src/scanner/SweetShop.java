package scanner;


class Candy {
    static {
        System.out.println("3arpy3Ka класса Candy");
    }
}

class Gum {
    static {
        System.out.println("3arpy3Ka класса Gum");
    }
}

class Cookie {
    static {
        System.out.println("3arpy3Ka класса Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("B методе main");
        new Candy();
        //Gum gum = new Gum();
        System.out.println("nocne создания объекта Candy");
        try {
            Class class1 = Class.forName("scanner.Gum");
            System.out.println(class1.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("He удалось найти Gum");
            System.out.println("nocne вызова метода Class.forName(\"Gum\")");
            new Cookie();
            System.out.println("nocne создания объекта Cookie");
            Class.forName("scanner.Cookie");
        }
    }
}
