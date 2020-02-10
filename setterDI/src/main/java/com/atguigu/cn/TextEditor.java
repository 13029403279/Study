package com.atguigu.cn;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(){
        System.out.println("TextEditor constructor");
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Set SpellChecker");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
