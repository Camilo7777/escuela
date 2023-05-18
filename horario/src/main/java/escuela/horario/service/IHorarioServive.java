package escuela.horario.service;

import escuela.horario.repository.HorarioEntity;

import java.util.List;

public interface IHorarioServive {

    List<HorarioEntity> findAll();
}
