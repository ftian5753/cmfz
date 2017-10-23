package com.ftian.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ftian.entity.Catalog;

public interface CatalogDAO {

	//自连接查询
	public List<Catalog> selectOneself(@Param("tag1")String tag1,@Param("tag2")String tag2);
}
