package pe.cuenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.cuenca.model.Reserva;
import pe.cuenca.service.ReservaService;

@RestController
@RequestMapping("/raulcuenca/api/reserva")
public class ReservaController {
	
	@Autowired
	private ReservaService service;
	
	@RequestMapping(path="/listar",method=RequestMethod.GET)
	public ResponseEntity<List<Reserva>> get(){		
		return new ResponseEntity<List<Reserva>>(service.get(),HttpStatus.OK);		
	}
	
	
	@RequestMapping(path="/guardar",method=RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Reserva reserva){
		
		service.save(reserva);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}


}
