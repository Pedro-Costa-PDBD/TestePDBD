import org.junit.Test;
import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testAutorOuUsuario() {
        Autor autor = new Autor("João Silva", "Brasil", false);
        assertFalse(autor.isAutor_ou_Usuario());

        Autor usuario = new Autor("Lucas Rafael", "Portugal", true);
        assertTrue(usuario.isAutor_ou_Usuario());
    }
}
