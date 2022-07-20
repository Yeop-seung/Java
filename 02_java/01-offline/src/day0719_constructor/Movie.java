package day0719_constructor;

public class Movie {
	private String title;
	private String genre;

	public Movie setTitle(/* Movie this, */String title) {
		this.title = title;
		return this;
	}

	public Movie setGenre(/* Movie this, */String genre) {
		this.genre = genre;
		return this;
	}

	public String getTitle(/* Movie this */) {
		return this.title;
	}

	public String getGenre(/* Movie this */) {
		return this.genre;
	}
}
