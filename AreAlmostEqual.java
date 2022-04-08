class AreAlmostEqual {
     public boolean areAlmostEqual(String s1, String s2) {
         
        List<Integer> symbols = new ArrayList<>();
         
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) symbols.add(i);
			if (symbols.size() > 2) return false;
        }
         
        return symbols.size() == 0 || (symbols.size() == 2
                                 && s1.charAt(symbols.get(0)) == s2.charAt(symbols.get(1))
                                 && s1.charAt(symbols.get(1)) == s2.charAt(symbols.get(0)));
    }
}
