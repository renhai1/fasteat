package com.sherry.fasteat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sherry.fasteat.entity.AddressBook;
import com.sherry.fasteat.mapper.AddressBookMapper;
import com.sherry.fasteat.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
