package br.com.fiap.myassist.model;

import br.com.fiap.myassist.enums.PrioridadeExecucaoEnum;
import br.com.fiap.myassist.enums.StatusExecucaoEnum;

import java.time.LocalDateTime;
import java.util.List;

public class OrdemServico {

    private Equipamento equipamento;
    private Cliente cliente;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataPrevisao;
    private String defeito;
    private PrioridadeExecucaoEnum prioridade;
    private List<Tecnico> responsaveis;
    private LocalDateTime dataSaida;
    private StatusExecucaoEnum status;

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(LocalDateTime dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public PrioridadeExecucaoEnum getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(PrioridadeExecucaoEnum prioridade) {
        this.prioridade = prioridade;
    }

    public List<Tecnico> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(List<Tecnico> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public StatusExecucaoEnum getStatus() {
        return status;
    }

    public void setStatus(StatusExecucaoEnum status) {
        this.status = status;
    }

}
