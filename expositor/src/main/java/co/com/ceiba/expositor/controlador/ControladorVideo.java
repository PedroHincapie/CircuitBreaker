package co.com.ceiba.expositor.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.expositor.comando.ComandoVideo;
import co.com.ceiba.expositor.entity.Video;
import co.com.ceiba.expositor.repositorio.RepositoryVideo;

@RestController
@RequestMapping(path = "/video")
public class ControladorVideo {

	private RepositoryVideo repositoryVideo;

	public ControladorVideo(RepositoryVideo repositoryVideo) {
		this.repositoryVideo = repositoryVideo;
	}

	@GetMapping
	public long consultarVideos() {
		return repositoryVideo.count();
	}

	@GetMapping(path = "/{id}")
	public Integer consultarVideosPorId(@PathVariable Integer id) {
		return repositoryVideo.cantidadVideoPorId(id);
	}

	@PostMapping
	public void crearVideo(@RequestBody ComandoVideo comandoVideo) {
		Video entity = new Video(comandoVideo.getNombrePelicula(), comandoVideo.getIdUsuario());
		repositoryVideo.save(entity);
	}
}
