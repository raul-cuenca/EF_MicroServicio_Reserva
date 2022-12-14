package pe.cuenca.service;

import java.util.List;

import pe.cuenca.model.Reserva;

public interface ReservaService {
	void save(Reserva c);	

	List<Reserva> get();
}
