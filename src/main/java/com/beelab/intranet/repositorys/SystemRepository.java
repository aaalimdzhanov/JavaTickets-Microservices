package com.beelab.intranet.repositorys;

import com.beelab.intranet.models.SystemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface SystemRepository extends JpaRepository<SystemModel, Long> {

}
