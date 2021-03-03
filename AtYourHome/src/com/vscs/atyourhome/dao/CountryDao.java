package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.CountryBean;

public interface CountryDao {
	public void addCountry(CountryBean countryBean);

	 public List<CountryBean> getCountries();

	 public CountryBean getCountry(int cnt_id);

	/* public void deleteCountry(int cnt_id);*/
}
