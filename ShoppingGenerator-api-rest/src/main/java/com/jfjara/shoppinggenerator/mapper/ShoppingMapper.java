package com.jfjara.shoppinggenerator.mapper;

import com.jfjara.shoppinggenerator.model.Shopping;
import com.jfjara.shoppinggenerator.model.ShoppingDTO;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface ShoppingMapper {


    @Named("asShopping")
    Shopping asShopping(ShoppingDTO dto);

    @IterableMapping(qualifiedByName = "asShopping")
    List<Shopping> asShoppingList(List<ShoppingDTO> dto);


}
