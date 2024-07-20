package com.wbarcellosn.usecase;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wbarcellosn.domain.Produto;
import com.wbarcellosn.domain.Produto.Status;
import com.wbarcellosn.exceptions.EntityNotFoundException;
import com.wbarcellosn.repository.IProdutoRepository;

@Service
public class BuscaProduto {

	private IProdutoRepository produtoRepository;
	
	public BuscaProduto(IProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Page<Produto> buscar(Pageable pageable) {
		return produtoRepository.findAll(pageable);
	}
	
	public Page<Produto> buscar(Pageable pageable, Status status) {
		return produtoRepository.findAllByStatus(pageable, status);
	}

	public Produto buscarPorCodigo(String codigo) {
		return produtoRepository.findByCodigo(codigo)
				.orElseThrow(() -> new EntityNotFoundException(Produto.class, "codigo", codigo));
	}

	
}