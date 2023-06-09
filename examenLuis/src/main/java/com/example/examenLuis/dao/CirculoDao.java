package com.example.examenLuis.dao;

import com.example.examenLuis.entity.CirculoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CirculoDao extends CrudRepository<CirculoEntity,Long>{
}
