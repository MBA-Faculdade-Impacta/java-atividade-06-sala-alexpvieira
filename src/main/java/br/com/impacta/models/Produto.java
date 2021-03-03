package br.com.impacta.models;

import java.util.ArrayList;

public class Produto {
  public int codigo;
  public String descricao;
  public double valor;
  
  public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codigoProduto) {
    for (int i = 0; i < listaDeProdutos.size(); i++) {
      Produto objetoDaLista = listaDeProdutos.get(i);
      if (objetoDaLista.codigo == codigoProduto) {
        return objetoDaLista;
      }
    }
    return null;
  }
}