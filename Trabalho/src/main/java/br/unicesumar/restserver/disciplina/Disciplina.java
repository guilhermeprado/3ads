package br.unicesumar.restserver.disciplina;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina {
    
    @Id
    private long id;
    private String nome;
    private Integer cargaHoraria;
    private Double peso;

    public Disciplina(){
        
    }
    public Disciplina(long id, String nome, Integer cargaHoraria, Double peso) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.peso = peso;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public Double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cargaHoraria);
        hash = 97 * hash + Objects.hashCode(this.peso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cargaHoraria, other.cargaHoraria)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ManterDisciplina{" + "id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", peso=" + peso + '}';
    }
    
    
}
