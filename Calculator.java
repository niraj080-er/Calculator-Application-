public interface Calculator {
	int add(int a, int b);
}
public class CalculatorImpl implements Calculator {
	@Override
	public int add(int a, int b) {
        return a+b;
    }
}