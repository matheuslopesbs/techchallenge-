package br.com.fiap.soat8.grp14.techchallenge.application.ports.in;

import java.util.List;

import br.com.fiap.soat8.grp14.techchallenge.adapters.dto.PedidoDTO;
import br.com.fiap.soat8.grp14.techchallenge.domain.exceptions.EmptyItensException;

public interface PedidoServicePort {
    void processarPedido(Long pedidoId);

    List<PedidoDTO> buscarPedidos();

    void salvarPedido(PedidoDTO pedido) throws EmptyItensException;
}
