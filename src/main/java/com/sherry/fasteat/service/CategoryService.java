package com.sherry.fasteat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sherry.fasteat.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
