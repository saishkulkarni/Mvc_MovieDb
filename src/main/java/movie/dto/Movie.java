package movie.dto;

import java.io.IOException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Entity
@Data
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String language;
	private String genre;
	private double rating;
	@Lob
	private byte[] picture;

	public void setPicture(MultipartFile file) {
		try {
			byte[] picture = new byte[file.getInputStream().available()];
			file.getInputStream().read(picture);
			this.picture = picture;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
