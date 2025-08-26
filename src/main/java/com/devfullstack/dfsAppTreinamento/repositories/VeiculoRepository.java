package com.devfullstack.dfsAppTreinamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfullstack.dfsAppTreinamento.entities.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	Veiculo findByIdAndRenavan(Long id, Long renavan);
}
