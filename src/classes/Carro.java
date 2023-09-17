package classes;

public class Carro extends BaseTerrestres {

    public Carro(int codigo, String placa, int anoModelo, int anoFabricacao, String fabricante, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, String cor, int assentos, int portas, int rodas,
            String nome, String modelo, String chassi, double pesoLiquido, double pesoTotal, int qtdeMotores,
            int qtdeOcupantes, double potencia, String tipoCombustivel, int eixos, String codigoRenavam) {
        super(codigo, placa, anoModelo, anoFabricacao, fabricante, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, cor,
                assentos, portas, rodas, nome, modelo, chassi, pesoLiquido, pesoTotal, qtdeMotores, qtdeOcupantes, potencia,
                tipoCombustivel, eixos, codigoRenavam);
    }
    
}
