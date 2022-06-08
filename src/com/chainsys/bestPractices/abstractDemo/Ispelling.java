package com.chainsys.bestPractices.abstractDemo;

public interface Ispelling {
	void spellCheck(String word); // must be implemented by all language

	void checkGrammer(String sentence); // must be implemented by all language

	int wordCount(String sentence); // the logic is the same for all language

}

abstract class Language implements Ispelling {
	@Override
	public int wordCount(String sentence) {
		String[] words = sentence.split(" ");
		return words.length;
	}
}

class EnglishLanguage extends Language implements Ispelling {
	@Override
	public void spellCheck(String word) {
		System.out.println("English Spellchecker");
	}

	@Override
	public void checkGrammer(String sentence) {
		System.out.println("English checkgrammer");
	}

	@Override
	public int wordCount(String sentence) {
		String[] words = sentence.split(" ");
		return words.length;

	}
}

class FrenchLanguage extends Language implements Ispelling {
	@Override
	public void spellCheck(String word) {
		System.out.println("English Spellchecker");
	}

	@Override
	public void checkGrammer(String sentence) {
		System.out.println("English checkgrammer");
	}

	@Override
	public int wordCount(String sentence) {
		String[] words = sentence.split(" ");
		return words.length;

	}
}

class TamilLanguage extends Language implements Ispelling {
	@Override
	public void spellCheck(String word) {
		System.out.println("English Spellchecker");
	}

	@Override
	public void checkGrammer(String sentence) {
		System.out.println("English checkgrammer");
	}

	@Override
	public int wordCount(String sentence) {
		String[] words = sentence.split(" ");
		return words.length;

	}
}
