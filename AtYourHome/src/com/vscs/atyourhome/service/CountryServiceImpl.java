package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.CountryBean;
import com.vscs.atyourhome.dao.CountryDao;

@Service("countryService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class CountryServiceImpl implements CountryService {

	
	@Autowired
	private CountryDao countryDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addCountry(CountryBean countryBean) {
		countryDao.addCountry(countryBean);
	}

	@Override
	public List<CountryBean> getCountries() {
		
		return countryDao.getCountries();
	}

	@Override
	public CountryBean getCountry(int cnt_id) {
		return countryDao.getCountry(cnt_id);
	}

//	@Override
//	public void deleteCountry(int cnt_id) {
//		 countryDao.deleteCountry(cnt_id);
//	}

}
