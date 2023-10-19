package com.ultimaschool.pessoas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponsavelTest {

    Responsavel responsavel1;
    Responsavel responsavel2;
    Responsavel responsavel3;

    @BeforeEach
    void setUp() {
        responsavel1 = new Responsavel("Amanda Costa");
        responsavel2 = new Responsavel("Paulo Araújo");
        responsavel3 = new Responsavel("Sandra Peixoto");

    }

    @Test
    void testGetPagamentos() {
        Assertions.assertNotNull(responsavel1.getPagamentos());
        Assertions.assertNotNull(responsavel2.getPagamentos());
        Assertions.assertNotNull(responsavel3.getPagamentos());
        responsavel1.pagarMensalidade(1, true);
        responsavel2.pagarMensalidade(2, false);
        responsavel3.pagarMensalidade(3, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[1], true);
        Assertions.assertEquals(responsavel2.getPagamentos()[2], false);
        Assertions.assertEquals(responsavel3.getPagamentos()[3], true);
        responsavel1.pagarMensalidade(4, true);
        responsavel2.pagarMensalidade(5, false);
        responsavel3.pagarMensalidade(6, true);
        Assertions.assertEquals(responsavel1.getPagamentos()[4], true);
        Assertions.assertEquals(responsavel2.getPagamentos()[5], false);
        Assertions.assertEquals(responsavel3.getPagamentos()[6], true);

    }

    @Test
    void testSetPagamentos() {
    }

    @Test
    void testPagarMensalidade() {
    }

    @Test
    void testVerSituacao() {
    }

    @Test
    void testRelatorio() {
    }

    @AfterEach
    void tearDown() {
        responsavel1 = null;
        responsavel2 = null;
        responsavel3 = null;
    }
}