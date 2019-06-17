package co.com.ceiba.expositor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "video")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nombre;

	private Long usuario;

	public Video() {
	}

	public Video(String nombrePelicula, Long idUsuario) {
		this.nombre = nombrePelicula;
		this.usuario = idUsuario;
	}
}