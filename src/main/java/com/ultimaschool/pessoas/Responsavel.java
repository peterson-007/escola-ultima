package com.ultimaschool.pessoas;

import java.util.ArrayList;

public class Responsavel extends Pessoa {

    final int MESES = 12;
    private boolean[] pagamentos = new boolean[MESES];

    public Responsavel(String nome) {
        super(nome);
    }

    public boolean pagarMensalidade(int mes, boolean situacao){
        pagamentos[mes] = situacao;
        return situacao;
    }

    public boolean[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(boolean[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    @Override
    public String verSituacao(int mes) {
        if(getPagamentos()[mes]) {
            return "O pagamento foi realizado no mês " + mes ;
        }

        return "O pagamento não foi realizado no mês " + mes;
    }

    private String converteListaEmString(ArrayList<Integer> lista){
        String resultado = "";
        for(int l : lista){
            resultado +=  l + ", ";
        }
        return resultado;
    }

    private String mesesComPagamento(){
        ArrayList<Integer> listaMesesPagos = new ArrayList<Integer>();

        for(int mes = 1; mes < pagamentos.length; mes++){
            if(pagamentos[mes]){
                listaMesesPagos.add(mes);
            }
        }
        return  "Os meses com pagamento foram: " + converteListaEmString(listaMesesPagos);
    }

    @Override
    public String relatorio() {
        return "O responsável financeiro " + getNome() + " realizou o pagamento" + mesesComPagamento();
    }
}
