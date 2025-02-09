package CCASolutions.servicios;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import CCASolutions.respuestas.RespuestaConfiguracion;

@Service
public class ConfiguracionServicios implements IConfiguracionServicios
{

	@Override
	public ResponseEntity<RespuestaConfiguracion> getConfiguracion() 
	{
		return null;
	}

}
