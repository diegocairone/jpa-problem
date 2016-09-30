package com.cairone.testjpa2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.cairone.testjpa2.entities.UsuarioEntity;
import com.cairone.testjpa2.entities.UsuarioEntityPK;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, UsuarioEntityPK>, QueryDslPredicateExecutor<UsuarioEntity> {

}
