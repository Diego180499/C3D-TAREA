package org.example;

import java.util.ArrayList;

public class ParserUtils {

    private int contadorExpresiones;
    private ArrayList<Expresion> expresiones;

    public ParserUtils() {
        this.contadorExpresiones = 0;
        this.expresiones = new ArrayList<>();
    }

    public String guardarOperacion(String expr1, String expr2, String operador){

        if(!existeExpresion(expr1) && !existeExpresion(expr2)){
            expresiones.add(new Expresion("e"+contadorExpresiones++,expr1+operador+expr2));
            return expr1+operador+expr2;
        }

        if(existeExpresion(expr1) && !existeExpresion(expr2)){
            String nombreExpr1 = obtenerNombreExpresion(expr1);
            expresiones.add(new Expresion("e"+contadorExpresiones++,nombreExpr1+operador+expr2));
            return nombreExpr1+operador+expr2;
        }

        if(!existeExpresion(expr1) && existeExpresion(expr2)){
            String nombreExpr2 = obtenerNombreExpresion(expr2);
            expresiones.add(new Expresion("e"+contadorExpresiones++,expr1+operador+nombreExpr2));
            return expr1+operador+nombreExpr2;
        }

        if(existeExpresion(expr1) && existeExpresion(expr2)){
            String nombreExpr1 = obtenerNombreExpresion(expr1);
            String nombreExpr2 = obtenerNombreExpresion(expr2);
            expresiones.add(new Expresion("e"+contadorExpresiones++,nombreExpr1+operador+nombreExpr2));
            return nombreExpr1+operador+nombreExpr2;
        }

        return "";
    }


    public boolean existeExpresion(String expr){

        for(Expresion expresion : expresiones){
            if(expresion.getTextValue().equals(expr)){
                return true;
            }
        }

        return  false;
    }

    public String obtenerNombreExpresion(String expr){
        for(Expresion expresion : expresiones){
            if(expresion.getTextValue().equals(expr)){
                return expresion.getName();
            }
        }
        return "";
    }

    public String guardarExprFinal(String expr, String nombre){
        String nombreExprFinal = obtenerNombreExpresion(expr);
        expresiones.add(new Expresion(nombre,nombreExprFinal));
        return nombre+"="+nombreExprFinal;
    }


    public void mostrarC3D(){

        for(Expresion expresion : expresiones){
            System.out.println(expresion.getName()+" = "+expresion.getTextValue());
        }

    }



}
