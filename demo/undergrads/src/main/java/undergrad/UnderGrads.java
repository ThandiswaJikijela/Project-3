package undergrad;

public class UnderGrads {
    private String surname;
    private String name;
    private String studNum;
    private String course;

    public UnderGrads(String sur, String nm, String num, String cou)
    {
        surname =
        name = nm;
        studNum = num;
        course = cou;
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

    public String getCourse()
    {
        return course;
    }


}
