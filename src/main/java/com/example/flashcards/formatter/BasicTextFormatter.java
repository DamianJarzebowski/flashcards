package com.example.flashcards.formatter;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("originalText")
public class BasicTextFormatter implements TextFormatter{

    @Override
    public String format(String originalText) {
        return originalText;
    }
}
