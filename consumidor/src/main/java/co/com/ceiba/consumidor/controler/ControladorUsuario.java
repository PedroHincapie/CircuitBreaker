package co.com.ceiba.consumidor.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.consumidor.clienteweb.ClienteUsuarioParaVideo;
import co.com.ceiba.consumidor.repository.RepositorioUsuario;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path="/usuario")
public class ControladorUsuario {

	private RepositorioUsuario repositorioUsuario;
	private ClienteUsuarioParaVideo clienteUsuarioParaVideo;

	public ControladorUsuario(RepositorioUsuario repositorioUsuario, ClienteUsuarioParaVideo clienteUsuarioParaVideo) {
		this.repositorioUsuario = repositorioUsuario;
		this.clienteUsuarioParaVideo = clienteUsuarioParaVideo;
	}

	@GetMapping
	public  long consultaUsuario() {
		return repositorioUsuario.count();
	}

	@GetMapping(path="/{id}")
	public Mono<Integer> consultaCantidadDeVideosPorUsuario(@PathVariable Integer id) {
		return clienteUsuarioParaVideo.consultarVideos(id);
	}
}
