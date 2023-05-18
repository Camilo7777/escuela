package escuela.horario.service;

import escuela.horario.repository.HorarioEntity;
import escuela.horario.repository.HorarioRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
public class HorarioService implements IHorarioServive {

    private final HorarioRepository repository;
    @Override
    public List<HorarioEntity> findAll() {
        return repository.findAll();
    }
}
