package br.ufsc.cursofs.trabalhoparteii.test;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.ufsc.cursofs.trabalhoparteii.entities.Assunto;
import br.ufsc.cursofs.trabalhoparteii.entities.Comentario;
import br.ufsc.cursofs.trabalhoparteii.entities.Editor;
import br.ufsc.cursofs.trabalhoparteii.entities.Postagem;
import br.ufsc.cursofs.trabalhoparteii.repositories.AssuntoRepository;
import br.ufsc.cursofs.trabalhoparteii.repositories.ComentarioRepository;
import br.ufsc.cursofs.trabalhoparteii.repositories.EditorRepository;
import br.ufsc.cursofs.trabalhoparteii.repositories.PostagemRepository;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner {

	@Autowired
	AssuntoRepository assuntoRepository;
	
	@Autowired
	PostagemRepository postagemRepository;
	
	@Autowired
	ComentarioRepository comentarioRepository;
	
	@Autowired
	EditorRepository editorRepository;

	@Override
	public void run(String... args) throws Exception {

		Assunto as1 = new Assunto(null, "Games");
		Assunto as2 = new Assunto(null, "Tecnologia");
		Assunto as3 = new Assunto(null, "Agronomia");

		assuntoRepository.saveAll(Arrays.asList(as1, as2, as3));
		
		Postagem po1 = new Postagem(null, Instant.parse("2018-01-24T14:12:47Z"), "Call of Duty: Modern Warfare é massa!", "O jogo Call of Duty: Modern Warfare é muito massa, vale a grana");
		Postagem po2 = new Postagem(null, Instant.parse("2019-08-24T21:34:23Z"), "O novo processador Intel Core i15", "A nova tecnologia desse processador é de outro mundo");
		Postagem po3 = new Postagem(null, Instant.parse("2020-12-12T09:12:47Z"), "A próxima safra de soja será recorde", "Dados indicam que o Brasil vai dobrar a produção registrada no ano anterior");

		postagemRepository.saveAll(Arrays.asList(po1, po2, po3));
		
		Comentario cm1 = new Comentario(null, "Fantástico", Instant.parse("2018-01-24T15:12:47Z"), "Esse jogo é muito massa mesmo!");
		Comentario cm2 = new Comentario(null, "Muito rápido!", Instant.parse("2019-08-24T21:37:23Z"), "Eu tenho ele aqui e a velocidade é de outro mundo");
		Comentario cm3 = new Comentario(null, "Depende", Instant.parse("2020-12-21T04:19:47Z"), "Isso se continuar chovendo...");
		
		comentarioRepository.saveAll(Arrays.asList(cm1, cm2, cm3));
		
		Editor ed1 = new Editor(null, "GameManiaco", "123654");
		Editor ed2 = new Editor(null, "TechGuy", "abcdef");
		Editor ed3 = new Editor(null, "AgroGirl", "qwerty");
		
		editorRepository.saveAll(Arrays.asList(ed1, ed2, ed3));		
	}

}
