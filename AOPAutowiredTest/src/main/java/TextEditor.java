package com.tutorialspoint;
import org.springframework.beans.factory.annotation.Autowired;
import com.tutorialspoint.SpellChecker;


public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;


    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}