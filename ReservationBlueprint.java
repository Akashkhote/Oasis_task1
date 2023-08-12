package oasis;

public class ReservationBlueprint 		// Blueprint for reservation system
{
    private String name;
    private String start;
    private String end;
    private String date;
    private String trainName;
    private int pnrNumber;

    public ReservationBlueprint(int pnrNumber, String name, String start, String end, String date, String trainName) 
    {
        this.pnrNumber = pnrNumber;
        this.name = name;
        this.start = start;
        this.end = end;
        this.date = date;
        this.trainName = trainName;
    }

    public int getPNRNumber() 
    {
        return pnrNumber;
    }
    
    public String getName() 
    {
        return name;
    }

    public String getStart() 
    {
        return start;
    }

    public String getEnd() 
    {
        return end;
    }

    public String getDate() 
    {
        return date;
    }

    public String getTrainName() 
    {
        return trainName;
    }
}
