package com.ftian.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ftian.dao.CatalogDAO;
import com.ftian.entity.Catalog;
import com.ftian.service.CatalogService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="/spring.xml")
public class TestCatalog {
	@Autowired
    private CatalogService ca;
	@Test
	public void test(){
		List<Catalog> list = ca.selectOneself("admin:show", null);
		System.out.println("list:"+list);
	}
}
