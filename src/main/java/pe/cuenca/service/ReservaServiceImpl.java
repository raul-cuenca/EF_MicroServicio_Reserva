package pe.cuenca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.cuenca.model.Reserva;
import pe.cuenca.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository repositorio;

	@Override
	public void save(Reserva c) {
		repositorio.save(c);
	}

	@Override
	public List<Reserva> get() {
		return repositorio.findAll();
	}

}
