package com.beelab.intranet.repositorys;
import com.beelab.intranet.models.TicketModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<TicketModel, Long> {
    List<TicketModel> findAllByCreatorUidAndTypeAndStatus(Long creatorUid,String type, String status);
}
