package com.bandeira.lucas.Situacao;

import com.bandeira.lucas.model.Estado;

public class Inicio extends Situacao {

    @Override
    public Estado verificarEstado() {
        return new Estado("Inicial");
    }
    
}
