package br.com.altave.fatec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String empresa;

    @Column(nullable = false)
    private String carga_horaria;

    @Column(nullable = false)
    private String funcao;

    @Column(nullable = false, unique = true)
    private String email;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] foto; // Para salvar a imagem como um array de bytes

    // Construtores
    public Funcionario() {}

    public Funcionario(String nome, String cpf, String empresa, String carga_horaria, String funcao, String email, byte[] foto) {
        this.nome = nome;
        this.cpf = cpf;
        this.empresa = empresa;
        this.carga_horaria = carga_horaria;
        this.funcao = funcao;
        this.email = email;
        this.foto = foto;
    }

    // Getters e Setters
    public Long getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getCargaHoraria() { return carga_horaria; }
    public void setCargaHoraria(String carga_horaria) { this.carga_horaria = carga_horaria; }

    public String getFuncao() { return funcao; }
    public void setFuncao(String funcao) { this.funcao = funcao; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public byte[] getFoto() { return foto; }
    public void setFoto(byte[] foto) { this.foto = foto; }
}