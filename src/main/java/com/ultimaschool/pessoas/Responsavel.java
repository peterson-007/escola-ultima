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
    //Alteração nos parâmetros do método utilizando 'int mes' para indicar o índice do array
    public void setPagamentos(int mes, boolean valor) {
        // Verifica se o índice do mês é válido (de 1 a 12)
        if (mes >= 1 && mes <= 12) {
            // Ajusta o índice do array, já que os meses são de 1 a 12
            int indiceDoArray = mes - 1;
            // Define o pagamento para o mês especificado
            pagamentos[indiceDoArray] = valor;
            System.out.println("Pagamento para o mês " + mes + " definido como: " + valor);
        } else {
            System.out.println("Mês inválido. Por favor, insira um valor entre 1 e 12.");
        }
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
