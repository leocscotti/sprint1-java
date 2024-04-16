package br.com.fiap.jadv.challenge.visionaryai.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.jadv.challenge.visionaryai.entidades.IA;

@Repository
public interface IaRepository extends JpaRepository<IA, Integer> {
	Optional<IA> findById(Integer id);
	}

