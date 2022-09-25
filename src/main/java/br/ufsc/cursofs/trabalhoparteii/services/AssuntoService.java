package br.ufsc.cursofs.trabalhoparteii.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufsc.cursofs.trabalhoparteii.entities.Assunto;
import br.ufsc.cursofs.trabalhoparteii.repositories.AssuntoRepository;

@Service
public class AssuntoService {
	@Autowired
	private AssuntoRepository assuntoRepository;
	
	public List<Assunto> findAll(){
		return assuntoRepository.findAll();
	}
	
	public Assunto findById(Long id) {
		return assuntoRepository.findById(id).get();
	}

}
