package br.ufsc.cursofs.trabalhoparteii.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.ufsc.cursofs.trabalhoparteii.entities.Editor;
import br.ufsc.cursofs.trabalhoparteii.repositories.EditorRepository;

@Service
public class EditorService {

	private EditorRepository editorRepository;
	
	public List<Editor> findAll(){
		return editorRepository.findAll();
	}
	
	public Editor findById(Long id) {
		return editorRepository.findById(id).get();
	}
}
