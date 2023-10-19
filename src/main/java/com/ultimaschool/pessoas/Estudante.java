package com.ultimaschool.pessoas;

public class Estudante extends Pessoa {

    private String matricula;
    private double[] notas = new double[4];

    public Estudante(String nome) {
        super(nome);
    }

    public void consolidarNota(int unidade, double nota){
        //TODO implementar
    }

    public double calcularMediaFinal(){
        //TODO implementar
        return 0.0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String verSituacao(int mes) {
        return null;
    }

    @Override
    public String relatorio() {
        return null;
    }
}
