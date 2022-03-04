package sovos.calculadora.main;

import sovos.calculadora.main.dividir.Dividir;
import sovos.calculadora.main.multiplicar.Multiplicacao;
import sovos.calculadora.main.somar.Somar;
import sovos.calculadora.main.subtrair.Subtracao;

import java.util.Set;

public class Calculadora {
    public static void main(String[] args) {
        int soma;

        Somar somatoria = new Somar();
        System.out.println("-> Soma");
        somatoria.setNum1(2);
        somatoria.setNum2(8);
        somatoria.somarVal();
        System.out.println("Resultado da soma de atributos é :" + somatoria.getResult());
        somatoria.somarVal(1, 1);
        System.out.println("Resultado da soma por paramentros é :" + somatoria.getResult());
        System.out.println("Resultado da soma de paramentro e atributo é :" + somatoria.somarVal(1));
        System.out.println("");

        Calculadora calculadora = new Calculadora();
        System.out.println("-> Subtração");
        System.out.println("Resultado da Subtração por Atributos é: "+ calculadora.getSubAtr(2, 1));
        System.out.println("Resultado da Subtração por Parametros é: "+ calculadora.getSubParam(3, 1));
        System.out.println("Resultado da Subtração por Parametros e Atributos é: "+ calculadora.getSubParamAtr(4));
        System.out.println("");

        calculadora = new Calculadora();
        System.out.println("-> Divisao");
        System.out.println("Resultado da divisao por Atributos é: "+ calculadora.getDivAtr(10, 2));
        System.out.println("Resultado da divisao por Parametros é: "+ calculadora.getDivParam(20, 2));
        System.out.println("Resultado da divisao por Parametros e Atributos é: "+ calculadora.getDivParamAtr(22));
        System.out.println("");

        calculadora = new Calculadora();
        System.out.println("-> Multiplicação");
        System.out.println("Resultado da multiplicação por Atributos é: "+ calculadora.getMultAtr(2, 2));
        System.out.println("Resultado da multiplicação por Parametros é: "+ calculadora.getMultParam(3, 3));
        System.out.println("Resultado da multiplicação por Parametros e Atributos é: "+ calculadora.getMultParamAtr(4));
        System.out.println("");
    }

// SUBTRAÇÃO METHOD

    private int getSubAtr(int x, int y) {
        Subtracao sub = new Subtracao();
        sub.setNum1(x);
        sub.setNum2(y);
        sub.subitrair();
        return sub.getResult();
    }

    private int getSubParam(int x, int y) {
        Subtracao sub = new Subtracao();
        sub.subitrair(x, y);
        return sub.getResult();
    }

    private int getSubParamAtr(int x) {
        Subtracao sub = new Subtracao();
        sub.setNum2(1);
        return sub.subitrair(x);
    }


// DIVISAO METHOD

    private int getDivAtr(int x, int y) {

        Dividir dividir = new Dividir();
        dividir.setNum1(x);
        dividir.setNum2(y);
        dividir.divise();
        return dividir.getResult();
    }

    private int getDivParam(int x, int y) {
        Dividir dividir = new Dividir();
        dividir.divise(x, y);
        return dividir.getResult();
    }

    private int getDivParamAtr(int x) {
        Dividir dividir = new Dividir();
        dividir.setNum2(11);
        return dividir.divise(x);
    }

// MULTIPLICAÇAO METHOD

    private int getMultAtr(int x, int y) {
        Multiplicacao multip = new Multiplicacao();
        multip.setNum1(x);
        multip.setNum2(y);
        multip.mult();
        return multip.getResult();
    }

    private int getMultParam(int x, int y) {
        Multiplicacao multip = new Multiplicacao();
        multip.mult(x, y);
        return multip.getResult();
    }

    private int getMultParamAtr(int x) {
        Multiplicacao multip = new Multiplicacao();
        multip.setNum2(4);
        return multip.mult(x);
    }
}



















 /*   int resultado;

        Calculadora minhaCauculadora = new Calculadora();
        resultado = minhaCauculadora.num2 + minhaCauculadora.num9;
        System.out.println("O resultado da soma é: " + resultado);

        minhaCauculadora = new Calculadora(2, 4, 10);
        resultado = minhaCauculadora.num3 - minhaCauculadora.num1 - minhaCauculadora.num7;
        System.out.println("O resultado da subtração é: " + resultado);

        minhaCauculadora = new Calculadora();
        resultado = minhaCauculadora.num3 * minhaCauculadora.num9;
        System.out.println("O resultado da multiplicação é: " + resultado);

        minhaCauculadora = new Calculadora(10, 2);
        resultado = minhaCauculadora.num4 / minhaCauculadora.num8;
        System.out.println("O resultado da divisão é: " + resultado);

        minhaCauculadora = new Calculadora();
        minhaCauculadora.setnum2(50);
        minhaCauculadora.setnum5(45);
        minhaCauculadora.setnum6(5);

        resultado = minhaCauculadora.num2 + minhaCauculadora.num5 + minhaCauculadora.num6;
        System.out.println("O resultado da soma utilizando set é: " + resultado); */
