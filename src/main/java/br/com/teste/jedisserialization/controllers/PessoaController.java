package br.com.teste.jedisserialization.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.jedisserialization.entities.Pessoa;
import br.com.teste.jedisserialization.repositories.PessoaRedis;

@RestController
public class PessoaController {
	
	@Autowired
	private PessoaRedis pessoaRedis;
	
	@PostMapping
	public ResponseEntity<String> persistPessoa(@RequestBody Pessoa pessoa) {
		pessoaRedis.setPessoaOnRedis("1", pessoa);
		return ResponseEntity.ok("1");
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa> getPessoa(@PathVariable(name = "id") Long id) {
		Pessoa object = (Pessoa) pessoaRedis.getPessoaFromRedis(id.toString());
		object.setId(id);
		return ResponseEntity.ok(object);
	}
	
	

}
