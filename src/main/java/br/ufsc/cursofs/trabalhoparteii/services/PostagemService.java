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

	// Busca todos as postagens no banco de dados
	public List<Postagem> findAll() {
		return postagemRepository.findAll();
	}

	// Busca postagem pela id
	public Postagem findById(Long id) {
		return postagemRepository.findById(id).get();
	}

	// Salva postagem no banco de dados
	public Postagem save(Postagem postagem) {
		return postagemRepository.save(postagem);
	}

}
