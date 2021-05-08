class ClassA {
	private final String value;
	public ClassA(String value) {
		this.value = value;
		System.out.println();
	}
}

public class ClassB extends ClassA {
	private final String value = new String();
	public ClassB() {
		super(value);
	}
	public static void main(String[] args) {
		ClassA var = new ClassB();
		System.out.println(var);
	}
}