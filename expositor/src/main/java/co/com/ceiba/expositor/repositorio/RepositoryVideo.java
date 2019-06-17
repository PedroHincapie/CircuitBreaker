package co.com.ceiba.expositor.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.ceiba.expositor.entity.Video;

@Repository
public interface RepositoryVideo extends JpaRepository<Video, Integer>{

	@Query(value = "select COUNT(*) FROM video v where v.idUsuario = ?1", nativeQuery = true)
	Integer cantidadVideoPorId(Integer idUsuario);
}
