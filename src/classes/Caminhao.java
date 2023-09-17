package classes;

public class Caminhao extends BaseTerrestres {
    private int tamanhoCarga;

    public int getTamanhoCarga() {
        return tamanhoCarga;
    }

    public void setTamanhoCarga(int tamanhoCarga) {
        this.tamanhoCarga = tamanhoCarga;
    }

     public Caminhao(int codigo, String placa, int anoModelo, int anoFabricacao, String fabricante,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String cor, int assentos,
            int portas, int rodas, String nome, String modelo, String chassi, double pesoLiquido, double pesoTotal,
            int qtdeMotores, int qtdeOcupantes, double potencia, String tipoCombustivel, int eixos,
            String codigoRenavam, int tamanhoCarga) {
        super(codigo, placa, anoModelo, anoFabricacao, fabricante, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo,
                cor, assentos, portas, rodas, nome, modelo, chassi, pesoLiquido, pesoTotal, qtdeMotores, qtdeOcupantes,
                potencia, tipoCombustivel, eixos, codigoRenavam);
        this.tamanhoCarga = tamanhoCarga;
    }
}
