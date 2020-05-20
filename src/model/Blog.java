package model;

import java.time.LocalDate;

// Type your code
public class Blog{
	String title;
	String description;
	LocalDate postedOn;
	
	public Blog(String title, String description, LocalDate postedOn) {
		super();
		this.title=title;
		this.description=description;
		this.postedOn=postedOn;
	}

	public String getBlogTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBlogDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return postedOn;
	}

	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}

}