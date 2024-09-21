package Exmples;

import java.util.Objects;

public class Ex2 {
	private String s;
	public void s1() {
		s+="hello";
	}
	@Override
	public int hashCode() {
		return Objects.hash(s);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex2 other = (Ex2) obj;
		return Objects.equals(s, other.s);
	}
	public static void main(String[] args) {
		Ex2 e=new Ex2();
		e.s="shashi"+9+9+9;
		System.out.println(e.s);
		System.out.println(e.hashCode());
		System.out.println(e.equals(e));
	}
}
