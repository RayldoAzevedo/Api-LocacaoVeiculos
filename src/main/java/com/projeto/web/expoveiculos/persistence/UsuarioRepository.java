package com.projeto.web.expoveiculos.persistence;
import org.springframework.data.repository.CrudRepository;
import com.projeto.web.expoveiculos.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
