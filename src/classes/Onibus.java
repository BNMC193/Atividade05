package classes;

public class Onibus extends BaseTerrestres {
    private String sistemaCobranca;

    public String getSistemaCobranca() {
        return sistemaCobranca;
    }

    public void setSistemaCobranca(String sistemaCobranca) {
        this.sistemaCobranca = sistemaCobranca;
    }
    
    public Onibus(int codigo, String placa, int anoModelo, int anoFabricacao, String fabricante,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String cor, int assentos,
            int portas, int rodas, String nome, String modelo, String chassi, double pesoLiquido, double pesoTotal,
            int qtdeMotores, int qtdeOcupantes, double potencia, String tipoCombustivel, int eixos,
            String codigoRenavam, String sistemaCobranca) {
        super(codigo, placa, anoModelo, anoFabricacao, fabricante, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo,
                cor, assentos, portas, rodas, nome, modelo, chassi, pesoLiquido, pesoTotal, qtdeMotores, qtdeOcupantes,
                potencia, tipoCombustivel, eixos, codigoRenavam);
        this.sistemaCobranca = sistemaCobranca;
    }


}
