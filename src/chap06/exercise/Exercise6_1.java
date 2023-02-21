package chap06.exercise;

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public Student() {

    }

    public int getTotal() {
        return this.kor + this.eng + this.math;
    }

    public double getAverage() {
        return ((int) ((double) getTotal() / 3 * 10 + 0.5)) / 10.0;
    }

    public String info() {
        return this.name + ", " + this.ban + ", " + this.no + ", " + this.kor + ", "
                + this.eng + ", " + this.math + ", " + getTotal() + ", " + getAverage();
    }
}

public class Exercise6_1 {
}
