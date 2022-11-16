
public class ChemicalElement implements Comparable<ChemicalElement>{
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	ChemicalElement left;
	ChemicalElement right;
	
	
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	public ChemicalElement() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}
	/*@Override
	public int compareTo(ChemicalElement s) {										//compare with atomicNumber
		
		System.out.println("Comapring "+atomicNumber+" with "+s.atomicNumber);
		return Integer.compare(atomicNumber, s.atomicNumber);
	}*/
	@Override
	public int compareTo(ChemicalElement s) {										//compare with atomicName
		
		System.out.println("Comapring "+atomicName+" with "+s.atomicName);
		return atomicName.compareTo(s.atomicName);
	
	}
	/*@Override
	public int compareTo(ChemicalElement s) {									    //compare with atomicFormula
		System.out.println("________________________________________________");
		
		System.out.println("Comapring "+atomicWeight+" with "+s.atomicWeight);
		return Float.compare(atomicWeight ,s.atomicWeight);
}
	@Override
	public int compareTo(ChemicalElement s) {										//compare with atomicName
		
		System.out.println("Comapring "+atomicFormula+" with "+s.atomicFormula);
		return atomicFormula.compareTo(s.atomicFormula);
}*/
}
