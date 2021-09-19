package com.company.model;

public class NullException extends RuntimeException {

    @Override
    public String getMessage() {
        return ("O campo não pode estar vazio. Insira uma informação condizente.");
    }
}
