package escuela.horario.controller;

import escuela.horario.repository.HorarioEntity;
import escuela.horario.service.IHorarioServive;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class HorarioControlller {
    private final IHorarioServive horarioServive;
    @GetMapping("/horarios")
    public List<HorarioEntity> getHorarios() {
        return horarioServive.findAll();
    }

}
