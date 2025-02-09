package CCASolutions.dao;

import org.springframework.data.repository.CrudRepository;

import CCASolutions.modelos.ConfiguracionModelo;

public interface IConfiguracionDao extends CrudRepository<ConfiguracionModelo, Long>
{

}
