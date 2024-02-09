package com.gl.assig2;

public class NoteCount {

	public void counting(int[] currency, int amount) {
		int notes[] = new int[currency.length];

		int sum = 0;
		for (int i = 0; i < notes.length; i++) {
			notes[i] = amount / currency[i];
			amount = amount % currency[i];
			sum += notes[i];
		}
		
        System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] != 0)
				System.out.println(notes[i] + " : " + currency[i]);
		}
		System.out.println("Total number of notes " + sum);

	}

}
