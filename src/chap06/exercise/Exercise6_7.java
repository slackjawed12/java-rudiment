package chap06.exercise;


class Marine {
    int x = 0, y = 0;
    int hp = 60;
    int weapon = 6; // static

    int armor = 0;  // static

    // static method
    void weaponUp() {
        weapon++;
    }

    // static method
    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

public class Exercise6_7 {
}
