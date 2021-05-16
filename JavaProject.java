// Программа, которая в документе .txt прочитала файл , отсортировала файл в алфавитном порядке и сохранила в новый файл
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

class FileReader {

	List<String> stringLines = new ArrayList<String>(); 
	Scanner inFile = new Scanner(new File("program.txt"));

	FileReader() throws FileNotFoundException {
	}

	public void useFile() {
		try {
			while(inFile.hasNextLine()) {
				String temporal = inFile.nextLine(); // добавь .trim() для обрезания пробелов
				stringLines.add(temporal);
			}
		}
		catch (Exception exc) {
			System.out.println("Файл назван некорректно или не сущетвует. Переменуйте файл в program.txt");
		}
		inFile.close(); // закрываем файл?(чтобы не тратил память)
	}

	public void printArrayList() {
		for(int i = 0; i < stringLines.size(); i++) {
			System.out.println(stringLines.get(i));
		}
	}

	public void sortArrayList() {
		Collections.sort(stringLines); // метод sort в пакете коллекций - String сортируются по алфавиту
	}

	public void saveToFile() throws IOException { 
		String fileName = "outputFile.txt";
		PrintWriter to_file = null;
		try {
			to_file = new PrintWriter(fileName);
			for(int i = 0; i < stringLines.size(); i++) { 
				to_file.println(stringLines.get(i));
			}
			to_file.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
}

class JavaProject {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader();
		fr.useFile();
		fr.printArrayList();

		System.out.println();

		fr.sortArrayList();
		fr.printArrayList();

		System.out.println();

		fr.saveToFile();
	}
}