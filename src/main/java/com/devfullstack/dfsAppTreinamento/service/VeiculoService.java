package com.devfullstack.dfsAppTreinamento.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devfullstack.dfsAppTreinamento.dto.VeiculoDTO;
import com.devfullstack.dfsAppTreinamento.entities.Veiculo;
import com.devfullstack.dfsAppTreinamento.repositories.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Autowired
	private ModelMapper modelMapper;

	/**
	 * Método converte um objeto DTO em uma entidade
	 * 
	 * @param veiculoDTO
	 * @return
	 */
	private Veiculo converterParaEntidade(VeiculoDTO veiculoDTO) {
		Veiculo entity = modelMapper.map(veiculoDTO, Veiculo.class);
		return entity;
	}

	/**
	 * Método converte um Objeto entidade em um DTO
	 * 
	 * @param veiculo
	 * @return
	 */
	@SuppressWarnings("unused")
	private VeiculoDTO converterParaEntidadeDTO(Veiculo veiculo) {
		VeiculoDTO entityDto = modelMapper.map(veiculo, VeiculoDTO.class);
		return entityDto;
	}

	/**
	 * Método para atualizar um veículo existente
	 * 
	 * @param veiculoDto
	 * @return
	 */
	// @Transactional(readOnly = true)
	public Veiculo update(VeiculoDTO veiculoDto) {
		Veiculo veiculoExistente = veiculoRepository.findById(veiculoDto.getId()).get();
		if (veiculoExistente.getId() != null) {
			Veiculo veiculo = veiculoRepository.saveAndFlush(converterParaEntidade(veiculoDto));
			return veiculo;
		} else {
			return null;
		}

	}

	/**
	 * Método para salvar um veículo
	 * 
	 * @param veiculoDTO
	 * @return
	 */
	@Transactional(readOnly = true)
	public Veiculo save(VeiculoDTO veiculoDto) {
		Veiculo veiculo = veiculoRepository.save(converterParaEntidade(veiculoDto));
		return veiculo;
	}

	@Transactional(readOnly = true)
	public List<VeiculoDTO> findAll() {
		List<Veiculo> veiculos = veiculoRepository.findAll();
		// Pode fazer dessa forma
		// List<VeiculoDTO> veiculosDto = veiculos.stream().map(x -> new
		// VeiculoDTO(x)).toList();
		// return veiculosDto;
		// Ou dessa outra forma
		return veiculos.stream().map(x -> new VeiculoDTO(x)).toList();
	}

	@Transactional(readOnly = true)
	public VeiculoDTO findById(Long id) {
		Veiculo veiculo = veiculoRepository.findById(id).get();
		return new VeiculoDTO(veiculo);
	}

	@Transactional(readOnly = true)
	public VeiculoDTO findByIdAndRenavan(Long id, Long renavan) {
		Veiculo veiculo = veiculoRepository.findByIdAndRenavan(id, renavan);
		return new VeiculoDTO(veiculo);
	}

}
