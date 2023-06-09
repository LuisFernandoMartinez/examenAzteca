package com.example.examenLuis.cuentas;

public enum DescripcionCuentas {
    PREMIER("CUENTA_PREMIER",100000), AZUL("CUENTA AZUL",50000), PLATINO("CUENTA_PLATINO",30000);
    private String descripcion;
    private int limite;

    DescripcionCuentas(String cuenta, int i) {
        this.descripcion = cuenta;
        this.limite = i;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getLimite() {
        return limite;
    }
}
