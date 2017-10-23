package com.ftian.service;
import java.util.List;
import com.ftian.entity.Catalog;
public interface CatalogService {
  //自连接查询
	public List<Catalog> selectOneself(String tag1,String tag2);
}
