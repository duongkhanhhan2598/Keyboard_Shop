package edu.poly.thi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DanhMuc")
public class category {
	@Id
	String madanhmuc;
	
	String tendanhmuc;
}
