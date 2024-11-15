public class ArithmeticOperatorsDemo {

    public static void main (String args []){
        int x , y = 10 ,z = 5;
        x = y + z;
        System.out.println(" + operator result in "  + x);

        x = y - z;
        System.out.println("- operator result in " + x);

        x = y * z;
        System.out.println("*  operator result "  + x);

        x = y / z ;
        System.out.println(" / operator result "  + x);

        x = y % z ;
        System.out.println(" % operator result "  + x);

        x = y++;
        System.out.println(" postfix ++ operator result "  + x);

        x = ++z ;
        System.out.println(" prefix ++ operator result "  + x);

        System.out.println("unary operator resulted in "  + x );

        int tooBig = Integer.MAX_VALUE + 1;
        int tooSmall = Integer.MIN_VALUE - 1;
        System.out.println();

    }
}
