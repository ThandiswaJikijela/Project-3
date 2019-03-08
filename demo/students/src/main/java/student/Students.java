package student;

public class Students {
    private String surname;
    private String name;
    private String studNum;

    public Students(String snr, String nm, String num)
    {
        surname = snr;
        name = nm;
        studNum = num;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getStudNum()
    {
        return  studNum;
    }

}
