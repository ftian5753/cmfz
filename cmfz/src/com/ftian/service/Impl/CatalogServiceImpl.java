package com.ftian.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ftian.dao.CatalogDAO;
import com.ftian.entity.Catalog;
import com.ftian.service.CatalogService;
@Service
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
public class CatalogServiceImpl implements CatalogService {
	@Autowired
   public CatalogDAO catalogDAO;
	public List<Catalog> selectOneself(String tag1,String tag2) {
		List<Catalog> list=catalogDAO.selectOneself(tag1, tag2);
		
		return list;
	}

}
