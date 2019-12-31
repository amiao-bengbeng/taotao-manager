package com.winner.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winner.bean.TbItem;
import com.winner.mapper.TbItemMapper;
import com.winner.service.TbItemService;
@Service
public class TbItemServiceImpl implements TbItemService {
	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public TbItem findTbItemById(Long tbItemId) {
		TbItem tbItem=tbItemMapper.findTbItemById(tbItemId);
		return tbItem;
	}

}
