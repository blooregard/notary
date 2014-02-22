package us.co.state.sos.notary.entity.sevices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import us.co.state.sos.notary.entity.Notary;

@Repository
public class NotaryService {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public String create(Notary notary) {
		entityManager.persist(notary);
		return "Success";
	}

	public Notary load(Long id) {
		Notary notary = entityManager.find(Notary.class, id);
		if (notary != null)
			System.out.format("Found Notary for %s accepted\n",
					notary.getName());
		return notary;
	}

	public List<Notary> list() {
		TypedQuery<Notary> query = entityManager.createQuery(
				"SELECT a from Notary as a", Notary.class);

		return query.getResultList();
	}
}
