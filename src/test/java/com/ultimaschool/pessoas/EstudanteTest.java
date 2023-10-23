package com.ultimaschool.pessoas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {

    Estudante estudante1;

    @BeforeEach
    void setUp() {
        estudante1 = new Estudante("João");
        estudante1.setMatricula("1111");
        estudante1.setNotas(1,9);
        estudante1.setNotas(2,7);
        estudante1.setNotas(3,8);
        estudante1.setNotas(4,6);
    }

    @Test
    void testGetMatricula() {
        String matricula = estudante1.getMatricula();
        System.out.println("Número da matrícula: " + matricula);
    }

    @Test
    void testSetMatricula() {
        estudante1.setMatricula("2222");
        System.out.println("Núemro da matrícula alterado: " + estudante1.getMatricula());
    }

    @Test
    void testGetNotas() {
        double[] notas = estudante1.getNotas();
        for (double nota: notas){
            System.out.println(nota);
        }
    }

    @Test
    void testSetNotas() {

        System.out.println("Notas antes de serem alteradas: ");
        double[] notas = estudante1.getNotas();
        for (double nota: notas){
            System.out.println(nota);
        }

        estudante1.setNotas(1,5);
        estudante1.setNotas(2,5);
        estudante1.setNotas(3,5);
        estudante1.setNotas(4,5);

        System.out.println("Notas depois de serem alteradas: ");
        notas = estudante1.getNotas();
        for (double nota: notas){
            System.out.println(nota);
        }

    }

    @Test
    void testConsolidarNota() {
        estudante1.consolidarNota(1,10);
        double[] notas = estudante1.getNotas();
        System.out.println(notas[0]);
    }

    @Test
    void testCalcularMediaFinal() {
        double media = estudante1.calcularMediaFinal();
        System.out.println("Média final do aluno: " + media);
    }

    @Test
    void testVerSituacao() {
        String situacao = estudante1.verSituacao(5);
        System.out.println(situacao);
    }

    @Test
    void testRelatorio() {
        String relatorio = estudante1.relatorio();
        System.out.println(relatorio);
    }

    @AfterEach
    void tearDown() {
    }
}