abstract class TwoDShape {
	private double width;
	private double height;
	private String name;

	// Конструктор по умолчанию
	TwoDShape() {
		width = height = 0.0;
		name = "none";
	}

	// Параметризированный конструктор
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	// Ширина и высота одинаковы
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}

	// Создать один объект на основе другого
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}

	// Методы доступа к переменным экземпляра
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }

	String getName() { return name; }

	// dimension - размер
	void showDim() {
		System.out.println("Ширина и высота - " + width + " и " + height);
	}

	abstract double area();
}

class Triangle extends TwoDShape {
	private String style;

	Triangle() {
		super();
		style = "none";
	}

	Triangle(String s, double w, double h) {
		super(w, h, "треугольник");
		style = s;
	}

	Triangle(double x) {
		super(x, "треугольник");
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
		System.out.println("Треугольника " + style);
	}
}

class Rectangle extends TwoDShape {
	Rectangle() {
		super();
	}

	Rectangle(double w, double h) {
		super(w, h, "прямоугольник");
	}

	Rectangle(double x) {
		super(x, "прямоугольник");
	}

	Rectangle(Rectangle ob) {
		super(ob);
	}
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}

	double area() {
		return getWidth() * getHeight();
	}
}
class AbstractShape {
	public static void main(String [] args) {
		TwoDShape shapes[] = new TwoDShape[4]; // это возможно - так как это не объект - а объектная ссылка

		shapes[0] = new Triangle("контурный", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);

		for(int i = 0; i < shapes.length; i++) {
			System.out.println("Обьект - " + shapes[i].getName());
			System.out.println("Площадь - " + shapes[i].area());
			System.out.println();
		}
	}
}