package co.com.ceiba.consumidor.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/PoC")
public class ControladorUsuario {

	@GetMapping
	public String consultaUsuario() {
		return "Hola pedro";
	}
}
