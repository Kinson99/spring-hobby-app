package pl.kinast.apphobby.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.kinast.apphobby.dao.HobbyRepo;
import pl.kinast.apphobby.dao.entity.Hobby;

import java.util.Optional;

@Service
public class HobbyManager {

    private HobbyRepo hobbyRepo;

    @Autowired
    public HobbyManager(HobbyRepo hobbyRepo) {
        this.hobbyRepo = hobbyRepo;
    }

    public Optional<Hobby> findById(Long id) {
        return hobbyRepo.findById(id);
    }

    public Iterable<Hobby> findAll() {
        return hobbyRepo.findAll();
    }

    public Hobby save(Hobby hobby) {
        return hobbyRepo.save(hobby);
    }

    public void deleteById(Long id) {
        hobbyRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Hobby(1L,"Chess"));
        save(new Hobby(2L,"Football"));
    }

}