package br.ufsc.cursofs.trabalhoparteii.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufsc.cursofs.trabalhoparteii.entities.Comentario;
import br.ufsc.cursofs.trabalhoparteii.repositories.ComentarioRepository;

@Service
public class ComentarioService {
	
	@Autowired
	private ComentarioRepository comentarioRepository;
	
	public List<Comentario> findAll(){
		return comentarioRepository.findAll();
	}
	
	public Comentario findById(Long id) {
		return comentarioRepository.findById(id).get();
	}

}
