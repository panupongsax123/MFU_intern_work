package com.mfu.MFU_intern_work.modelGames;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="games_list")


public class ModelGames implements Serializable {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		
		@Column(name="id")
		private int id;
		
        @Column(name="name")
        private String name;
        
        @Column(name="category")
        private String category;
        
        @Column(name="release_date")
        private String  release_date;
        
        @Column(name="price")
        private int price;
        
        @Column(name="produce_by")
        private String produce_by;

        public ModelGames() {
	    }

		
        public ModelGames(int id, String name, String category, String release_date, int price, String produce_by) {
			
        	super();
			this.id = id;
			this.name = name;
			this.category = category;
			this.release_date = release_date;
			this.price = price;
			this.produce_by = produce_by;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getRelease_date() {
			return release_date;
		}

		public void setRelease_date(String release_date) {
			this.release_date = release_date;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getProduce_by() {
			return produce_by;
		}

		public void setProduce_by(String produce_by) {
			this.produce_by = produce_by;
		}

	
}

	
		




