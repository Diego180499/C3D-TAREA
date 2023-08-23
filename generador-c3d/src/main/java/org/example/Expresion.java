package org.example;

public class Expresion {

    private String name;
    private String textValue;

    public Expresion(String name, String textValue) {
        this.name = name;
        this.textValue = textValue;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }
}
