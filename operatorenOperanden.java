public class operatorenOperanden {
    public static void main(String[] args) {
        double aa = 20;
        double bb = 15;
        int a = 20;
        int b = 15;
        int c = 16;
        int d = 2;
        int e = 8;
        int f = 12;
        int g = 3;

        double first = aa / bb;
        int second = a % b;
        int third = a++ + b;
        int fourth = c += d;
        boolean fifth =  e == e;
        boolean sixth = e > e;
        int seventh = f & g;
        int eighth= f | g;

        System.out.println("First"  + " " +  first);
        System.out.println("Second"  + " " + second );
        System.out.println("Third" + " " +  third);
        System.out.println("Fourth"  + " " +  fourth);
        System.out.println("Fifth"  + " " +  fifth);
        System.out.println("Sixth"  + " " +  sixth);
        System.out.println("Seventh"  + " " +  seventh);
        System.out.println("Eighth"  + " " +  eighth);

        // Zweite Teil

        boolean ab = true;
        boolean ba = false;
        boolean aba = ab && ba;
        boolean baa = ab ^ ba;
        System.out.println("Result AB" + " "  + aba);
        System.out.println("Result BA" + " "  + baa);
    }
}
