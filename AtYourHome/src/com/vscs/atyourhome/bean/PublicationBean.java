package com.vscs.atyourhome.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Publication")
public class PublicationBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "pubId")
	private Integer pubId;
	
	@Column(name="Title")
	private String pubTitle;
	
	@OneToOne
    @JoinColumn(name="categoryId")
	private CategoryBean category;
	
	@Column(name="content")
	private String pubContent;
	
	public Integer getPubId() {
		return pubId;
	}
	public void setPubId(Integer pubId) {
		this.pubId = pubId;
	}
	public String getPubTitle() {
		return pubTitle;
	}
	public void setPubTitle(String pubTitle) {
		this.pubTitle = pubTitle;
	}
	public String getPubContent() {
		return pubContent;
	}
	public CategoryBean getCategory() {
		return category;
	}
	public void setCategory(CategoryBean category) {
		this.category = category;
	}
	public void setPubContent(String pubContent) {
		this.pubContent = pubContent;
	}
}
