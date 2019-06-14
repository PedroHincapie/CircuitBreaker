package co.com.ceiba.consumidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ceiba.consumidor.entity.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Integer> {

}
