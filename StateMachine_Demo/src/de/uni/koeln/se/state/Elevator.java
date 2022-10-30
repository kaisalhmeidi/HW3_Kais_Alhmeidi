package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	arrive_atFloor();


	}

	private void arrive_atFloor() {
			
		if(current_Floor < dest_Floor) {
			State.Current_State = State.Moving_up;
			System.out.println("Elevator's State is :" + State.Current_State);
			current_Floor++;
			arrive_atFloor();
		}else if (current_Floor > dest_Floor) {
			State.Current_State = State.Moving_down;
			System.out.println("Elevator's State is :" + State.Current_State);
			current_Floor--;
			arrive_atFloor();
		}else {
			State.Current_State = State.Exit; 
		}
		
	}
	

	public Elv_States getState() {
		return State;
	}

	public void setState(Elv_States state) {
		State = state;
	}
	
	

	
}
