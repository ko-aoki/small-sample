package com.example.exam.web;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exam.dao.MstEmployeeDao;
import com.example.exam.dto.ExamDto;
import com.example.exam.entity.MstEmployee;

@RestController
public class ExampleRestController {

	private MstEmployeeDao dao = null;

	public ExampleRestController(MstEmployeeDao dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping("api/exam")
	public ExamDto hello() {

		List<MstEmployee> list = this.dao.selectAll();

		ExamDto dto = new ExamDto();

		dto.setCode("001");
		dto.setMessage("hello");

		return  dto;

	}
}
