package br.com.altave.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.altave.fatec.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}