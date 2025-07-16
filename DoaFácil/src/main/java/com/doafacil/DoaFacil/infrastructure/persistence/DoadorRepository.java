package com.doafacil.DoaFacil.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DoadorRepository extends JpaRepository<Doador, UUID> {


}
