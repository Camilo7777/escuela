package escuela.horario.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Table(name  = "horarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HorarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "aula_id")
    private Integer IdAula;

    @Column(name = "materia_id")
    private Integer IdMateria;
   @Column(name = "maestro_id")
    private Integer IdMaestro;

    @Column(name = "grupo_id")
    private Integer IdGrupo;

    @Column(name = "dia_semana")
    private Integer diaSemana;

    @Column(name = "hora_inicio")
    private LocalTime horaInicio;

    @Column(name = "hora_fin")
    private LocalTime  horaFin;

}
