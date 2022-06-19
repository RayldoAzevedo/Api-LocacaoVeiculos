package com.projeto.web.locacaoveiculos.persistence;
import org.springframework.data.repository.CrudRepository;
import com.projeto.web.locacaoveiculos.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
