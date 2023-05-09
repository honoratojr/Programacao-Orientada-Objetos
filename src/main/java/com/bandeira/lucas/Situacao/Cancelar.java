package com.bandeira.lucas.Situacao;

import com.bandeira.lucas.model.Estado;

public class Cancelar extends Situacao {

    @Override
    public Estado verificarEstado() {
        return new Estado("Cancelado");
    }
    
}
