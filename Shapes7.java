class TwoDShape {
	private double width;
	private double height;

	// Базовый конструктор (по умолчанию)
	TwoDShape() {
		width = height = 0.0;
	}

	// Конструктор с 2 параметрами
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	// Конструктор с 1 параметром для двух переменных
	TwoDShape(double x) {
		width = height = x;
	}

	// Конструктор для создания объекта на основе другого объекта
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob. height;
	}

	// Методы доступа к переменным width и height
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		width = w;
	}
	void setHeight(double h) {
		height = h;
	}
	void showDim() {
		System.out.println("Ширина и высота - " + width + " и " + height);
	}
}
// Подкласс Triangle расширяет суперкласс TwoDShape
class Triangle extends TwoDShape {
	private String style;

	// Базовый конструктор подкласса (по умолчанию)
	Triangle() {
		super();
		style = "none";
	}

	Triangle(String s, double w, double h) {
		super(w, h);
		style = s;
	}

	Triangle(double x) {
		super(x);
		style = "закрашенный";
	}

	Triangle(Triangle ob) {
		super(ob);
		style = ob.style;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}
class Shapes7 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("контурный", 8.0, 12.0);
		Triangle t2 = new Triangle(t1);
		System.out.println("Информация о t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь - " + t1.area());
		System.out.println();
		System.out.println("Информация о t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Площадь - " + t2.area());
	}
}