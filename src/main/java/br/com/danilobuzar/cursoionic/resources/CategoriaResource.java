package br.com.danilobuzar.cursoionic.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilobuzar.cursoionic.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@GetMapping
	public List<Categoria> list() {
		final Categoria cat1 = new Categoria(1, "Informatica");
		final Categoria cat2 = new Categoria(2, "Escritório");

		final List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);

		return lista;
	}

}
