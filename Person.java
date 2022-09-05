class Person implements Comparable{
        	private String firstName, lastName, phoneNumber;

        	public Person(String first, String last, String tele){
        		firstName = first;
        		lastName = last;
        		phoneNumber = tele;
        	}

        	public String toString(){
        		return lastName + ", " + firstName + "\t" + phoneNumber;
        	}

        	public int compareTo(Object other){
        		int result;

        		if(lastName.equals(((Person)other).lastName))
        			result = firstName.compareTo(((Person)other).firstName);
        		else
        			result = lastName.compareTo(((Person)other).lastName);
        		return result;
        	}
}