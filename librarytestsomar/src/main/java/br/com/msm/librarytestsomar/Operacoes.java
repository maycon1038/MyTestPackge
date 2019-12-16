package br.com.msm.librarytestsomar;

public class Operacoes {

    private float resultado;
    private float entrada1;
    private float entrada2;


    public  Operacoes(float entrada1, float entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;
    }

    public void somar(OperationSoma i){

        resultado =  entrada1 + entrada2;

        i.setSoma(resultado);


    }

    public void diminuir(OperationSoma i){

        resultado =  entrada1 - entrada2;

        i.setSoma(resultado);


    }
    public void multiplicar(OperationSoma i){

        resultado =  entrada1 * entrada2;

        i.setSoma(resultado);


    }
    public void dividir(OperationSoma i){

        resultado =  entrada1 / entrada2;

        i.setSoma(resultado);


    }

    public interface  OperationSoma{

        public void  setSoma(float resultado0);
    }
}
