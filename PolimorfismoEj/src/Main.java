import dinamico.Animal;
import dinamico.Bear;
import dinamico.Giraffe;
import estatico.Calculator;

public class Main {
    public static void main(String[] args) {
            Animal obj = new Bear();
            obj.food();
            Animal obj2 = new Giraffe();
            obj2.food();
            Animal obj3 = new Animal();
            obj3.food();
        System.out.println("============================");

        Calculator clc = new Calculator();
        System.out.println(clc.add(2,4));
        System.out.println(clc.add(3,6,8));
        System.out.println(clc.add(3.2,1.5));
        }
        }