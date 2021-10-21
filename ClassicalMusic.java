package ru.mkrasikoff.springproject;

public class ClassicalMusic implements Music {
	
    @Override
    public String getSong() {
		
        return "Hungarian Rapsody";
    }

    public void init() {
		
        System.out.println("doing my initialization in classicalmusic");
    }

    public void destroy() {
		
        System.out.println("doing my destroying in classicalmusic");
    }
}
