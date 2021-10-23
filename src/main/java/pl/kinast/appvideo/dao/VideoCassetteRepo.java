package pl.kinast.appvideo.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kinast.appvideo.dao.entity.VideoCassette;

@Repository
public interface VideoCassetteRepo extends CrudRepository<VideoCassette, Long> {
}