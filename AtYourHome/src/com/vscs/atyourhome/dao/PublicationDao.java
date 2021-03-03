package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.PublicationBean;

public interface PublicationDao {
	
	public void addPublication(PublicationBean publicationBean);
	
	public List<PublicationBean> getPublications();
	
	public PublicationBean getPublication(int pubId);
	
	public void deletePublication(int pubId);
}
