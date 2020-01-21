import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException {
		
		Scanner sc= new Scanner(System.in);
		List<Integer> noOfEvents= new ArrayList<Integer>();
		System.out.println("Enter the number of halls:");
		int n= Integer.parseInt(sc.nextLine());
		System.out.print("Enter the hall details in comma separated(Name,Cost per day,Event Type-1,Event Type-2,.....,Event Type-n)\n");
		Eventtype et= new Eventtype();
		Hall h= new Hall();
		for(int i=0;i<n;i++)
		{
			
			String s= sc.nextLine();
			String a[]= s.split(",");
			Hall h1= new Hall(a[0],Integer.parseInt(a[1]));
			et.addToHallList(h1);
			h.addToHallList(h1);
			h.addToNoOfEvents(a.length-2);
			for(int j=2;j<a.length;j++)
			{
				Eventtype e= new Eventtype(a[j]);
				h.addToEventtypeList(e);
			}
		}
		System.out.println("Enter the event name to get the halls:");
		String event= sc.nextLine();
        System.out.println("Event Name:"+event);
		System.out.println("Halls:");
		h.checkEvent(event);
		
	}

}
=========================
import java.util.ArrayList;
import java.util.List;

public class Hall {
    
	private String name;
	private int costPerDay;
	private List<Eventtype> eventTypeList= new ArrayList<Eventtype>();
	
	public Hall() {
		super();
	}

	List<Integer> noOfEvents= new ArrayList<Integer>();
	
    public Hall(String name, int costPerDay) {
		super();
		this.name = name;
		this.costPerDay = costPerDay;
	}
     
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}

	public List<Eventtype> getEventtypeList() {
		return eventTypeList;
	}

	public void setEventtypeList(List<Eventtype> eventtypeList) {
		this.eventTypeList = eventtypeList;
	}

	void addToNoOfEvents(int n)
    {
    	noOfEvents.add(n);
    }
    
    void addToEventtypeList(Eventtype eventtype)
    {
    	eventTypeList.add(eventtype);
    }
   
    private List<Hall> hallList=new ArrayList<Hall>();
    void addToHallList(Hall hall)
	{
		hallList.add(hall);
	}
    
   public void checkEvent(String event)
    {
    	int i=0,j=0,k=0;
    	Eventtype ep= new Eventtype();

    	for (Eventtype eventType : eventTypeList) {
    		if(noOfEvents.get(j)==k)
    		{
    			k=0;
    			j++;
    		}
			if(eventType.getName().equals(event))
			{
				
				System.out.println(hallList.get(j).getName());
				i++;
			}
			k=k+1;
		}
    	if(i==0)
    	{
    		System.out.println("No halls are available for the event type");
    	}
    
}
}
=================
import java.util.ArrayList;
import java.util.List;

public class Eventtype {

    private String name;
	private List<Hall> hallList=new ArrayList<Hall>();
	
	public Eventtype() {
		super();
	}

	public Eventtype(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void addToHallList(Hall hall)
	{
		hallList.add(hall);
	}
	public List copyNoOfevents()
	{
		return hallList;
	}
	} 