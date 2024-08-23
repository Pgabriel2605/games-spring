package application.repository;

import org.springframework.data.CrudRepository;
import application.model.Categoria;

public interface Plataforma extends CrudRepository<Categoria, Long>{


}