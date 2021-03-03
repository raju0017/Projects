package com.vscs.atyourhome.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.bean.CountryBean;

@Repository("countryDao")
public class CountryDaoImpl implements CountryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addCountry(CountryBean countryBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(countryBean);

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<CountryBean> getCountries() {
		return (List<CountryBean>) sessionFactory.getCurrentSession().createCriteria(CountryBean.class).list();

	}

	@Override
	public CountryBean getCountry(int cnt_id) {
		return (CountryBean) sessionFactory.getCurrentSession().get(CountryBean.class, cnt_id);

	}

	/*@Override
	public void deleteCountry(int cnt_id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM CountryBean WHERE cnt_id = "+cnt_id).executeUpdate();
}*/

}
