package br.com.altave.fatec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.altave.fatec.model.Funcionario;
import br.com.altave.fatec.repository.FuncionarioRepository;



@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    // Listar todos os funcionários
    public List<Funcionario> listarTodos() {
        return repository.findAll();
    }

    // Buscar funcionário por ID
    public Optional<Funcionario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Salvar um novo funcionário
    public Funcionario salvar(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    // Atualizar um funcionário existente
    public Optional<Funcionario> atualizar(Long id, Funcionario funcionarioAtualizado) {
        return repository.findById(id).map(funcionario -> {
            funcionario.setNome(funcionarioAtualizado.getNome());
            funcionario.setCpf(funcionarioAtualizado.getCpf());
            funcionario.setEmpresa(funcionarioAtualizado.getEmpresa());
            funcionario.setCargaHoraria(funcionarioAtualizado.getCargaHoraria());
            funcionario.setFuncao(funcionarioAtualizado.getFuncao());
            funcionario.setEmail(funcionarioAtualizado.getEmail());
            funcionario.setFoto(funcionarioAtualizado.getFoto()); // Atualiza a foto, se fornecida
            return repository.save(funcionario);
        });
    }

    // Deletar um funcionário
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    // Método para upload de foto
    public String uploadFoto(Long id, MultipartFile file) {
        return repository.findById(id).map(funcionario -> {
            try {
                // Converte o arquivo para um array de bytes
                byte[] fotoBytes = file.getBytes();
                funcionario.setFoto(fotoBytes); // Define a foto no funcionário
                repository.save(funcionario);
                return "Foto salva com sucesso!";
            } catch (Exception e) {
                throw new RuntimeException("Erro ao salvar a foto: " + e.getMessage());
            }
        }).orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
    }

    // Método para recuperar foto
    public byte[] recuperarFoto(Long id) {
        return repository.findById(id).map(Funcionario::getFoto)
                .orElseThrow(() -> new RuntimeException("Funcionário ou foto não encontrada"));
    }
}