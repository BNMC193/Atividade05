package classes;

public abstract class BaseTerrestres extends BaseCaracteristicas {
    protected String codigoRenavam;

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public BaseTerrestres(int codigo, String placa, int anoModelo, int anoFabricacao, String fabricante,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String cor, int assentos,
            int portas, int rodas, String nome, String modelo, String chassi, double pesoLiquido, double pesoTotal,
            int qtdeMotores, int qtdeOcupantes, double potencia, String tipoCombustivel, int eixos,
            String codigoRenavam) {
        super(codigo, placa, anoModelo, anoFabricacao, fabricante, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo,
            cor, assentos, portas, rodas, nome, modelo, chassi, pesoLiquido, pesoTotal, qtdeMotores, qtdeOcupantes,
            potencia, tipoCombustivel, eixos);
        this.codigoRenavam = codigoRenavam;
    }
    
}
