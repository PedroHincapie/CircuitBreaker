package co.com.ceiba.expositor.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.ceiba.expositor.entity.Video;

@Repository
public interface RepositoryVideo extends CrudRepository<Video, Integer>{

	@Query(value = "select COUNT(*) FROM video v where v.usuario = ?1", nativeQuery = true)
	Integer cantidadVideoPorId(Integer idUsuario);
}
