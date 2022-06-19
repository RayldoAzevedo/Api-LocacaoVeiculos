package com.projeto.web.expoveiculos.service;

import java.util.List;

import com.projeto.web.expoveiculos.model.Usuario;

public interface UsuarioService {
    public Usuario incluir(Usuario usuario);
    public List<Usuario> listar();
    public Usuario consultar(Integer id);
    public void alterar(Usuario usuario);
    public void excluir(Integer id);
}