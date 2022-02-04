package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.demo.Dto.PizzaDTO;
import com.example.demo.Entity.Pizza;

@Mapper(componentModel = "spring")
public interface PizzaResponseMapper {
	
	@Mappings(value = {
			@Mapping(source = "id", target = "idPizza"),
			@Mapping(source = "nombre", target = "nombrePizza"),
			@Mapping(source = "descripcion", target = "descripcionPizza")
	})
	PizzaDTO estudianteDTO(Pizza pizza);
	
	List<PizzaDTO> ListarPizzaDtolist(List<Pizza> listar);

}
