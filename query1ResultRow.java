
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Aditya Adhikary
 * @author Ajay Balasubramanian
 *
 */

public class query1ResultRow extends queryResultRow {
	
	/**
	 * a model class for results of query1 to be displayed by GUI
	 */

	List<String> authors = new ArrayList<String>();
	String title;
	String pages;
	String year;
	String volume;
	
	String journalTitle;
	String url;
	
	Integer relevance;

	public Integer getRelevance() {
		return relevance;
	}

	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}

	boolean searchByDate;
	
	public boolean isSearchByDate() {
		return searchByDate;
	}

	public void setSearchByDate(boolean searchByDate) {
		this.searchByDate = searchByDate;
	}
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getJournalTitle() {
		return journalTitle;
	}

	public void setJournalTitle(String journalTitle) {
		this.journalTitle = journalTitle;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
