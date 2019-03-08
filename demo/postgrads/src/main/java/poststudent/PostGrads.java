package poststudent;

public class PostGrads {
    private String surname;
    private String name;
    private String studNum;
    private String qualification;

    public PostGrads(String snr,String nm, String num, String qual)
    {
        surname = snr;
        name = nm;
        studNum = num;
        qualification = qual;
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

    public String getQualification()
    {
        return qualification;
    }
}
