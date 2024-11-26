package org.example.tipoMoeda;

import org.example.IMoeda;

public class MoedaEuro implements IMoeda {

    private float valorEuro;

    @Override
    public float getMoeda() {
        return this.valorEuro;
    }

    @Override
    public void setMoeda(float moeda) {
        this.valorEuro = moeda;
    }
}