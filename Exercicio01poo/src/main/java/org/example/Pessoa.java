package org.example;

public class Pessoa {
    private String profissao;
    private int anosDeExperiencia;
    private String especialização;

    public Pessoa() {
    }

    public Pessoa(String profissao, int anosDeExperiencia, String especialização) {
        this.profissao = profissao;
        this.anosDeExperiencia = anosDeExperiencia;
        this.especialização = especialização;
    }

    public void exibirInformacoes() {
        System.out.println("profissao: " + profissao);
        System.out.println("anosDeExperiencia: " + anosDeExperiencia);
        System.out.println("especialização: " + especialização);
    }

    public void apresentar() {
        System.out.println(" Sou " + profissao + " tenho " + anosDeExperiencia + " anos de Experiência na área e " + " minha especialização é: " + especialização);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public String getEspecialização() {
        return especialização;
    }

    public void setEspecialização(String especialização) {
        this.especialização = especialização;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Médico", 10, "Cariologista");
        Pessoa pessoa2 = new Pessoa("Programador", 25, "FrontEnd");

        pessoa1.exibirInformacoes();
        pessoa1.apresentar();

        System.out.println();

        pessoa2.exibirInformacoes();
        pessoa2.apresentar();
    }
}