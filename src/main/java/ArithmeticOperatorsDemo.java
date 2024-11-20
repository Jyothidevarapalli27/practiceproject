public class ArithmeticOperatorsDemo {

    public static void main (String args []){
        int x , y = 10 ,z = 5;
        x = y + z;
        System.out.println("+ operator result in "  + x);

        x = y - z;
        System.out.println("- operator result in " + x);

        x = y * z;
        System.out.println("* operator result "  + x);

        x = y / z ;
        System.out.println("/ operator result "  + x);

        x = y % z ;
        System.out.println("% operator result "  + x);

        x = y++;
        System.out.println(" postfix ++ operator result "  + x);

        x = ++z ;
        System.out.println(" prefix ++ operator result "  + x);

        System.out.println("unary operator resulted in "  + x );
        /**
         * same example of special case
         */
        int tooBig = Integer.MAX_VALUE + 1; //-2147483648  which is
        // ALUEInteger Max_V
        int tooSmall = Integer.MIN_VALUE - 1; //2147483647 which is
        // ALUEInteger MIN_VALUE
        System.out.println("too big becomes" + tooBig);
        System.out.println("too small becomes" + tooSmall);
        System.out.println(4.0 / 00);
        System.out.println(-4.0 / 00);
        System.out.println(0.0 / 0.0);
        double d1 = 12 / 8; // result 1 by integer division.The value of d1 becomes 1.0.
        double d2 = 12.0f / 8;// result 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is  " + d2);
    }

}
