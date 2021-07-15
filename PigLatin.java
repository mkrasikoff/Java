public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder finalResult = new StringBuilder();
        if(str == "") return str + "ay";
System	
        for(String line: str.split("\\s+")) {
        	boolean mark = false;
          	String s = line.trim();
          	System.err.println("В текущей обработке строчка: line " + line + " и s "  + s + " + Текущая длина строки: " + s.length());
        	String firstLetter = "";
        	String punctuationMark = "";

        	while((s.charAt(s.length() - 1) >= '!' & s.charAt(s.length() - 1) <= '@') || (s.charAt(s.length() - 1) >= '[' & s.charAt(s.length() - 1) < 'a')) {
        		punctuationMark += s.charAt(s.length() - 1);
        		if(s.length() != 1) {
        			s = s.substring(0, s.length() - 1);
        		}
        		else {
        			mark = true;
        			finalResult.deleteCharAt(finalResult.length() - 1);
        			finalResult.append(" ");
        			for(int i = punctuationMark.length(); i > 0; i--) {
        				finalResult.append(punctuationMark.charAt(i - 1));
        			} 
        			finalResult.append(" ");
        			break;
        		}
        	}
        	if(mark) continue;
        	firstLetter += s.charAt(0);
        	s = s.substring(1, s.length());
        	s = s + firstLetter + "ay";
        	for(int i = punctuationMark.length(); i > 0; i--) {
        		s += punctuationMark.charAt(i - 1);
        	}        		
        	s += " ";
        	finalResult.append(s);
        }
        return finalResult.toString().trim();
    }
    public static void main(String[] args) {
    	System.out.println(pigIt("Pig latin is cool")); // need "igPay atinlay siay oolcay"
    	System.out.println(pigIt("This is my string")); // need "hisTay siay ymay tringsay"
    	System.out.println();
    	System.out.println(pigIt("latin is cool[]")); // need "siay oolcay[]"
    	System.out.println();

    	System.out.println();
    	System.out.println(pigIt("First latin    is cool[ ] man")); // need "siay oolcay[]"
    	System.out.println();

    }
}

/*

		assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));

        atinlay siay oolcay[] atinlay siay oolcay[ ]


        знаки препинания должны быть нетронуты

*/