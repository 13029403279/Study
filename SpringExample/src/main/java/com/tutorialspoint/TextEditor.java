package com.tutorialspoint;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;
    private int id;
    public TextEditor(SpellChecker spellChecker,String name,int id){
        this.spellChecker=spellChecker;
        this.name=name;
        this.id=id;
        System.out.println("TextEditor constructor");
    }

    public void spellCheck(){
        spellChecker.checkSpell();
    }
}
