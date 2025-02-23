class calc {

    public int subtract(int a, int b) {
        return a - b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public int subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}
class Prog4_4 {
    public static void main(String[] args) {
        calc calculator = new calc();
        
        int intResult = calculator.subtract(10, 5);
        System.out.println("10 - 5 = " + intResult);
        double doubleResult = calculator.subtract(10.5, 5.2);
        System.out.println("10.5 - 5.2 = " + doubleResult);
        int threeIntResult = calculator.subtract(20, 5, 3);
        System.out.println("20 - 5 - 3 = " + threeIntResult);
        int[] numbers = {50, 10, 5, 2};
        int arrayResult = calculator.subtract(numbers);
        System.out.println("50 - 10 - 5 - 2 = " + arrayResult);
    }
}