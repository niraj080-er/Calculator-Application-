import java.util.Scanner;

public interface Calculator {
	int add(int a, int b);
}
public class CalculatorImpl implements Calculator {
	@Override
	public int add(int a, int b) {
        return a+b;
    }
}
public class DriverClass {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the two number a and b: ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println(calculator.add(a, b));

	}
}