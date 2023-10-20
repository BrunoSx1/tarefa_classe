package Carro;

/**
 * Classe que representa um Carro.
 */
public class Carro {
    // Propriedades
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double velocidadeAtual;
    private boolean motorLigado;

    // Construtor
    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = 0.0;
        this.motorLigado = false;
    }

    // Método para ligar o motor
    public void ligarMotor() {
        if (!motorLigado) {
            motorLigado = true;
            System.out.println("O motor do carro está ligado.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    // Método para desligar o motor
    public void desligarMotor() {
        if (motorLigado) {
            motorLigado = false;
            velocidadeAtual = 0.0;
            System.out.println("O motor do carro está desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    // Método para acelerar o carro
    public void acelerar(double velocidade) {
        if (motorLigado) {
            velocidadeAtual += velocidade;
            System.out.println("O carro acelerou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Não é possível acelerar, o motor está desligado.");
        }
    }

    // Método para frear o carro
    public void frear() {
        if (motorLigado && velocidadeAtual > 0) {
            velocidadeAtual = 0.0;
            System.out.println("O carro freou completamente.");
        } else {
            System.out.println("O carro já está parado ou o motor está desligado.");
        }
    }

    // Método para obter informações do carro
    public void exibirInformacoes() {
        System.out.println("Carro: " + marca + " " + modelo + " - Ano de Fabricação: " + anoFabricacao);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("Motor está ligado: " + (motorLigado ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);
        meuCarro.ligarMotor();
        meuCarro.acelerar(60);
        meuCarro.exibirInformacoes();
        meuCarro.frear();
        meuCarro.desligarMotor();
        meuCarro.exibirInformacoes();
    }
}
