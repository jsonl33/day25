package casting;

class Car {

}

class Truck extends Car {

}

public class CastingEx17 {
    public static void main(String[] args) {
        Truck t = new Truck();

        if (t instanceof Car) {
            System.out.println("업캐스팅이 가능하다.");
            Car c = t;// 업캐스팅
        }

        if (t instanceof Object) {
            System.out.println("Object 타입으로 업캐스팅이 가능하다.");
            Object obj = t;
        }

        Object obj2 = new Truck();
        if (obj2 instanceof Truck) {
            System.out.println("다운캐스팅이 가능하다");
            Truck t2 = (Truck) obj2;
        }

    }
}
