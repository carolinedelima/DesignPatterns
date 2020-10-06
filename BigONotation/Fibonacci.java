class Fibonacci {

    public static void show() {
        int number = 7;
        System.out.println(fibonacci(number));
    }

    // O(2^N)
    public static int fibonacci(int number) {

        if (number <= 1) {
            return number;
        }

        return fibonacci(number - 2) + fibonacci(number - 1);
    }
}
