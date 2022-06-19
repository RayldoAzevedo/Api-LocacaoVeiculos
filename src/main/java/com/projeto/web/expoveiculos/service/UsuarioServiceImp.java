package com.projeto.web.expoveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projeto.web.expoveiculos.model.Usuario;
import com.projeto.web.expoveiculos.persistence.UsuarioRepository;
import com.projeto.web.expoveiculos.util.UsuarioException;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UsuarioServiceImp implements UsuarioService {

    private final UsuarioRepository repository;

    @Autowired
    public UsuarioServiceImp(UsuarioRepository repositorio) {
        this.repository = repositorio;
    }

    @Override
    public Usuario incluir(Usuario usuario) {
        try {
            repository.save(usuario);
            return usuario;
        } catch (Exception e) {
            throw new UsuarioException("Não foi possível incluir usuário");
        }
    }

    @Override
    public List<Usuario> listar() {
        try {
            return (List<Usuario>) this.repository.findAll();
        }
        catch (Exception e){
            throw new UsuarioException("Não foi possível listar os usuários!");
        }
    }

    @Override
    public Usuario consultar(Integer id) {
        try {
            return this.repository.findById(id).get();
        }
        catch (Exception e){
            throw new UsuarioException("Não foi possível consultar o usuário: "+id+"!");
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        try {
            repository.save(usuario);
        }
        catch (Exception e){
            throw new UsuarioException("Não foi possível alterar o usuario: "+usuario.getId()+"!");
        }
    }

    @Override
    public void excluir(Integer id) {
        try {
            repository.deleteById(id);
        }
        catch (Exception e){
            throw new UsuarioException("Não foi possível excluir o usuario: "+id+"!");
        }
    }
}