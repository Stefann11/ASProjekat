package model;

public enum Titula{
	PROF_DR("Prof dr"), DR("Dr"); 
	
	 private String displayName;

	Titula(String displayName) {
        this.displayName = displayName;
    }
	
	public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }

}
