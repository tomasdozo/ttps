package ttps.lombok;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Menu {
    String plato;
    String postre;
    String bebida;
    String platoAlternativo;
    String postreAlternativo;
    String bebidaAlternativa;
}


