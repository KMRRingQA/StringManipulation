package com.qa.main;

public class StringManipulation {
	public int howManyWords(String input) {
		int count = 1;
		if (input.equals("") || input.equals(" ")) {
			return 0;
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equals(" ")) {
				count++;
			}
		}
		return count;
	}

	public boolean isInput2inInput1(String input1, String input2) {
		if (input2.length() > input1.length()) {
			return false;
		} else {
			for (int i = 0; i <= (input1.length() - input2.length()); i++) {
				if (input1.substring(i, i + input2.length()).equals(input2)) {
					return true;
				}
			}
		}

		return false;
	}

	public void splitAndPrintVertically(String input) {
		String singleWord = "";
		for (int i = 0; i < input.length(); i++) {
			singleWord += input.substring(i, i + 1);
			if (input.substring(i, i + 1).equals(" ")) {
				System.out.println(singleWord);
				singleWord = "";
			}
		}
		System.out.println(singleWord);
	}

	public void splitandPrintVerticallyReverse(String input) {
		String singleWord = "";
		for (int i = input.length(); i > 0; i--) {
			singleWord += input.substring(i - 1, i);
			if (input.substring(i - 1, i).equals(" ")) {
				for (int j = singleWord.length() - 1; j > 0; j--) {
					System.out.print(singleWord.substring(j - 1, j));
				}
				System.out.println("");
				singleWord = "";
			}

		}
		for (int j = singleWord.length(); j > 0; j--) {
			System.out.print(singleWord.substring(j - 1, j));
		}
	}
}
