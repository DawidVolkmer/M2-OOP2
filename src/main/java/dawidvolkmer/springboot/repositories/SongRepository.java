package dawidvolkmer.springboot.repositories;

import dawidvolkmer.springboot.model.Artist;
import dawidvolkmer.springboot.model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {

    List<Song> getAllByArtistsIsContaining(Artist artist);
}
