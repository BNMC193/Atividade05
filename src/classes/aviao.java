package classes;

public class aviao extends BaseCaracteristicas{
    private int tamanhoTripulacao;

    public int getTamanhoTripulacao() {
        return tamanhoTripulacao;
    }

    public void setTamanhoTripulacao(int tamanhoTripulacao) {
        this.tamanhoTripulacao = tamanhoTripulacao;
    }
    
     public aviao(int codigo, String placa, int anoModelo, int anoFabricacao, String fabricante, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, String cor, int assentos, int portas, int rodas,
            String nome, String modelo, String chassi, double pesoLiquido, double pesoTotal, int qtdeMotores,
            int qtdeOcupantes, double potencia, String tipoCombustivel, int eixos, int tamanhoTripulacao) {
            super(codigo, placa, anoModelo, anoFabricacao, fabricante, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo,
                cor, assentos, portas, rodas, nome, modelo, chassi, pesoLiquido, pesoTotal, qtdeMotores, qtdeOcupantes,
                potencia, tipoCombustivel, eixos);
            this.tamanhoTripulacao = tamanhoTripulacao;
    }
}
