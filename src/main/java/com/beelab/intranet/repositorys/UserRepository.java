package com.beelab.intranet.repositorys;
import com.beelab.intranet.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
