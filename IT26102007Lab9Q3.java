public class IT26102007Lab9Q3 {
   
    public static int add(int a, int b) {
        return a + b;
    }

   
    public static int multiply(int a, int b) {
        return a * b;
    }

   
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int sum1 = add(term1, term2);
        int expr1Result = square(sum1);

        
        int part1 = square(add(4, 7));
        int part2 = square(add(8, 3));
        int expr2Result = add(part1, part2);

        System.out.println("Result of (3*4+5*7)^2 : " + expr1Result);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + expr2Result);
    }
}