public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obras_publicadas;
    private boolean autor_ou_usuario;

    public Autor(String nome, String nacionalidade, boolean autor_ou_usuario) {
        this.setNome(nome);
        this.nacionalidade = nacionalidade;
        this.autor_ou_usuario = autor_ou_usuario;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Livro[] getObras_Publicadas() {
        return obras_publicadas;
    }

    public void setObras_Publicadas(Livro[] obras_publicadas) {
        this.obras_publicadas = obras_publicadas;
    }

    public boolean isAutor_ou_Usuario() {
        return autor_ou_usuario;
    }

    public void setAutor_ou_Usuario(boolean autor_ou_usuario) {
        this.autor_ou_usuario = autor_ou_usuario;
    }

    public void Definindo_autor() {
        if (autor_ou_usuario) {
            System.out.println("O autor é usuário, publicando artigos.");
        } else {
            System.out.println("O autor publica livros.");
        }
    }
}
