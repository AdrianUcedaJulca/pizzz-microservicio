package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.PizzaDTO;
import com.example.demo.Service.PizzaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Pizza API")
@RestController
@RequestMapping("/pizza")
public class PizzaController {

	
	@Autowired
	private PizzaService service;
	
	@ApiOperation(value = "Listar pizzas", notes = "Listar pizzas")
	@ApiResponses(value = {
			@ApiResponse(code = 401, message = "No existe"),
			@ApiResponse(code = 201, message = "creado")
	})
	@GetMapping("/listar")
	public @ResponseBody List<PizzaDTO> listarPizzas(){
		return service.listar();
	}
}
