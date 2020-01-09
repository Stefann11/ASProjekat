package model;

public enum Zvanje {
	REDOVNI_PROFESOR("Redovni profesor"), VANDREDNI_PROFESOR("Vandredni profesor"), DOCENT("Docent");

	private String displayName;

	Zvanje(String displayName) {
        this.displayName = displayName;
    }
	
	public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
