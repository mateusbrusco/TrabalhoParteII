package br.ufsc.cursofs.trabalhoparteii.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.ufsc.cursofs.trabalhoparteii.entities.Assunto;
import br.ufsc.cursofs.trabalhoparteii.services.AssuntoService;

@RestController
public class AssuntoController {

	@Autowired
	private AssuntoService assuntoService;
	
	@GetMapping(value = "/assuntos")
	public ResponseEntity<List<Assunto>> getAssuntos(){
		List<Assunto> assuntos = assuntoService.findAll();
		return ResponseEntity.ok().body(assuntos);
	}
	
	@GetMapping(value = "/assuntos/{id}")
	public ResponseEntity<Assunto> getAssuntoById(@PathVariable Long id){
		Assunto as = assuntoService.findById(id);
		return ResponseEntity.ok().body(as);
	}
}
