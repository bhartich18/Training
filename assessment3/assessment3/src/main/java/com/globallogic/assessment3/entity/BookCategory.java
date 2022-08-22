package com.globallogic.assessment3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="bookcategory")
	public class BookCategory {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Override
		public String toString() {
			return "BookCategory [id=" + id + ", categoryname=" + categoryname + "]";
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getCategoryname() {
			return categoryname;
		}


		public void setCategoryname(String categoryname) {
			this.categoryname = categoryname;
		}


		private String categoryname;
		
		
		public BookCategory() {
		}
}
