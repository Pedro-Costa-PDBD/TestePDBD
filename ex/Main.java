import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando o autor com nome, nacionalidade e se é um autor tradicional ou um usuário
        Autor autor = new Autor("João da Silva", "Brasileiro", false);
        
        // Criando o livro
        Livro livro = new Livro();
        livro.setTitulo("Java para iniciantes");
        livro.setAutor(autor);
        livro.setGenero("Tecnologia");
        livro.validarDisponibilidade();

        // Criando o usuário
        Usuario usuario = new Usuario();
        usuario.setIdade(25);
        usuario.setNome_Usuario("Lucas Rafael");

        // Criando o empréstimo
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setData_retirada(new Date());
        emprestimo.setData_devolucao(new Date());
        emprestimo.setLIvro(livro);
        emprestimo.setUSuario(usuario);

        // Criando o artigo
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        // Exibindo as informações no console
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + autor.getNome()); // Nome do autor associado ao livro
        System.out.println("Nacionalidade do Autor: " + autor.getNacionalidade());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome_Usuario());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de retirada: " + emprestimo.getData_retirada());
        System.out.println("Data de devolução: " + emprestimo.getData_devolucao());
        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Gênero do Artigo: " + artigo.getGenero());
        System.out.println("Publicado: " + artigo.isPublicado());
    }
}
