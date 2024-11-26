package org.example;

import org.example.tipoMoeda.MoedaEuro;

public class Pessoa {

    IMoeda moeda;
    MoedaAdapter adaptador;

    public Pessoa() {
        moeda = new MoedaEuro();
        adaptador = new MoedaAdapter(moeda);
    }

    public void setValorEmEuro(float valorEuro) {
        moeda.setMoeda(valorEuro);
        adaptador.salvarMoeda(valorEuro);
    }

    public float getValorEmEuro() {
        return adaptador.recuperarMoeda();
    }

    public void setValorEmDolar(float valorDolar) {
        adaptador.setValorDolar(valorDolar);
    }

    public float getValorEmDolar() {
        return adaptador.getValorDolar();
    }
}