package javaleraning;

public class check {
	// Arithmetic Exception Handling
	void m() {
		int data = 50 / 0;
	}

	void P() {
		try {
			m();
		} catch (Exception e) {
			System.out.println("Normal flow");

		}

	}

	public static void main(String[] args) {
		check c = new check();
		c.P();

	}

}
