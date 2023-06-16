package casting;

class Mother19 {
    int x = 100;

    void m19() {
        System.out.println("부모클래스 m19() 메서드");
    }
}

class Child19 extends Mother19 {
    int x = 200;

    @Override
    void m19() {
        System.out.println("super.x=" + super.x);
        System.out.println("x=" + x + ",this.x=" + x);
    }
}

public class CastingEx19 {
    public static void main(String[] args) {
        Mother19 m19 = new Child19();
        m19.m19();
        System.out.println("m19.x=" + m19.x);
    }
}
