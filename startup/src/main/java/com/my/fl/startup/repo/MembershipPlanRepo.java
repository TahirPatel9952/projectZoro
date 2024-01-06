package com.my.fl.startup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.my.fl.startup.entity.MembershipPlan;

@Repository
public interface MembershipPlanRepo extends JpaRepository<MembershipPlan, Integer> {

}
