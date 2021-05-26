import static java.lang.Math.sqrt;	// обеспечение непосредственного доступа к этим методам через средства статического иморта
import static java.lang.Math.pow;	// то же самое

class Quadratic {
	public static void main(String[] args) {
		double a, b, c, x; // коэффициенты квадратного уравнения

		a = 4; // константы перед уравнением
		b = 1;
		c = -3;

		// поочередно ищем корни уравнения
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Первый корень: " + x);

		// второй корень
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Второй корень: " + x);
	}
}