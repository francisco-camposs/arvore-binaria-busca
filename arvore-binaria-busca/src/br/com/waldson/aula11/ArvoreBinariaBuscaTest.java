package br.com.waldson.aula11;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ArvoreBinariaBuscaTest extends TestCase {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void deveEncontrarElemento() {
        //Arrange
        ArvoreBinariaBusca b = new ArvoreBinariaBusca();
        b.insert(10);
        b.insert(12);
        b.insert(9);

        //Act
        Node n = b.search(9);

        //Assert
        assertNotNull(n);
    }

    public void isEmptyDeveRetornarTrueSeNaoHouverElementos() {

        //arrange
        ArvoreBinariaBusca a = new ArvoreBinariaBusca();

        //act
        boolean b = a.isEmpty();

        assertTrue(b);

        //arrange
        a.insert(1);

        //assert
        assertFalse(a.isEmpty());
    }

    public void isnotemptydeveretornartruesenaohouverelementos() {
        //arrange
        ArvoreBinariaBusca a = new ArvoreBinariaBusca();
        a.insert(1);

        //act
        boolean b = a.isEmpty();
        assertFalse(b);

        a.


    }