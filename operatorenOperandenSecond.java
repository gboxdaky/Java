public class operatorenOperandenSecond {
    public static void main(String[] args) {
        operatorenOperanden();
    }
    public static void operatorenOperanden() {
        int a = 20;
        int b = 15;
        int c = 16;
        int d = 12;
        int e = 8;
        int f = 3;
        int g = 2;
        int first;
        first = a / b + b;
        int second;
        second = a % b % f;
        int third;
        third = a++ + b * g;
        int fourth;
        fourth = c += g + g;
        boolean fifth;
        fifth = e == e;
        boolean sixth;
        sixth = e > d - e;
        System.out.println("First"  + " " +  first);
        System.out.println("Second"  + " " + second );
        System.out.println("Third" + " " +  third);
        System.out.println("Fourth"  + " " +  fourth);
        System.out.println("Fifth"  + " " +  fifth);
        System.out.println("Sixth"  + " " +  sixth);
    }
}
