public class person {

/** 
 * Michael Hailemariam
 * CSC 200
 * 5.2
 */

	private String name;

	private int age;

	public person() {

		name = "Nathan";

		age = 110;

	}

	public person(String name, int age) {

		this.name = name;

		this.age = age;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public String toString() {

		return this.name + " " + this.age;

	}

}
