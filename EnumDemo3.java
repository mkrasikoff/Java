enum Transport {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); // каждая из этих констант перечисления - объект данного перечисления
	private int speed; // переменная экземпляра, она содержится в каждом объекте перечисления

	Transport(int s) { speed = s; } // конструктор перечисления
	
	int getSpeed() { return speed; } // метод перечисления
}

class EnumDemo3 {
	public static void main(String[] args) {
		Transport tp;	// когда переменная tp объявляется в методе мэин для каждой константы перечисления
						// автоматически вызывается конструктор Transport с аргументами указанными в перечислении

		System.out.println("Типичная скорость самолета: " + Transport.AIRPLANE.getSpeed() + " миль в час\n");

		System.out.println("Типичные скорости движения транспортных средств");

		for(Transport t : Transport.values()) System.out.println(t + ": " + t.getSpeed() + " миль в час");
	}
}