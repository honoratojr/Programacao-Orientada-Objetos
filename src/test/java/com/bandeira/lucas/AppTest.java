package com.bandeira.lucas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bandeira.lucas.Situacao.Cancelar;
import com.bandeira.lucas.Situacao.CreditoInsuficiente;
import com.bandeira.lucas.Situacao.CreditoSuficiente;
import com.bandeira.lucas.Situacao.Inicio;
import com.bandeira.lucas.model.Estado;
import com.bandeira.lucas.model.Maquina;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void deveZerarOSaldoAoCancelar()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00,new Cancelar());
        maquina.cancelar();
        assertTrue(maquina.getSaldo() == 0);
    }

    @Test
    public void deveZerarOSaldoAoSolicitarCafe()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(3.00,new CreditoSuficiente());
        maquina.solicitarCafe();
        assertTrue(maquina.getSaldo() == 0);
    }

    @Test
    public void deveRetornarCreditoInsuficiente()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00, new CreditoInsuficiente());
        maquina.solicitarCafe();
        assertTrue(maquina.verificarSituacao().getNome().equals("Crédito insuficiente"));

    }

    @Test
    public void deveRetornarCreditoSuficiente()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(3.00, new CreditoSuficiente());
        maquina.solicitarCafe();
        assertTrue(maquina.getSaldo() >= 0);

    }

    // @Test
    // public void deveRetornarInicial()
    // {
    //     Maquina maquina = new Maquina();
    //     assertTrue(maquina.getEstado() == Estado.INICIAL);
    // }
    @Test
    public void deveRetornarInicialAoCancelar()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00, new Inicio());
        maquina.cancelar();
        Estado estado = maquina.verificarSituacao();
        assertTrue(estado.getNome().equals("Inicial"));
    }
    
   
    @Test
    public void deveRetornarCancelado()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00, new Cancelar());
        maquina.cancelar();
         Estado estado = maquina.verificarSituacao();
        assertTrue(estado.getNome().equals("Cancelado"));
    }

}
