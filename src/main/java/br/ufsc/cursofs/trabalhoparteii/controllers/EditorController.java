package br.ufsc.cursofs.trabalhoparteii.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.ufsc.cursofs.trabalhoparteii.entities.Editor;
import br.ufsc.cursofs.trabalhoparteii.services.EditorService;

@RestController
public class EditorController {

	@Autowired
	EditorService editorService;

	@GetMapping(value = "/editores")
	public ResponseEntity<List<Editor>> getEditores() {
		List<Editor> editores = editorService.findAll();
		return ResponseEntity.ok().body(editores);
	}

	@GetMapping(value = "/editores/{id}")
	public ResponseEntity<Editor> getEditorById(@PathVariable Long id) {
		Editor ed = editorService.findById(id);
		return ResponseEntity.ok().body(ed);
	}
}
