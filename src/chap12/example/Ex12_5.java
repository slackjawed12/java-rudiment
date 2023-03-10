package chap12.example;

enum Direction {EAST, SOUTH, WEST, NORTH}

public class Ex12_5 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");   // valueOf : 문자열로부터 참조 얻음
        Direction d3 = Enum.valueOf(Direction.class, "EAST");   // Enum static method
        // Direction d4 = Direction.valueOf("xxx");    // error : No enum constant
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1 == d2 ? " + (d1 == d2));
        System.out.println("d1 == d3 ? " + (d1 == d3));
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        // System.out.println("d2 > d3 ? " + (d2 > d3));
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3))); // 0 출력
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2))); // -2 출력

        switch (d1) {    // case 는 Direction.EAST 아님
            case EAST -> System.out.println("The direction is EAST.");
            case SOUTH -> System.out.println("The direction is SOUTH.");
            case WEST -> System.out.println("The direction is WEST.");
            case NORTH -> System.out.println("The direction is NORTH.");
            default -> System.out.println("Invalid direction");
        }

        Direction[] dArr = Direction.values(); // enum class values() : 배열
        for (Direction direction : dArr) {
            System.out.printf("%s=%d\n", direction.name(), direction.ordinal());
        }
    }
}
