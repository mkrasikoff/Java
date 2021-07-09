class QueueEmptyException extends Exception { // по сути - создаем новый класс ошибок, наследуюя Exception

	public String toString() { // Метод для того чтобы написать текст ошибки (?)
		return "\nОчередь пуста";
	}
}
