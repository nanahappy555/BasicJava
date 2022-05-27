package chapter11;

import java.util.Objects;
//473p
public class Member {
	private String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}

}