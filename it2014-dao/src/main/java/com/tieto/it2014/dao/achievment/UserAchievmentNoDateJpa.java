package com.tieto.it2014.dao.achievment;

import com.tieto.it2014.dao.JpaEntity;
import com.tieto.it2014.domain.achievment.entity.UserAchievement;
import com.tieto.it2014.domain.achievment.entity.UserAchievementNoDate;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACHIEVMENT")
public class UserAchievmentNoDateJpa implements JpaEntity<UserAchievementNoDate>, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "userId")
    private String imei;

    @Column(name = "achievmentId")
    private int achievementId;
    
    @Column(name = "date")
    private Long date;

    public UserAchievmentNoDateJpa() {
    }

    public UserAchievmentNoDateJpa(UserAchievementNoDate achievement) {
        this.achievementId = achievement.getAchievmentId();
        this.imei = achievement.getUserId();
        this.date = achievement.getDate();
    }

    @Override
    public UserAchievementNoDate toDomain() {
        return new UserAchievementNoDate(this.getId(), this.getAchievementId(), this.getDate(), this.getImei());
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the imei
     */
    public String getImei() {
        return imei;
    }

    /**
     * @param imei the imei to set
     */
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * @return the achievementId
     */
    public int getAchievementId() {
        return achievementId;
    }

    /**
     * @param achievementId the achievementId to set
     */
    public void setAchievementId(int achievementId) {
        this.achievementId = achievementId;
    }

    /**
     * @return the date
     */
    public Long getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Long date) {
        this.date = date;
    }


}