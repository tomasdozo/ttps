package ttps.lombok;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UsuarioLombok {
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
}









