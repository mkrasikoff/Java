import java.util.*;

public class ClassSaveKey{ 

    private HashBasedTable<String, String, String> languageTable = HashBasedTable.create(); 

    public static void main(String[] args) { 
        //первоначальные данные 
        setText("Object-oriented programming language", "1990", "Python"); 
        setText("Object-oriented programming language", "1995", "Java"); 
        setText("Functional programming language", "2005", "F#"); 

        //вывод в консоль 
        System.out.println("Языки: " + languageTable.row("Object-oriented programming language")); 
        System.out.println("Ключи строк: " + languageTable.rowKeySet()); 
        System.out.println("Структура относительно столбцов: " + languageTable.columnMap()); 
        System.out.println("Получение значения с использованием ключа столбца и строки: " + languageTable.column("2005").get("Functional programming language")); 

    } 
    private static void setText(String rowStr, String keyStr, String text) { 
        languageTable.put(rowStr, keyStr, text); 
    } 
} 

// some changes for git course
