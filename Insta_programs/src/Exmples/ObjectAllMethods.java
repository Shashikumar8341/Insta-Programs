package Exmples;

import java.util.Objects;

public class ObjectAllMethods {
	private String tittle;
	private String author;
	private int year;
	/**
	 * @param tittle
	 * @param author
	 * @param year
	 */
	public ObjectAllMethods(String tittle, String author, int year) {
		super();
		this.tittle = tittle;
		this.author = author;
		this.year = year;
	}
	@Override
	public String toString() {
		return "ObjectAllMethods [tittle=" + tittle + ", author=" + author + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, tittle, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectAllMethods other = (ObjectAllMethods) obj;
		return Objects.equals(author, other.author) && Objects.equals(tittle, other.tittle) && year == other.year;
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
public static void main(String[] args) {
	ObjectAllMethods oam=new ObjectAllMethods("Radhakrishna", "krishna", 1950);
	System.out.println(oam.tittle);
	System.out.println(oam.author);
	System.out.println(oam.year);
	System.out.println(oam.hashCode());
	System.out.println(oam.toString());
	System.out.println(oam.equals(oam));
}
}
