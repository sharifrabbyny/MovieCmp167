import java.util.Arrays;

public class Movie {
	
	
	private String movieName;
	private int numMinutes;
	private boolean isKidFriendly;
	private int numCastMembers;
	private String[] castMembers;
	
	
	public Movie() {
		
		this.movieName = "Flick";
		this.numMinutes = 0;
		this.isKidFriendly = false;
		this.numCastMembers = 0;
		this.castMembers = new String[10];
	}
	


	public Movie(String movieName, int numMinutes, boolean isKidFriendly, String[] castMembers) {
	
		this.movieName = movieName;
		this.numMinutes = numMinutes;
		this.isKidFriendly = isKidFriendly;
		this.castMembers = Arrays.copyOf(castMembers, castMembers.length);
		
		if (xyz() == 0) {
			this.numCastMembers = 0;
			}
		else if (castMembers.equals(null)) {
			this.numCastMembers = 0;
		}
		
		else {
			this.numCastMembers = xyz();
		}
		
		
		
		
	}
	
	
	public int xyz() {
		
		int j = 0;
		
		for (String i : castMembers ) {
			
			if ( i != null) {
				
				j++;
			}
			
		}
		return j;
			
	
			
	}
	
	
	
	public void setNumMinutes(int numMinutes) {
		this.numMinutes = numMinutes;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public void setIsKidFriendly(boolean isKidFriendly) {
		
		if (isKidFriendly == true || isKidFriendly == false) {
			
			this.isKidFriendly = isKidFriendly;
		}
		
	}
	
	
	

	
	public String getMovieName() {
		return movieName;
	}


	public int getNumMinutes() {
		return numMinutes;
	}


	public boolean isKidFriendly() {
		return this.isKidFriendly;
	}


	public int getNumCastMembers() {
		return numCastMembers;
	}


	public String[] getCastMembers() {
		return Arrays.copyOf(castMembers, castMembers.length);
	}
	
	
	public boolean replaceCastMember(int index, String castMemberName) {
		
		if (index <0 || index >=numCastMembers) {
			
			return false;
		} else {
			castMembers[index] = castMemberName;
			return true;
		}

		
	}
	
	
	
	
	public boolean doArraysMatch(String[] arr1, String[] arr2) {
		
		 return Arrays.equals(arr1, arr2);

	    
	}
	
	
	public String getCastMemberNamesAsString() {
		
		String x= "";
		
		for (String i : castMembers) {
			if (i == null) {
				return "none";
			}
			
		}
		
		if (castMembers.length == 0 ) {
			return "none";
		}
		
		else {
			for (String i :castMembers) {
				x = x.trim();
				x += (" " + i + ",");
			}
			
			if (x.endsWith(",")) {
				x = x.substring(0, x.length()-1);
			}
			return x;			
		}
		
	}
	
	
	public String toString() {
		
		return String.format("Movie: [ Minutes %03d | Movie Name: %20s | %s | Number of Cast Members: %d | Cast Members: "+getCastMemberNamesAsString()+" ]",
				numMinutes, movieName, isKidFriendly ? "is kid friendly" : "not kid friendly",
                castMembers.length);
		
	}
	
	
	public boolean equals(Object o) {
		
		Movie m = (Movie) o; 
		
		if (o instanceof Movie) {

			return ((movieName.equalsIgnoreCase(m.movieName)) && (isKidFriendly == m.isKidFriendly)
					&& (numMinutes == m.numMinutes) && (numCastMembers == m.numCastMembers)
					&& (doArraysMatch(castMembers, m.castMembers)));
		}
		else if (o == null) {
			return false;
		}
		else {
			return false;
		}
		
		
		
	}
	
	

	
	
	
	

}
