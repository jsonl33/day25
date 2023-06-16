package casting;

class Mother18 {
    int a = 100;

    void m18() {
        System.out.println("부모클래스 메서드 m18()");
    }
}

class Child18 extends Mother18 {
    int a = 200;

    @Override
    void m18() {
        System.out.println("오버라이딩한 메서드");
    }
}

public class CastingEx18 {
    public static void main(String[] args) {
        Mother18 m = new Child18();// 업캐스팅
        m.m18();
        System.out.println(m.a);
        Child18 ch = (Child18) m;
        System.out.println(ch.a);
    }
}
