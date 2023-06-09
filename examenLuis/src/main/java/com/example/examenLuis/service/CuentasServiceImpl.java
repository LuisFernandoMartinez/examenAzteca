package com.example.examenLuis.service;

import com.example.examenLuis.dao.CuentaDao;
import com.example.examenLuis.entity.CuentasGeneral;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CuentasServiceImpl implements CuentasService{
   @Autowired
   private CuentaDao cuentaDao;
    @Override
    public String saldo(Long id) {
        Optional<CuentasGeneral>cuentaData= cuentaDao.findById(id);
        if(cuentaData.isPresent()){
            return "Cuenta con : "cuentaData.get().getSaldoCuenta();
        }else{
            return "No existe cuenta";
        }
    }

    @Override
    public String deposito(Long id, int quantity) {
        Optional<CuentasGeneral>cuentaData= cuentaDao.findById(id);
        if(cuentaData.isPresent()){
            cuentaData.get().setSaldoCuenta(cuentaData.get().getSaldoCuenta()+quantity);
            cuentaDao.save(cuentaData.get());
            return "Succes " + 1;
        }else {
            return "Error  cuenta no encontrada ";
        }
    }

    @Override
    public String retiro(Long id, int quantity) {
        Optional<CuentasGeneral>cuentaData= cuentaDao.findById(id);
        if(cuentaData.isPresent()){
            cuentaData.get().setSaldoCuenta(cuentaData.get().getSaldoCuenta()-quantity);
            cuentaDao.save(cuentaData.get());
            return "Succes " + 1;
        }else{
            return "No encontrado";
        }
    }
}
