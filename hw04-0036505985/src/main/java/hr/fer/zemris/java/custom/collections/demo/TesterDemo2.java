package hr.fer.zemris.java.custom.collections.demo;

import hr.fer.zemris.java.custom.collections.ArrayIndexedCollection;
import hr.fer.zemris.java.custom.collections.Collection;
import hr.fer.zemris.java.custom.collections.LinkedListIndexedCollection;
import hr.fer.zemris.java.custom.collections.Tester;

/**
 * Demo program for {@link Collection#addAllSatisfying(Collection, Tester)}.
 * 
 * @author Luka Mesaric
 */
public class TesterDemo2 {

	public static void main(String[] args) {
		Collection<Integer> col1 = new LinkedListIndexedCollection<>();
		Collection<Integer> col2 = new ArrayIndexedCollection<>();

		col1.add(2);
		col1.add(3);
		col1.add(4);
		col1.add(5);
		col1.add(6);

		col2.add(12);
		col2.addAllSatisfying(col1, new EvenIntegerTester());

		col2.forEach(System.out::println);
	}

}
