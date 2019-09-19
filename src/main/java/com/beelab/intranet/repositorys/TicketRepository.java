package com.beelab.intranet.repositorys;
import com.beelab.intranet.models.TicketModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketModel, Long> {
}
