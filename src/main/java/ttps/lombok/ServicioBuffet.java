package ttps.lombok;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.sql.Date;

@Slf4j
public class ServicioBuffet {

    public UsuarioLombok crearUsuarioEjemplo() {
        UsuarioLombok usuario = new UsuarioLombok("Fulano", "De Tal", "fulano@gmail.com", "Palermo 1845", "2216543210", Date.valueOf("2000-10-1"));

        log.info("Se creo el usuario: {}", usuario);
        return usuario;
    }

    public Menu crearMenuEjemplo(){

        Menu menu = Menu.builder()
                .plato("Hamburguesa")
                .postre("Helado")
                .build();

        log.info("Se creo un menu");
        log.warn("No tiene menu alternativo");
        log.error("Falta bebida");
        return menu;
    }
}
