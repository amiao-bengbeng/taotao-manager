package com.winner.mapper;

import com.winner.bean.TbItem;

public interface TbItemMapper {
	/**
	 * 查询数据库中的tbitem表，根据商品编号查询商品信息
	 * @param tbItemId商品编号
	 * @return
	 */
	TbItem findTbItemById(Long tbItemId);

}
