package com.example.examenLuis.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class CuentasGeneral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, name = "nombre_cuenta")
    private String nombreCuenta;
    @Column(nullable = false, name = "descr_cuenta")
    private String descrCuenta;
    @Column(nullable = false, name = "num_cuenta")
    private String numCuenta;
    @Column(nullable = false, name = "limite_cuenta")
    private int limiteCuenta;
    @Column(nullable = false, name = "saldo_cuenta")
    private int saldoCuenta;
    @Column(nullable = false, name = "deposito_cuenta")
    private int depositoCuenta;
    @Column(nullable = false, name = "retiro_cuenta")
    private int retiroCuenta;

    public CuentasGeneral(String nombreCuenta){
        this.nombreCuenta=nombreCuenta;
    }



}
