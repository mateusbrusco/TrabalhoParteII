package br.ufsc.cursofs.trabalhoparteii.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.ufsc.cursofs.trabalhoparteii.entities.Postagem;
import br.ufsc.cursofs.trabalhoparteii.services.PostagemService;

@RestController
public class PostagemController {

	@Autowired
	private PostagemService postagemService;

	@GetMapping(value = "/postagens")
	public ResponseEntity<List<Postagem>> getPostagens() {
		List<Postagem> postagens = postagemService.findAll();
		return ResponseEntity.ok().body(postagens);
	}

	@GetMapping(value = "/postagens/{id}")
	public ResponseEntity<Postagem> getPostagemById(@PathVariable Long id) {
		Postagem ps = postagemService.findById(id);
		return ResponseEntity.ok().body(ps);
	}

}
