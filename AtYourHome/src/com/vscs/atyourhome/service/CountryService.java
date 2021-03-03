package com.vscs.atyourhome.service;

import java.util.List;

import com.vscs.atyourhome.bean.CountryBean;

public interface CountryService {
	public void addCountry(CountryBean countryBean);

	 public List<CountryBean> getCountries();

	 public CountryBean getCountry(int cnt_id);

/*	 public void deleteCountry(int cnt_id);
*/}
