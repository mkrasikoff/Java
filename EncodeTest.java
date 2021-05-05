class EncodeTest {
	public static void main(String[] args) {
		String msg = "Mishanya";
		String encmsg = "";
		String decmsg = "";
		String key = "8symbols";
		int j;

		System.out.print("Исходное сообщение: ");
		System.out.println(msg);

		j = 0;
		for(int i = 0; i < msg.length(); i++) {
			encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
			j++;
			if(j == 8) j = 0;
		}
		System.out.print("Зашифрованное сообщение: ");
		System.out.println(encmsg);

		j = 0;
		for(int i = 0; i < msg.length(); i++) {
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
			j++;
			if(j == 8) j = 0;
		}
		System.out.print("Дешифрованное сообщение: ");
		System.out.println(decmsg);
	}
}