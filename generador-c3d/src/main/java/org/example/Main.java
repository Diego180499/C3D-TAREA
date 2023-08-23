package org.example;

import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws Exception {

        String cadena = "z = 2+(5*2)-5; x = 5-(8+2/2)-10; y = 2+edad*(5+2)-edad2 ;";
        GeneradorLexer calcLexer = new GeneradorLexer(new StringReader(cadena));

        Parser parser = new Parser(calcLexer);
        parser.parse();

    }
}