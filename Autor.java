public class Autor extends Pessoa {
    private String nacionalidade;
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private Livro[] obras_publicadas;

    public Livro[] getObras_Publicadas() {
        return obras_publicadas;
    }

    public void setObras_Publicadas(Livro[] obras_publicadas) {
        this.obras_publicadas = obras_publicadas;
    }

    public Livro[] getObras_Publicadas_Por_Genero(String genero) {
        return obras_publicadas_por_genero;
    }

    public void setObras_Publicadas_Por_Genero( Livro[] obras_publicadas_por_genero) {
        this.obras_publicadas_por_genero = obras_publicadas_por_genero;
    }



    private boolean autor_ou_usuario;

    public boolean isAutor_ou_Usuario() {
        return autor_ou_usuario;
    }

    public void setAutor_ou_Usuario(boolean autor_ou_usuario) {
        this.usuario = autor_ou_usuario;
    }

    public void Definindo_autor() {
        if(usuario == true) {
            System.out.println( "O autor é usuario, publicando artigos." );
        } else {
            System.out.println( "O autor publica livros." );
        }
    }
}