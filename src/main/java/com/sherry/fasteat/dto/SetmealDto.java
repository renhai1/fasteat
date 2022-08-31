package com.sherry.fasteat.dto;

import com.sherry.fasteat.entity.Setmeal;
import com.sherry.fasteat.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
