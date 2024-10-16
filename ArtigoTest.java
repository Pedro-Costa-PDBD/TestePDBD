import org.junit.Test;
import static org.junit.Assert.*;

public class ArtigoTest {

    @Test
    public void testArtigoConstrutor() {
        Autor autor = new Autor("Maria", "Brasil", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}
