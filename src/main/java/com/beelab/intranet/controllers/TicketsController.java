package com.beelab.intranet.controllers;

import com.beelab.intranet.models.UserModel;
import com.beelab.intranet.repositorys.TicketRepository;
import com.beelab.intranet.repositorys.UserRepository;
import com.beelab.intranet.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
@CrossOrigin
public class TicketsController {

        @Autowired
        TicketRepository ticketRepository;


        @GetMapping("/all")
        ResponseEntity<?> getAllTickets(){
                try {
                        return Response.result(ticketRepository.findAll());
                }catch (Exception ex){
                        return Response.error(ex);
                }
        }
        @GetMapping("/getTicketById")
        public ResponseEntity<?> getTicketById(@RequestParam(name = "id") long id) {
                try {
                        return Response.result(ticketRepository.findById(id));
                }catch (Exception ex){
                        return Response.error(ex);
                }
        }

        @GetMapping("/getNumberOfIncByUserId")
        public ResponseEntity<?> getNumberOfIncByUserId(@RequestParam(name = "id") long id,
                                                        @RequestParam(name = "type") String type){
            String status = "New";
            try {
                return Response.result(ticketRepository.findAllByCreatorUidAndTypeAndStatus(id,type,status).size());
            }catch (Exception ex){
                return Response.error(ex);
            }
        }

}
