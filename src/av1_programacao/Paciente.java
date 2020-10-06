package av1_programacao;

class Paciente implements Comparable<Paciente>{

    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int compareTo(Paciente outroPaciente) {
        if (this.idade > outroPaciente.idade) {
            return -1;
        }
        if (this.idade < outroPaciente.idade) {
            return 1;
        }
        return 0;
    }

}
