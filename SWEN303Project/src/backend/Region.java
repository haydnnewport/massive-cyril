package backend;

public enum Region {
	Eastern_Africa, Middle_Africa, Northern_Africa, Southern_Africa, Western_Africa, Latin_America_and_the_Caribbean, Caribbean, Central_America, South_America, Central_Asia, Eastern_Asia, Southern_Asia, Western_Asia, Eastern_Europe, Northern_Europe, Southern_Europe, Western_Europe, Australia_and_New_Zealand, Melanesia, Micronesia, Polynesia;

	public static Region fromString(String in) {
		in = in.replace(' ', '_');
		return valueOf(in);
	}

	public String toString(){
		return super.toString().replace('_', ' ');
	}
}