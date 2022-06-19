package com.projeto.web.locacaoveiculos.model;
import javax.persistence.*;

/**
 * AUTOR ALBERTO
 */
@Entity
@Table(name = "usuarios")
public class Usuario {

    /**
     * ATRIBUTOS PRIVADOS
     */

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")

    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "cnh")
    private String cnh;

    /**
     * METODOS PUBLICOS
     * @return
     */

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String tel) {
        this.telefone = tel;
    }

    public String getCnh() {
        return telefone;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
