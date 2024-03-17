public class genmeth<T extends Number> {

    // Generic method disp to accept two values of type T and display their sum
    public void disp(T value1, T value2) {
        double sum = value1.doubleValue() + value2.doubleValue();
        System.out.println("Sum of values: " + sum);
    }

    public static void main(String[] args) {
        genmeth<Integer> intTest = new genmeth<>();
        intTest.disp(10, 20); // Calling disp with two Integer values

        genmeth<Double> doubleTest = new genmeth<>();
        doubleTest.disp(3.5, 7.8); // Calling disp with two Double values
    }
}
