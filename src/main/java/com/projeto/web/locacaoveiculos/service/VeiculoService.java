package com.projeto.web.locacaoveiculos.service;
import com.projeto.web.locacaoveiculos.model.*;

import java.util.List;

public interface VeiculoService {

    public Veiculo incluir(Veiculo veiculo);
    public List<Veiculo> listar();
    public Veiculo consultar(Integer id);
    public  void alterar(Veiculo veiculo);
    public  void excluir(Integer id);
}
