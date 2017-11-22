package pac.abroad;

public class Camera 
{
	String name;
	int pixel;
	
	public Camera(String name, int pixel) 
	{
		super();
		this.name = name;
		this.pixel = pixel;
	}

	public String picture(String target)
	{
		return name + " À¸·Î " + target + "Âï¾î¿ä";
	}
	
	public String str()
	{
		return name + "["+ pixel +"]";
	}
}
