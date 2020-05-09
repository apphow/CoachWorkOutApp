package com.cameronscaptures;

public interface Coach {
	// the App getDailyWorkout should work with any type of coach
	// Software Engineering Best Practice: Code to an interface
	// So instead of coding directly to the baseball coach implementation
	// we'll make use of a a well defined interface that all coaches will support
	
	public String getDailyWorkout();
	// interface doesn't have any implementation code. 
	// it's only a specification so it simply says what
	// is available, but not how it's implemented.
}
