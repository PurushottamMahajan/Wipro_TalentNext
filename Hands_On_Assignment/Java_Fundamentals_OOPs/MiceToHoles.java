package tasksprograms;

/*
 there are n mice and n holes in a traight line each hole can only accomodate a single mice or mouse
a mouse can stay at his position move one step right x+1 or move a step to the left x-1 
any of these move will take one minite ur task is to assign mice to holes such that 
the time when the last mouse gets inside the hole is minimised */
 
	import java.util.Arrays;

	public class MiceToHoles {
	    public static int minTime(int[] mice, int[] holes) {
	        Arrays.sort(mice);
	        Arrays.sort(holes);
	        
	        int maxTime = 0;
	        for (int i = 0; i < mice.length; i++) {
	            int time = Math.abs(mice[i] - holes[i]);
	            maxTime = Math.max(maxTime, time);
	        }
	        return maxTime;
	    }

	    public static void main(String[] args) {
	        int[] mice = {4, -4, 2};
	        int[] holes = {4, 0, 5};

	        int result = minTime(mice, holes);
	        System.out.println("Minimum time when last mouse gets into hole: " + result + " minutes");
	    }
	}

