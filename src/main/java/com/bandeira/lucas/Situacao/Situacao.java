package com.bandeira.lucas.Situacao;

import com.bandeira.lucas.model.Estado;
import com.bandeira.lucas.model.Maquina;

public abstract class Situacao {
    
    public abstract Estado verificarEstado();

    public void creditoInsuficiente(Maquina pedido) {
        throw new RuntimeException("Não pode mudar para creditoInsuficiente");
    }

    public void creditoSuficiente(Maquina pedido) {
        throw new RuntimeException("Não pode mudar para situação creditoSuficiente");
    }

    public void Pagar(Maquina pedido) {
        throw new RuntimeException("Não pode mudar para situação pago");

    }
}
