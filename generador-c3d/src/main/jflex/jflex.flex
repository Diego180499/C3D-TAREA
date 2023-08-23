package org.example;

import java_cup.runtime.*;

%%
%public
%class GeneradorLexer
%line
%column
%cup

digit = [0-9]
decimal = {digit}+(\.){digit}+
letter = [a-zA-Z]
identificador = {letter}({letter}|{digit})*
whitespace = [ \t\n\r]

%eofval{
    return symbol(ParserSym.EOF);
%eofval}

%{

      private Symbol symbol(int type){
          return new Symbol(type, yyline, yycolumn);
      }

      private Symbol symbol(int type, Object value){
                return new Symbol(type,yyline, yycolumn, value);
            }


%}

%%

("(")                                 {return symbol(ParserSym.PAR_A, yytext());}
(")")                                 {return symbol(ParserSym.PAR_C, yytext());}
(";")                                 {return symbol(ParserSym.PUNTO_COMA, yytext());}
("=")                                  {return symbol(ParserSym.IGUAL, yytext());}

("+")                                 {return symbol(ParserSym.MAS, yytext());}
("-")                                 {return symbol(ParserSym.MENOS, yytext());}
("*")                                 {return symbol(ParserSym.MULT, yytext());}
("/")                                 {return symbol(ParserSym.DIV, yytext());}



{identificador}                        {return symbol(ParserSym.ID, yytext());}
{digit}+                               {return symbol(ParserSym.DIGITO, yytext());}
{decimal}                              {return symbol(ParserSym.DECIMAL, yytext());}
{whitespace}                           {/* ignore */}
[^]                                    { /*CAPTURAR ERROR LEXICO*/ }