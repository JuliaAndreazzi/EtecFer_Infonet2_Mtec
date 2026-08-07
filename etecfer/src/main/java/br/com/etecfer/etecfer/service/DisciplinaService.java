package br.com.etecfer.etecfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.etecfer.etecfer.entity.Disciplina;
import br.com.etecfer.etecfer.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

    // Injeção de dependência do Repository
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    // Método para salvar uma disciplina
    public Disciplina save(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    // Método para listar todas as disciplinas
    public List<Disciplina> findAll() {
        return disciplinaRepository.findAll();
    }

    // Método para excluir uma disciplina pelo ID
    public void deleteById(Integer id) {
        disciplinaRepository.deleteById(id);
    }

    // Método para buscar uma disciplina pelo ID
    public Disciplina findById(Integer id) {
        return disciplinaRepository.findById(id).orElse(null);
    }

}