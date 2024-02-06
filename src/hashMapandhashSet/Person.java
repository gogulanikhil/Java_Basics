package hashMapandhashSet;

import java.util.Objects;

public class Person {

	public String name;
	public int voterId;

	public Person(String name, int voterId) {
		this.name = name;
		this.voterId = voterId;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", voterId=" + voterId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, voterId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && voterId == other.voterId;
	}
	
	
}
