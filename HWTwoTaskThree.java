// Задание №3
    public class HWTwoTaskThree {
        public static void main(String[] args) {
            int a = 90;
            int b = 3;
            int[] abc = { 1, 2 };
            try {
                System.out.println(a / b);
                printSum(23, 2);
                abc[1] = 1;
            } catch (ArithmeticException ex) {
                System.out.println("Нельзя делить на 0 ");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера! ");
            }catch (Exception ex) {
                System.out.println("Что-то пошло не так ");
            }
        }

        public static void printSum(Integer a, Integer b){
            System.out.println(a + b);
        }

}

