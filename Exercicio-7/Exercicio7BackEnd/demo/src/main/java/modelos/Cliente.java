package modelos;

public class Cliente {

    private Double saldo;
    private String senha;
    private String nome;
    private Transacao transacao;

    public Cliente(double saldo, String senha, String nome, Transacao transacao) {
        this.saldo = saldo;
        this.senha = senha;
        this.nome = nome;
        this.transacao = transacao;
    }



    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTransacao() {
        return transacao.getQuantidade();
    }
    public void setCliente(Cliente cliente) {
    }
}
