package ru.shil.springlearn;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Some classical music";
    }
}
