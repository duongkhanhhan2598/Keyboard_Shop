package edu.poly.thi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.thi.dao.categoryDAO;
import edu.poly.thi.entity.category;


public class ThiController {
	@Autowired
	categoryDAO dao;
	
	
	@RequestMapping("/category")
	public String cate(Model model) {
		category item = new category();
		model.addAttribute("item", item);
		List<category> items = dao.findAll();
		model.addAttribute("items", items);
		return "QuanLyDanhMuc";
	}

	@RequestMapping("/category/create")
	public String create(Model model, category item) {
		dao.save(item);
		model.addAttribute("thongbao", "Thêm mới thành công!");
		return "forward:/category";
	}
	
	@RequestMapping("/category/update")
	public String update(Model model, category item) {
		dao.save(item);
		model.addAttribute("thongbao", "Cập nhật thành công!");
		return "forward:/category";
	}
	
	@RequestMapping("/category/delete/{id}")
	public String delete(Model model, @PathVariable("id") String id) {
		dao.deleteById(id);
		model.addAttribute("thongbao", "Xoá thành công!");
		return "forward:/category";
	}
	
	@RequestMapping("/category/edit/{id}")
	public String edit(Model model, @PathVariable("id") String id) {
		category item = dao.findById(id).get();
		model.addAttribute("item", item);
		List<category> items = dao.findAll();
		model.addAttribute("items", items);
		return "QuanLyDanhMuc";
	}
	
}
