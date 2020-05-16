package dawidvolkmer.springboot.repositories;


import dawidvolkmer.springboot.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
