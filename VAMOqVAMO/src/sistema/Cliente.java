package sistema;

public class Cliente {

    private int codigo;
    private String nome;
    private String login;
    private String email;
    private String senha;

    public Cliente(String nome, String login, String email, String senha) {
        super();
        this.nome = nome;
        this.login = login;
        this.email = email;
        this.senha = senha;
    }

    public Cliente() {}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}