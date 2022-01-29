package com.example.flashcards.crypto;

public interface CipherService {
    String encrypt(String text);
    String decrypt(String cipher);
}
