package com.devfullstack.dfsAppTreinamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devfullstack.dfsAppTreinamento.dto.VeiculoDTO;
import com.devfullstack.dfsAppTreinamento.entities.Veiculo;
import com.devfullstack.dfsAppTreinamento.service.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;
	

	/**
	 * Método para atualizar um veículo
	 * @param veiculoDTO
	 * @return
	 */
	@SuppressWarnings("unused")
	@PutMapping
	@ResponseBody
	public ResponseEntity<Veiculo> update(@RequestBody VeiculoDTO veiculoDTO) {
		Veiculo entity = veiculoService.update(veiculoDTO);
		if (entity.getId() != null) {
			return new ResponseEntity<>(entity, HttpStatus.CREATED);
		} else if(entity == null) {
			return ResponseEntity.badRequest().build();
		} else {
			return null;
		}

	}

	/**
	 * Método para salvar um veículo
	 * @param veiculoDTO
	 * @return
	 */
	@PostMapping
	public ResponseEntity<Veiculo> save(@RequestBody VeiculoDTO veiculoDTO) {
		Veiculo entity = veiculoService.save(veiculoDTO);
		return new ResponseEntity<>(entity, HttpStatus.CREATED);
	}

	/**
	 * Retorna um veículo pelo id
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/{id},{renavan}")
	public VeiculoDTO findById(@RequestParam Long id, @RequestParam Long renavan) {
		VeiculoDTO veiculoDTO = veiculoService.findByIdAndRenavan(id, renavan);
		return veiculoDTO;
	}

	/**
	 * Retorna um veículo pelo id
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/{id}")
	public VeiculoDTO findById(@PathVariable Long id) {
		VeiculoDTO veiculoDTO = veiculoService.findById(id);
		return veiculoDTO;
	}

	/**
	 * Retorna todos os veículos
	 * 
	 * @return
	 */
	@GetMapping
	public List<VeiculoDTO> findAll() {
		List<VeiculoDTO> veiculosDto = veiculoService.findAll();
		return veiculosDto;
	}

}
