package classes;

public abstract class BaseCaracteristicas extends BaseVeiculo {
    protected String cor;
    protected int assentos;
    protected int portas;
    protected int rodas;
    protected String nome;
    protected String modelo;
    protected String chassi;
    protected double pesoLiquido;
    protected double pesoTotal;
    protected int qtdeMotores;
    protected int qtdeOcupantes;
    protected double potencia;
    protected String tipoCombustivel;
    protected int eixos;
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public BaseCaracteristicas(int codigo, String placa, int anoModelo, int anoFabricacao, String fabricante,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String cor, int assentos,
            int portas, int rodas, String nome, String modelo, String chassi, double pesoLiquido, double pesoTotal,
            int qtdeMotores, int qtdeOcupantes, double potencia, String tipoCombustivel, int eixos) {
        super(codigo, placa, anoModelo, anoFabricacao, fabricante, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.cor = cor;
        this.assentos = assentos;
        this.portas = portas;
        this.rodas = rodas;
        this.nome = nome;
        this.modelo = modelo;
        this.chassi = chassi;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.eixos = eixos;

 }
}