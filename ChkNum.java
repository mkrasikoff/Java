class ChkDemo {
	boolean isEven(int x) {
		if ((x % 2) == 0) return true;
		else return false;
	}
}

class ChkNum {
	public static void main(String[] args) {
		ChkDemo e = new ChkDemo();
		if (e.isEven(10)) System.out.println("10 - четное число");
		if (e.isEven(9)) System.out.println("9 - четное число");
		if (e.isEven(8)) System.out.println("8 - четное число");
		if (e.isEven(7)) System.out.println("7 - четное число");
		if (e.isEven(6)) System.out.println("6 - четное число");
		if (e.isEven(5)) System.out.println("5 - четное число");
		if (e.isEven(4)) System.out.println("4 - четное число");
		if (e.isEven(3)) System.out.println("3 - четное число");
		if (e.isEven(2)) System.out.println("2 - четное число");
		if (e.isEven(1)) System.out.println("1 - четное число");
	}
}