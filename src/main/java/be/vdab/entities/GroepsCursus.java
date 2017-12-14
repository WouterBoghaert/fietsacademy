package be.vdab.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="groepscursussen")
public class GroepsCursus extends Cursus {
	private static final long serialVersionUID = 1L;
	private LocalDate van;
	private LocalDate tot;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tot == null) ? 0 : tot.hashCode());
		result = prime * result + ((van == null) ? 0 : van.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof GroepsCursus))
			return false;
		GroepsCursus other = (GroepsCursus) obj;
		if (tot == null) {
			if (other.tot != null)
				return false;
		} else if (!tot.equals(other.tot))
			return false;
		if (van == null) {
			if (other.van != null)
				return false;
		} else if (!van.equals(other.van))
			return false;
		return true;
	}
}
