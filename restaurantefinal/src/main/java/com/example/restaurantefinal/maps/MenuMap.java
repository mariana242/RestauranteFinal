package com.example.restaurantefinal.maps;

import com.example.restaurantefinal.dto.MenuResponseDTO;
import com.example.restaurantefinal.entity.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;


@Mapper (componentModel = "spring")
public interface MenuMap {
    @Mappings({
            @Mapping(source= "nombrePlato", target= "nombre"),
            @Mapping(source= "precio", target= "precio"),
            @Mapping(source="url", target= "url"),
            @Mapping(source= "descripcion", target="descripcion"),
            @Mapping(source= "estado", target="estado")

    })
    MenuResponseDTO transformarMenu (Menu menu);
    List<MenuResponseDTO> transformarListaMenu(List<Menu> ListaMenu);


}
