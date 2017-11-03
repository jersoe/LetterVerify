package com.jersoe.letterverify;

public class LetterVerify {

	public static void main(String[] args) {

		System.out.println("╔══════════════════╗");
		System.out.println("║   LetterVerify   ╟─┐");
		System.out.println("╠══════════════════╣ │");
		System.out.println("║                  ║ │");
		System.out.println("╚═╤════════════════╝ │");
		System.out.println("  └──────────────────┘");
		try {
			System.out.println("File: "+args[0]);
		}
			catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("No filename provided.");
			System.exit(0);
		}
		
		//Create new instance of TiffLetter from filename
		TiffLetter letter = new TiffLetter(args[0]);
		
		//Output image specs
		System.out.println("Width: "+letter.getWidth()+", Height: "+letter.getHeight());

		//Check if a given area is blank
		System.out.println("Area 0,0,100,100 is blank: " +letter.isAreaBlank(0, 0, 
				Math.min(letter.getWidth(), 100),
				Math.min(letter.getHeight(),100)));
	}

}
