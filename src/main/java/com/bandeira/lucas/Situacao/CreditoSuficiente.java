package com.bandeira.lucas.Situacao;

import com.bandeira.lucas.model.Estado;

public class CreditoSuficiente extends Situacao {

    @Override
    public Estado verificarEstado() {
        return new Estado("Crédito suficiente");
    }
    
}
