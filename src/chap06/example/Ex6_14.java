package chap06.example;

/**
 * initialization
 * 1. 초기화 우선 순위
 * 클래스 변수 -> 인스턴스 변수
 * 2. 초기화 순서
 * 자동 초기화 -> 명시적 초기화 -> 초기화 블럭 (인스턴스 변수 : 생성자)
 * 3. 초기화 블럭의 사용법
 */
public class Ex6_14 {
    static int sv = 7;
    int iv = 5;
    static {
        System.out.println("static { }");
        System.out.println("explicit init sv : " + sv);
        sv= 1;
        System.out.println("after static block init sv : " + sv);
    }

    {
        System.out.println("{ }");
        System.out.println("explicit init iv : " + iv);
        iv=1;
        System.out.println("after instance block init iv : " + iv);
    }

    public Ex6_14(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14();");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14();");
        Ex6_14 bt2 =new Ex6_14();
    }
}
