package Decorator;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RoupaTest {

    @Test
    void deveRetornarValorCamisaSemPersonalizacao() {
        Roupa roupa = new Camisa(109.9f);

        assertEquals(109.9f, roupa.getValorRoupa());
    }

    @Test
    void deveRetornarValorCamisaComPersonalizacao() {
        Roupa roupa = new CamisaPersonalizada(new Camisa(109.9f));

        assertEquals(139.9f, roupa.getValorRoupa());
    }

    @Test
    void deveRetornarNomeCamisaSemPersonalizacao() {
        Roupa roupa = new Camisa();

        assertEquals("Camisa sem personalização", roupa.getNomeRoupa());
    }

    @Test
    void deveRetornarNomeCamisaComPersonalizacao() {
        Roupa roupa = new CamisaPersonalizada(new Camisa());

        assertEquals("Camisa com personalização", roupa.getNomeRoupa());
    }
}
