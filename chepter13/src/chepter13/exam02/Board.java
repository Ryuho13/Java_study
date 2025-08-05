package chepter13.exam02;

public class Board {
	private String subject;
	private String cotent;
	private String writer;
	
	public Board(String subject, String cotent, String writer) {
		this.subject = subject;
		this.cotent = cotent;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCotent() {
		return cotent;
	}
	public void setCotent(String cotent) {
		this.cotent = cotent;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
	

}
