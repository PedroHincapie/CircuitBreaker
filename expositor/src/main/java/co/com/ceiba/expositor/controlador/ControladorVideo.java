package co.com.ceiba.expositor.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.expositor.repositorio.RepositoryVideo;

@RestController
@RequestMapping(path= "/video")
public class ControladorVideo {

	private RepositoryVideo repositoryVideo;

	public ControladorVideo(RepositoryVideo repositoryVideo) {
		this.repositoryVideo = repositoryVideo;
	}

	@GetMapping
	public  long consultarVideos() {
		return repositoryVideo.count();
	}


}
