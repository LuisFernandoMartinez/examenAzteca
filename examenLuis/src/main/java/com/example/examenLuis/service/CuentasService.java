package com.example.examenLuis.service;

public interface CuentasService {
    public String saldo(Long id);
    public String deposito(Long id,int quantity);
    public String retiro(Long id,int quantity);
}
