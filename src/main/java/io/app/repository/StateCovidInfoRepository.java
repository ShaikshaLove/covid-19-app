package io.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.app.model.StateCovidInfo;
@Repository
public interface StateCovidInfoRepository extends JpaRepository<StateCovidInfo, Integer> {
       StateCovidInfo findByStateName(String name);
}
