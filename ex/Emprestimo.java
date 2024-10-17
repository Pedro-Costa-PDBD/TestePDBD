import java.util.Date;

public class Emprestimo {
    private Date data_retirada;
    private Date data_devolucao;
    private Livro livro;
    private Usuario usuario;


    public Date getData_retirada() {
        return data_retirada;
    }

    public void setData_retirada(Date data_retirada) {
        this.data_retirada = data_retirada;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Livro getLIvro() {
        return livro;
    }

    public void setLIvro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUSuario() {
        return usuario;
    }

    public void setUSuario(Usuario usuario) {
        this.usuario = usuario;
    }
}