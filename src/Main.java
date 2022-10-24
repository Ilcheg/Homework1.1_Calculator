public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

        //������ �������������� (ArithmeticException) � ���, ��� ������ �� 0 ������.
        //������� ��������� �������� � ����� devide ������ Calculator, �� ��� � Integer ������ ������� ����� ������ �������?...
        //��� ����� ������� ����� ���:
//        int c = 0;
//        try {
//            c = calc.devide.apply(a, b);
//        } catch (ArithmeticException e) {
//            System.out.println("������ " + e);
//        }
    }
}