// Задание №2
public class HWTwoTaskTwo {

    public static void main(String[] args) {
        int[] intArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        try {
            double catchedRes1 = intArray[23] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("Исключение деления на 0 " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Исключение выхода индекса за пределы массива " + e);
            }
    }
}