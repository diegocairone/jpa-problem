package com.cairone.testjpa2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.cairone.testjpa2.entities.PersonaRelEntity;
import com.cairone.testjpa2.entities.PersonaRelPKEntity;

public interface PersonaRelRepository extends JpaRepository<PersonaRelEntity, PersonaRelPKEntity>, QueryDslPredicateExecutor<PersonaRelEntity> {

}
