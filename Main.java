import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor= new Autor();
        autor.setNacionalidade("Brasileiro");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João da Silva");

        Livro livro= new Livro();
        livro.setTitulo("Java para iniciantes");
        livro.setAutor(autor);
        livro.setGenero("Tecnologia");
        livro.validarDisponibilidade();

        Usuario usuario= new Usuario();
        usuario.setIdade(25);
        usuario.setNome_Usuario("Lucas Rafael");

        Emprestimo emprestimo= new Emprestimo();
        emprestimo.setData_retirada(new Date());
        emprestimo.setData_devolucao(new Date());
        emprestimo.setLIvro(livro);
        emprestimo.setUSuario(usuario);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + pessoa.getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome_Usuario());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de retirada: " + emprestimo.getData_retirada());
        System.out.println("Data de devolução: " + emprestimo.getData_devolucao());
    }
}