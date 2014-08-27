package com.tieto.it2014.dao.achievment.query;

import com.tieto.it2014.dao.JpaUtils;
import com.tieto.it2014.dao.achievment.AchievmentJpa;
import com.tieto.it2014.domain.achievment.entity.Achievment;
import com.tieto.it2014.domain.achievment.query.UserAchievmentsQuery;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserAchievmentsQueryDaoJpa implements UserAchievmentsQuery.Dao {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List<Achievment> result(String imei) {
//        TypedQuery<AchievmentJpa> query = em.createQuery(
//                "SELECT u FROM AchievmentJpa u", AchievmentJpa.class);
//        return JpaUtils.toDomainList(query.getResultList());
        TypedQuery<AchievmentJpa> query = em.createQuery(
                "SELECT u FROM AchievmentJpa u", AchievmentJpa.class);
        return JpaUtils.toDomainList(query.getResultList());
    }

}
