package br.ufsc.cursofs.trabalhoparteii.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.ufsc.cursofs.trabalhoparteii.entities.Comentario;
import br.ufsc.cursofs.trabalhoparteii.services.ComentarioService;

@RestController
public class ComentarioController {

	@Autowired
	private ComentarioService comentarioService;
	
	@GetMapping(value = "/comentarios")
	public ResponseEntity<List<Comentario>> getComentarios(){
		List<Comentario> comentarios = comentarioService.findAll();
		return ResponseEntity.ok().body(comentarios);
	}
	
	@GetMapping(value = "/comentarios/{id}")
	public ResponseEntity<Comentario> getComentarioById(@PathVariable Long id){
		Comentario cm = comentarioService.findById(id);
		return ResponseEntity.ok().body(cm);
	}
}
