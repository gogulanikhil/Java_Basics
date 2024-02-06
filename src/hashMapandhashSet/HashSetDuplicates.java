package hashMapandhashSet;

import java.util.HashSet;

public class HashSetDuplicates {

	public static void main(String[] args) {
		HashSet<Person> list = new HashSet<>();

		System.out.println(list.add(new Person("nikhil", 2345)));
		list.add(new Person("akhil", 4356));
		list.add(new Person("person1", 4561));
		System.out.println(list.add(new Person("nikhil", 2345)));

		System.out.println(list);
	}
}
