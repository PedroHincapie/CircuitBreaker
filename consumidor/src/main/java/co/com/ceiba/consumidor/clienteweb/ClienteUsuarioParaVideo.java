package co.com.ceiba.consumidor.clienteweb;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class ClienteUsuarioParaVideo {

	private WebClient cliente = WebClient.create("http://video:8083");

	public  Mono<Integer> consultarVideos(Integer idUsuario) {
		return cliente.get()
				.uri("/video/{id}", idUsuario)
				.retrieve()
				.bodyToMono(Integer.class);
	}

}
