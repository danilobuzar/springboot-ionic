package br.com.danilobuzar.cursoionic.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	private Integer id;
	
	private String nome;
	
	@GetMapping
	public String list() {
		return "REST funcionando";
	}
	
}
