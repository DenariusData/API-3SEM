package br.com.altave.fatec.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import br.com.altave.fatec.model.Funcionario;
import br.com.altave.fatec.service.FuncionarioService;


@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }

    // Listar todos os funcionários
    @GetMapping
    public List<Funcionario> listarTodos() {
        return service.listarTodos();
    }

    // Buscar funcionário por ID
    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Salvar um novo funcionário
    @PostMapping
    public Funcionario salvar(@RequestBody Funcionario funcionario) {
        return service.salvar(funcionario);
    }

    // Atualizar um funcionário existente
    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable Long id, @RequestBody Funcionario funcionarioAtualizado) {
        return service.atualizar(id, funcionarioAtualizado)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Deletar um funcionário
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    // Endpoint para upload de foto (se optar por salvar em uma pasta)
    @PostMapping("/{id}/upload-foto")
    public ResponseEntity<String> uploadFoto(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        String mensagem = service.uploadFoto(id, file);
        return ResponseEntity.ok(mensagem);
    }

    // Endpoint para recuperar foto (se optar por salvar no banco de dados)
    @GetMapping("/{id}/foto")
    public ResponseEntity<byte[]> recuperarFoto(@PathVariable Long id) {
        byte[] foto = service.recuperarFoto(id);
        if (foto != null) {
            return ResponseEntity.ok()
                    .header("Content-Type", "image/jpeg") // Ajuste conforme o tipo de imagem
                    .body(foto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}