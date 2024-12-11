package SistemaNotas;

import java.sql.Date;

public class NotaPedido {
    private int idNota;
    private int idPedido;
    private String estado;
    private String numeroNotaFiscal;
    private String fornecedor;
    private String itens;
    private Date dia;

    public NotaPedido(int idNota, int idPedido, String estado, String numeroNotaFiscal, String fornecedor, String itens, Date dia) {
        this.idNota = idNota;
        this.idPedido = idPedido;
        this.estado = estado;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.fornecedor = fornecedor;
        this.itens = itens;
        this.dia = dia;
    }

    public int getIdNota() {
        return idNota;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getEstado() {
        return estado;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public String getItens() {
        return itens;
    }

    public Date getDia() {
        return dia;
    }

    @Override
    public String toString() {
        return "NotaPedido [idNota=" + idNota + ", idPedido=" + idPedido + ", estado=" + estado + ", numeroNotaFiscal=" + numeroNotaFiscal + ", fornecedor=" + fornecedor + ", itens=" + itens + ", dia=" + dia + "]";
    }
}