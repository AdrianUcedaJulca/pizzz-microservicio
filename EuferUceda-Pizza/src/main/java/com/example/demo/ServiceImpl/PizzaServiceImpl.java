package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.PizzaDTO;
import com.example.demo.Repository.PizzaRepository;
import com.example.demo.Service.PizzaService;
import com.example.demo.mapper.PizzaResponseMapper;

@Service
public class PizzaServiceImpl implements PizzaService {
	
	@Autowired
	private PizzaRepository repo;
	
	@Autowired
	private PizzaResponseMapper prpm;

	@Override
	public List<PizzaDTO> listar() {
		// TODO Auto-generated method stub
		return prpm.ListarPizzaDtolist(repo.findAll());
	}

}
