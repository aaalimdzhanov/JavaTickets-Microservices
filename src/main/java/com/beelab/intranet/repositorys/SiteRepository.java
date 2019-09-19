package com.beelab.intranet.repositorys;

import com.beelab.intranet.models.SiteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface SiteRepository extends JpaRepository<SiteModel, Long> {

}
