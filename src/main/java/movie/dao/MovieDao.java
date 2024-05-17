package movie.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import movie.dto.Movie;

@Repository
public class MovieDao {

	@Autowired
	EntityManager manager;

	public void saveMovie(Movie movie) {
		manager.getTransaction().begin();
		manager.persist(movie);
		manager.getTransaction().commit();
	}

	public List<Movie> fetchMovies() {
		return manager.createQuery("select x from Movie x").getResultList();
	}

	public List<Movie> fetchMoviesById(int id) {
		return manager.createQuery("select x from Movie x where id=?1").setParameter(1, id).getResultList();
	}

	public List<Movie> fetchMoviesByRating(double rating) {
		return manager.createQuery("select x from Movie x where rating >= ?1").setParameter(1, rating).getResultList();
	}

	public List<Movie> fetchMoviesByGenre(String genre) {
		return manager.createQuery("select x from Movie x where genre=?1").setParameter(1, genre).getResultList();
	}

	public List<Movie> fetchMoviesByLanguage(String language) {
		return manager.createQuery("select x from Movie x where language=?1").setParameter(1, language).getResultList();
	}

	public List<Movie> fetchMoviesByName(String name) {
		return manager.createQuery("select x from Movie x where name=?1").setParameter(1, name).getResultList();
	}

	public void deleteMovie(int id) {
		manager.getTransaction().begin();
		manager.remove(manager.find(Movie.class, id));
		manager.getTransaction().commit();
	}

	public Movie findMovie(int id) {
		return manager.find(Movie.class, id);
	}

	public void updateMovie(Movie movie) {
		manager.getTransaction().begin();
		manager.merge(movie);
		manager.getTransaction().commit();
	}
}
