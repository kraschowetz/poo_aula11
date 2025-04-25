package model;

public class Cachorro {
    private RacaDeCachorro raca;
    private String nome;
    private byte idade;

    public RacaDeCachorro getRaca() {
        return raca;
    }
    public void setRaca(RacaDeCachorro raca) {
        this.raca = raca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public Cachorro(RacaDeCachorro raca, String nome, byte idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro [raca=" + raca + ", nome=" + nome + ", idade=" + idade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((raca == null) ? 0 : raca.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + idade;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return (
            this == obj || 
            (
                raca == ((Cachorro)(obj)).getRaca() &&
                nome.equals(((Cachorro)obj).getNome()) &&
                idade == ((Cachorro)(obj)).getIdade()
            )
        );
    }
}
