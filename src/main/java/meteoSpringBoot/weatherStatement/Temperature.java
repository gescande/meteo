package meteoSpringBoot.weatherStatement;

public class Temperature
{
    private int value;
    private String unity;

    public String getUnity()
    {
        return unity;
    }

    public void setUnity(final String unity)
    {
        this.unity = unity;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(final int value)
    {
        this.value = value;
    }

    public Temperature(){}

    public Temperature(final int value, final String unity)
    {
        this.value = value;
        this.unity = unity;
    }

    @Override
    public String toString()
    {
        return String.format("Temperature[value=%s, unity=%s]",value,unity);
    }

}
