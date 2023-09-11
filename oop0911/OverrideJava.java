package oop0911;

public class OverrideJava {
    public static void main(String[] args) {

        ThirdClass thirdClass = new ThirdClass();
        thirdClass.method1();

    }
}

class ThirdClass extends SecondClass {
    
    @Override
    void method1() {
        System.out.println("Overriding method1 in Third Class");
    }
}

class SecondClass extends FirstClass {

    @Override
    void method1() {
        System.out.println("Overriding method1 in Second Class");
    }
}

class FirstClass {
    void method1() {
        System.out.println("This is method1");
    }

}
