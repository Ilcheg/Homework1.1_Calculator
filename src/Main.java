public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

        //Ошибка арифметическая (ArithmeticException) в том, что делить на 0 нельзя.
        //Добавил тернарный оператор в метод devide класса Calculator, но там в Integer нельзя сделать чтобы ошибку выдавал?...
        //Или можно сделать такой код:
//        int c = 0;
//        try {
//            c = calc.devide.apply(a, b);
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка " + e);
//        }
    }
}