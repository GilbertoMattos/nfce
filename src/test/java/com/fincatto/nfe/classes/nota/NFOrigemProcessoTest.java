package com.fincatto.nfe.classes.nota;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.nfe.classes.NFOrigemProcesso;

public class NFOrigemProcessoTest {

    @Test
    public void deveRetornarNuloAoPassarCodigoInvalido() {
        Assert.assertNull(NFOrigemProcesso.valueOfCodigo(""));
    }

    @Test
    public void deveRetornarOrigemProcessoAoPassarCodigoValido() {
        Assert.assertNotNull(NFOrigemProcesso.valueOfCodigo(NFOrigemProcesso.JUSTICA_ESTADUAL.getCodigo()));
    }
}