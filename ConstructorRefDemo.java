interface MyFunc {
	MyClass func(String s);
}

class MyClass {
	private String str;

	MyClass(String s) { str = s; }

	MyClass() { str = ""; }

	String getStr() { return str; }
}

class ConstructorRefDemo {
	public static void main(String[] args) {

		MyFunc MyClassCons = MyClass::new; // короче суть в необычных свойствах функционального интерфейса. Когда мы что то вяжем с ним - мы используем :: а не .
										   // здесь мы передаем переменной ссылку на конструктор

		MyClass mc = MyClassCons.func("Тестирование"); // создать экземпляр MyClass посредством ссылки на конструктор

		System.out.println("Строка str в mc: " + mc.getStr());
	}
}