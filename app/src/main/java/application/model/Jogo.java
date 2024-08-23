package application.model;


import java.lang.annotation.Inherited;
import java.until.HashSet;
import java.until.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jogos")
public class Jogo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique=true, nullable=false)
    private String titulo;

    @ManyToMany(mappedBy= "jogos")
@JoinTable(
    name= "jogos_possuem_plataformas", JoinColumns = @JoinColumn(name = "id_jogos"), inverseJoinColumns= @JoinColumn(name="id_")
)
}