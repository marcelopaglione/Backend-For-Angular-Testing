package com.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Endereco;
import com.rest.repositories.EnderecoReposiroty;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class EnderecoController {
	@Autowired
	private EnderecoReposiroty EnderecoRepository;

	@GetMapping("/enderecos")
	public List<Endereco> getEnderecos() {
		return EnderecoRepository.findAll();
	}

	@GetMapping("/endereco/{id}")
	public Endereco getEndereco(@PathVariable Long id) {
		return EnderecoRepository.findOne(id);
	}

	@DeleteMapping("/endereco/{id}")
	public boolean deleteEndereco(@PathVariable Long id) {
		EnderecoRepository.delete(id);
		return true;
	}

	@PutMapping("/endereco")
	public Endereco updateEndereco(@RequestBody Endereco Endereco) {
		return EnderecoRepository.save(Endereco);
	}

	@PostMapping("/endereco")
	public Endereco createEndereco(@RequestBody Endereco Endereco) {
		return EnderecoRepository.save(Endereco);
	}

}
