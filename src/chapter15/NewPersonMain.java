package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class NewPersonMain {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("chapter15.Person");
		System.out.println(pClass);
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		// String str;
		Class sClass = Class.forName("java.lang.String");
		System.out.println(sClass);

		Constructor[] cons = sClass.getConstructors();
		for (var con : cons) {
			System.out.println(con);
		}
		System.out.println();
		
		Field[] fields = sClass.getFields();
		for (var field : fields) {
			System.out.println(field);
		}
		System.out.println();
		
		Method[] methods = sClass.getMethods();
		for (var method : methods) {
			System.out.println(method);
		}
		System.out.println();
		
		String str = "Have,a,nice,day";
		
		// Tokenizer
		// String Tokenizer(1, 2, 3)
		// 1 : 사용할 String 문자열
		// 2 : 분리하는 기준
		// 3 : 자르는 기준을 표시할건지 여부
		StringTokenizer obj = new StringTokenizer(str, ",", false);
		while (obj.hasMoreTokens()) {
			String t = obj.nextToken();
			System.out.println(t);
		}
	}
}
