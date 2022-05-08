package com.projeto.web.expoveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import com.projeto.web.expoveiculos.model.Veiculo;
import com.projeto.web.expoveiculos.service.VeiculoService;
import com.projeto.web.expoveiculos.util.VeiculoException;

@RestController
//@CrossOrigin(origins = "https://expo-veiculos.vercel.app", maxAge = 3600)
@CrossOrigin(origins = "https://localhost:3000", maxAge = 3600)
@RequestMapping("/")
public class VeiculoController {

    private VeiculoService veiculoService;

    /**
     * Injeção de dependencia do Spring
     * @param veiculoService
     */
    @Autowired
    public void setMedicoService(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    /**
     * CRIAÇÃO DOS METODOS CRUD
     * @return
     */
    @GetMapping(value = "/")
    public String text(){
        return "Projeto Web Final - Banco de dados H2: Veiculos";
    }

    /**
     * Metodo para listagem de veículos
     * @return Lista de Veiculos
     */
    @GetMapping(value = "/listar-veiculos")
    public List<Veiculo> listar(){
        List <Veiculo> lista = veiculoService.listar();

        return lista;
    }

    /**
     * METODO PARA CONSULTAR VEÍCULO
     * @param id
     * @return
     */
    @GetMapping(value = "consultar-veiculo/{id}")
    public Veiculo consultar(@PathVariable Integer id){
        return veiculoService.consultar(id);
    }



    /**
     * Metodo para INCLUIR VEICULO no banco
     * @param TODAS as informações do veiculo recebidas por parametro
     * @return Veiculo
     */
    @PostMapping(value= "incluir-veiculo")

    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        try{

            if (veiculo.getIdVeiculo()==null){
                veiculo = veiculoService.incluir(veiculo);
            }
            else{
                veiculoService.alterar(veiculo);
            }
            return veiculo;
        }
        catch (VeiculoException ex){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getReason());
        }
    }


    /**
     * Metodo que exclui usuario pelo id
     * @param id id do usuario a ser excluido
     */
    @DeleteMapping(value = "excluir-veiculo/{id}")
    public void excluir(@PathVariable Integer id){
        veiculoService.excluir(id);
    }

}
