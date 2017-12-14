package be.vdab.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="individuelecursussen")
public class IndividueleCursus extends Cursus {
	private static final long serialVersionUID = 1L;
	private int duurtijd;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + duurtijd;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof IndividueleCursus))
			return false;
		IndividueleCursus other = (IndividueleCursus) obj;
		if (duurtijd != other.duurtijd)
			return false;
		return true;
	}
}
