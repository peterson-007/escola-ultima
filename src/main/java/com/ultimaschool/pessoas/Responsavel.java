package com.ultimaschool.pessoas;

public class Responsavel extends Pessoa {

    private boolean[] pagamentos = new boolean[12];

    public Responsavel(String nome) {
        super(nome);
    }

    public boolean pagarMensalidade(int mes, boolean situacao){
        //TODO implementar
        return false;
    }

    public boolean[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(boolean[] pagamentos) {
        this.pagamentos = pagamentos;
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
