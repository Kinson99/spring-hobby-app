package pl.kinast.apphobby.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kinast.apphobby.dao.entity.Hobby;

@Repository
public interface HobbyRepo extends CrudRepository<Hobby, Long> {
}