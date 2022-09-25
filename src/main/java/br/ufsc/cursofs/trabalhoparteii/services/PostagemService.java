package br.ufsc.cursofs.trabalhoparteii.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufsc.cursofs.trabalhoparteii.entities.Postagem;
import br.ufsc.cursofs.trabalhoparteii.repositories.PostagemRepository;

@Service
public class PostagemService {

	@Autowired
	private PostagemRepository postagemRepository;

	public List<Postagem> findAll() {
		return postagemRepository.findAll();
	}

	public Postagem findById(Long id) {
		return postagemRepository.findById(id).get();
	}

}
