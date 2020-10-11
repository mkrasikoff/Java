enum Tools {
	SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

class Chapter12ex1 {
	public static void main(String[] args) {
		for(Tools d : Tools.values())
			System.out.println(d + "\n");
	}
}