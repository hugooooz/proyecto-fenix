import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.ProcesadorUsuarios;

import java.util.List;

public class ProcesadorUsuariosTEST {

    @Test
    void testProcesarListaComportamientoActual() {
        ProcesadorUsuarios procesador = new ProcesadorUsuarios();
        // Le damos una lista de prueba
        List<String> lista = List.of("Ana:1", "Luis:2", "Eva:1", "Juan:99");
        String resultado = procesador.procesarLista(lista);
        
        // Comprobamos que el código funciona como hasta ahora
        assertEquals("Admins: Ana,Eva, | Invitados: Luis,", resultado);
    }
}