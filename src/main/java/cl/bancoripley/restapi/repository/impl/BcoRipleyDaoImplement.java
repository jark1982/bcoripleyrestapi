package cl.bancoripley.restapi.repository.impl;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cl.bancoripley.restapi.entty.CreditoCliente;
import cl.bancoripley.restapi.repository.dao.BcoRipleyDao;


@Repository
public class BcoRipleyDaoImplement implements BcoRipleyDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public List<CreditoCliente> getAllCreditoCliente() {
		Session session = this.sessionFactory.getCurrentSession();
		List<CreditoCliente> creditoClienteList = session.createNativeQuery("Select * from credito_clientes", CreditoCliente.class).list();
		return creditoClienteList;
	}

	@Override
	public CreditoCliente getCreditoCliente(BigDecimal folio) {
		Session session = this.sessionFactory.getCurrentSession();
		CreditoCliente creditoCliente = (CreditoCliente) session.get(CreditoCliente.class, folio);
		return creditoCliente;
	}

	@Override
	public CreditoCliente addCreditoCliente(CreditoCliente creditoCliente) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(creditoCliente);
		return creditoCliente;
	}

	@Override
	public void updateCreditoCliente(CreditoCliente creditoCliente) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(creditoCliente);
	}

	@Override
	public void deleteCreditoCliente(BigDecimal folio) {
		Session session = this.sessionFactory.getCurrentSession();
		CreditoCliente p = (CreditoCliente) session.load(CreditoCliente.class, folio);
		if (null != p) {
			session.delete(p);
		}
	}

}
