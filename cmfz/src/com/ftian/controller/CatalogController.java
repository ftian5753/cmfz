package com.ftian.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ftian.entity.Catalog;
import com.ftian.service.CatalogService;
@Controller
@RequestMapping("/con")
public class CatalogController {
	@Autowired
	private CatalogService catalogService;
    @RequestMapping("/cat")
    @ResponseBody
	public List<Catalog> selectOneSelf(String tag1,String tag2){
    	List<Catalog> list=catalogService.selectOneself(tag1, tag2);
		return list;
	}
}
