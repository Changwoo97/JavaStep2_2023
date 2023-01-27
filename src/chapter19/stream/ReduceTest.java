package chapter19.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;
// BinaryOperator : FunctionalInterface
class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) {
		int length1 = s1.getBytes().length;
		int length2 = s2.getBytes().length;
		return (length1 > length2) ? s1 : s2;
	}
}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = { "안녕하세요~~~~", "hello", "Good Morning", "점심시간^^" };
		
		// BinaryOperator의 apply
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			return s2;
		}));
	}
}
