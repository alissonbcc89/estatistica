import java.util.Objects;

public class Questionario {



    private int idade, qntfilho, qnt_pessoa_casa;
    private String nome, profissao, telefone, escolaridade, religiao, sexo, naturalidade,estado,etnia, estado_civil;
    private double salario, peso, altura;


    public Questionario(String nome,int idade, String profissao,double salario, double peso,
                        String telefone,String escolaridade,int qnt_pessoa_casa,int qntfilho,
                        double altura,String religiao, String sexo,String naturalidade, String estado,
                        String etnia, String estado_civil) {

        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.salario = salario;
        this.peso = peso;
        this.telefone = telefone;
        this.escolaridade = escolaridade;
        this.qnt_pessoa_casa = qnt_pessoa_casa;
        this.qntfilho = qntfilho;
        this.altura = altura;
        this.religiao = religiao;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
        this.estado = estado;
        this.etnia = etnia;
        this.estado_civil = estado_civil;



    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQntfilho() {
        return qntfilho;
    }

    public void setQntfilho(int qntfilho) {
        this.qntfilho = qntfilho;
    }

    public int getQnt_pessoa_casa() {
        return qnt_pessoa_casa;
    }

    public void setQnt_pessoa_casa(int qnt_pessoa_casa) {
        this.qnt_pessoa_casa = qnt_pessoa_casa;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questionario that = (Questionario) o;
        return idade == that.idade && qntfilho == that.qntfilho && qnt_pessoa_casa == that.qnt_pessoa_casa && Double.compare(that.salario, salario) == 0 && Double.compare(that.peso, peso) == 0 && Double.compare(that.altura, altura) == 0 && Objects.equals(nome, that.nome) && Objects.equals(profissao, that.profissao) && Objects.equals(telefone, that.telefone) && Objects.equals(escolaridade, that.escolaridade) && Objects.equals(religiao, that.religiao) && Objects.equals(sexo, that.sexo) && Objects.equals(naturalidade, that.naturalidade) && Objects.equals(estado, that.estado) && Objects.equals(etnia, that.etnia) && Objects.equals(estado_civil, that.estado_civil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idade, qntfilho, qnt_pessoa_casa, nome, profissao, telefone, escolaridade, religiao, sexo, naturalidade, estado, etnia, estado_civil, salario, peso, altura);
    }


    @Override
    public String toString() {

        //nome,idade,profissao, salario,  peso,
        //telefone,escolaridade,qnt_pessoa_casa,int qntfilho,
        // altura,String religiao, String sexo,String naturalidade, String estado,
        //                        String etnia, String estado_civil
        return
                        "\n"+nome+"\t"+
                        idade+"\t"+
                        profissao+"\t"+
                        salario +"\t"+
                        peso+"\t"+
                        telefone+"\t"+
                        escolaridade+"\t"+
                        qnt_pessoa_casa+"\t"+
                        qntfilho+"\t"+
                        altura+"\t"+
                        religiao+"\t"+
                        sexo+"\t"+
                        naturalidade+"\t"+
                        estado+"\t"+
                        etnia+"\t"+
                        estado_civil+"\t"
                ;

    }
}
