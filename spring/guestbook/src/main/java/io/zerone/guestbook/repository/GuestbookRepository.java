package io.zerone.guestbook.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.zerone.guestbook.domain.Guestbook;

@Repository
public class GuestbookRepository {
	
	@PersistenceContext // EntityManagerFactory가 DI 할 수 있게 해줌
	private EntityManager em;
	
	public List<Guestbook> findAll(){
		String jpql = "SELECT gb FROM Guestbook gb ORDER BY gb.regDate DESC";
		TypedQuery<Guestbook> query = em.createQuery(jpql, Guestbook.class);
		return query.getResultList();
	}
	
	public void save(Guestbook guestbook) {
		em.persist(guestbook);
	}
	
	public boolean remove(Guestbook guestbook) {
		String jpql = "select gb from guestbook gb where gb.no = :no and gb.pwd = :pwd";
		TypedQuery<Guestbook> query = em.createQuery(jpql, Guestbook.class);
		query.setParameter("no", guestbook.getNo());
		query.setParameter("pwd", guestbook.getPwd());

		List<Guestbook> guestbookList = query.getResultList();
		if( guestbookList.size() != 1 ) {
			return false;
		}
		
		em.remove(guestbookList.get(0));
		return true;
	}
}