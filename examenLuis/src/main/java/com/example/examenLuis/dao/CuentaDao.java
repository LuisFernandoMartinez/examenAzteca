package com.example.examenLuis.dao;

import com.example.examenLuis.entity.CuentasGeneral;
import org.springframework.data.repository.CrudRepository;

public interface CuentaDao extends CrudRepository<CuentasGeneral,Long> {
}
