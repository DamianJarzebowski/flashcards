package com.example.flashcards.formatter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BasicTextFormatter implements TextFormatter{

    @Override
    public String format(String originalText) {
        return originalText;
    }
}
