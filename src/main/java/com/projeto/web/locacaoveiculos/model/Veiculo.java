package com.projeto.web.locacaoveiculos.model;
import javax.persistence.*;
@Entity
@Table(name = "veiculos")
public class Veiculo {

    /**
     * ATRIBUTOS PRIVADOS
     */
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVeiculo;

    @Column(name = "km")
    private String  km;
    @Column(name = "modelo")
    private String  modelo;
    @Column(name = "marca")
    private String  marca;
    @Column(name = "placa")
    private String  placa;
    @Column(name = "valor")
    private Double  valor;

    /**
     * METODOS PUBLICOS
     *
     */
    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
