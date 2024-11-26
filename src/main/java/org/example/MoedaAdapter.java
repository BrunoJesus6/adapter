package org.example;

import org.example.tipoMoeda.MoedaDolar;

public class MoedaAdapter extends MoedaDolar {

    private IMoeda moedaEuro;

    public MoedaAdapter(IMoeda moedaEuro) {
        this.moedaEuro = moedaEuro;
    }

    public float recuperarMoeda() {
        float valorDolar = this.getValorDolar();
        return valorDolar * 0.85f;
    }

    public void salvarMoeda(float valorEuro) {
        this.setValorDolar(valorEuro / 0.85f);
        moedaEuro.setMoeda(valorEuro);
    }
}
