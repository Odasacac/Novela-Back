package CCASolutions.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import CCASolutions.modelos.PersonajeModelo;

public interface IPersonajesDao extends CrudRepository<PersonajeModelo, Long>
{
	boolean existsByNombreAndMiedo(String nombre, int miedo);
	Optional<PersonajeModelo> findByNombreAndMiedo(String nombre, int miedo);
}
