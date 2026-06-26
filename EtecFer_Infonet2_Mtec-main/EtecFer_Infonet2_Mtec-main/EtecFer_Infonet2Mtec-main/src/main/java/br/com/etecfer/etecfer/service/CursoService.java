package br.com.etecfer.etecfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.etecfer.etecfer.entity.Curso;
import br.com.etecfer.etecfer.repository.CursoRepository;

@Service
public class CursoService {

    // Injeção de dependência do repositório para a classe aluno
    @Autowired
    private CursoRepository cursoRepository;

    //Método para salvar um aluno
    public Curso save(Curso curso){
        return cursoRepository.save(curso);
    }

    //Método para listar todos os alunos
    public List<Curso> findAll(){
        return cursoRepository.findAll();
    }


    //Método para excluir alunos por id 
    public void deleteById(Integer id){
        cursoRepository.deleteById(id);
    }

//Metodo para buscar alno pelo id
public Curso findById(Integer id){
    return cursoRepository.findById(id).orElse(null);
}




    
}
