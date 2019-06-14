package co.com.ceiba.consumidor.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.consumidor.repository.RepositorioUsuario;

@RestController
@RequestMapping(path="/PoC")
public class ControladorUsuario {

	private RepositorioUsuario repositorioUsuario;

	public ControladorUsuario(RepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;		
	}

	@GetMapping
	public  long consultaUsuario() {
		return repositorioUsuario.count();
	}
}
