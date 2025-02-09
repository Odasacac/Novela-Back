package CCASolutions.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import CCASolutions.respuestas.RespuestaConfiguracion;
import CCASolutions.servicios.IConfiguracionServicios;

@CrossOrigin (origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/configuracion")
public class ConfiguracionController 
{
	@Autowired
	private IConfiguracionServicios configuracionServicios;
	
	@GetMapping("/")
	public ResponseEntity<RespuestaConfiguracion> configuracionInicial ()
	{
		return configuracionServicios.getConfiguracion();
	}
}
