package com.example.demo.mapper;

import com.example.demo.Dto.PizzaDTO;
import com.example.demo.Entity.Pizza;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-03T22:29:53-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17 (Eclipse Adoptium)"
)
@Component
public class PizzaResponseMapperImpl implements PizzaResponseMapper {

    @Override
    public PizzaDTO estudianteDTO(Pizza pizza) {
        if ( pizza == null ) {
            return null;
        }

        PizzaDTO pizzaDTO = new PizzaDTO();

        pizzaDTO.setNombrePizza( pizza.getNombre() );
        pizzaDTO.setDescripcionPizza( pizza.getDescripcion() );
        pizzaDTO.setIdPizza( pizza.getId() );

        return pizzaDTO;
    }

    @Override
    public List<PizzaDTO> ListarPizzaDtolist(List<Pizza> listar) {
        if ( listar == null ) {
            return null;
        }

        List<PizzaDTO> list = new ArrayList<PizzaDTO>( listar.size() );
        for ( Pizza pizza : listar ) {
            list.add( estudianteDTO( pizza ) );
        }

        return list;
    }
}
