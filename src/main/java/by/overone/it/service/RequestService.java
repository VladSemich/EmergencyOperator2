package by.overone.it.service;

import by.overone.it.entity.Request;
import by.overone.it.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public void save(
        String authorId,
        String authorUsername,
        String requestName
        String message
    ) {
       Request request = new Request();
       request.setAuthorId(authorId);
       request.setAuthor(authorUsername);
       request.setRequestName(requestName);
       request.setMessage(message);
       request.setCreateDate(LocalDateTime.now());
       save (request);
    }

    public void save (String authorId, String authorUsername, String requestName, String message){

    }
    private void save (Request request) {
        requestRepository.save(request);
    }
    public List<Request> getAllRequest(){
        return RequestRepository.findAll();


    }

}
