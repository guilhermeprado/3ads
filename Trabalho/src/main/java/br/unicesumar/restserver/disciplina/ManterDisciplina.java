package br.unicesumar.restserver.disciplina;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplinas")
@Transactional
public class ManterDisciplina {
    
    @Autowired
    private EntityManager em;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Disciplina> getDisciplina(){
        return ResultSet = query.em("from Disciplina d");
               
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void criarDisciplina(@RequestBody Disciplina disciplina){
        query.em("");
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public void alterarDisciplina(@RequestBody Disciplina disciplina){
        
    }
    
    @RequestParam("/id", RequestMethod.DELETE)
    public void excluirDisciplina(@PathVariable Long id){
        
    }
}
