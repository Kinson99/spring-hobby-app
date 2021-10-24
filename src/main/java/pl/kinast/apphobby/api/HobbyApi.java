package pl.kinast.apphobby.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kinast.apphobby.dao.entity.Hobby;
import pl.kinast.apphobby.manager.HobbyManager;
import java.util.Optional;

@RestController
@RequestMapping("/api/hobbys")
public class HobbyApi {


    private HobbyManager hobbys;

    @Autowired
    public HobbyApi(HobbyManager hobbys) {
        this.hobbys = hobbys;
    }

    @GetMapping("/all")
    public Iterable<Hobby> getAll() {
        return hobbys.findAll();
    }

    @GetMapping
    public Optional<Hobby> getById(@RequestParam Long index) {
        return hobbys.findById(index);
    }

    @PostMapping
    public Hobby addVideo(@RequestBody Hobby videoCassette) {
        return hobbys.save(videoCassette);
    }

    @PutMapping
    public Hobby updateVideo(@RequestBody Hobby hobby) {
        return hobbys.save(hobby);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam Long index) {
        hobbys.deleteById(index);
    }
}