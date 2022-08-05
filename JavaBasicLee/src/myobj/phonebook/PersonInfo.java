package myobj.phonebook;

import java.util.Comparator;

public class PersonInfo {

	final public static int NUMBER_COLUMN = 0;
	final public static int NAME_COLUMN = 1;
	final public static int GROUP_COLUMN = 2;
	String number;
	String group;
	String name;
	
	
	public PersonInfo(String group, String number, String name) {
		this.group = group;
		this.number = number;
		this.name = name;
	}
	
	public String getGroup() {
		return group;
	}
	
	public String getNumer() {
		return number;
	}
		
	public static Comparator<PersonInfo> getComparator(int column, boolean asc){
		return new Comparator<PersonInfo>() {

			@Override
			public int compare(PersonInfo o1, PersonInfo o2) {
				switch (column) {
				case NUMBER_COLUMN:
					return o1.number.compareTo(o2.number) * (asc ? 1 : -1);
				case GROUP_COLUMN:
					return o1.group.compareTo(o2.group) * (asc ? 1 : -1);
				case NAME_COLUMN:
					return o1.name.compareTo(o2.name) * (asc ? 1 : -1);
					default:
						return 0;
				}
			}
		};
	}
	
	public boolean checkByName(String query) {
		return name.contains(query);
	}
	
	public boolean checkByNumber(String query) {
		return number.contains(query);
	}
	
	@Override
	public String toString() {
		return String.format("[%s,%s,%s]", group,number,name);
	}
}
