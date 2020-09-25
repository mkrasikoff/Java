package bookpack3;

class Book {
	private String title;
	private String author;
	private int pubDate;

	Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}
class BookDemo {
	public static void main(String args[]) {
		Book books[] = new Book[5];
		books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2014);
		books[1] = new Book("Java: The Complete Reference", "Schildt", 2014);
		books[2] = new Book("The Art of Java", "Schildt and Holmes", 2003);
		books[3] = new Book("Karamazov brothers", "Dostoevskiy", 1880);
		books[4] = new Book("Java: 22 Beginner's Guide", "Schildt", 2000);
		for(int i = 0; i < books.length; i++) books[i].show();
	}
}