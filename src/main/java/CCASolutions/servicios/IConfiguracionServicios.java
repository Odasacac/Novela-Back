package CCASolutions.servicios;

import org.springframework.http.ResponseEntity;

import CCASolutions.respuestas.RespuestaConfiguracion;

public interface IConfiguracionServicios 
{
	public ResponseEntity<RespuestaConfiguracion> getConfiguracion();
}
