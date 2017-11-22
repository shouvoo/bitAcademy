package oops;

class Mouse2
{
	String lineType, mouseType;
	
	void init(String lineType, String mouseType)
	{
		this.lineType = lineType;
		this.mouseType = mouseType;
	}
	
	String returnArg()
	{
		return this.lineType + " : " + this.mouseType; 
	}
}

class Keyboard2
{
	String inputType, lineType, paintType;
	
	void init(String inputType, String lineType, String paintType)
	{
		this.inputType = inputType;
		this.lineType = lineType;
		this.paintType = paintType;
		
	}
	
	String returnArg()
	{
		return this.inputType + " : " + this.lineType + " : " + this.paintType; 
	}
}

class OverComputer2
{
	String type;
	Mouse2 mouse;
	Keyboard2 keyboard;
	String printStr;
	
	void assembly(Mouse2 mouse)
	{
		type = "마우스";
		this.mouse = mouse;
		printStr = this.mouse.returnArg();
	}
	
	void assembly(Keyboard2 keyboard)
	{
		type = "키보드";
		this.keyboard = keyboard;
		printStr = this.keyboard.returnArg();
	}
	
	void print()
	{
		System.out.println(type + "\t" + printStr);
	}
}

class YongSan2
{
	Mouse2 buyMouse(String lineType, String mouseType)
	{
		Mouse2 res = new Mouse2();
		res.init(lineType, mouseType);
		return res;
	}
	
	Keyboard2 buyKeyboard(String inputType, String lineType, String paintType)
	{
		Keyboard2 res = new Keyboard2();
		res.init(inputType, lineType, paintType);
		return res;
	}
	
	OverComputer2 buyOrder(Mouse2 mouse)
	{
		OverComputer2 res = new OverComputer2();
		res.assembly(mouse);
		return res;
	}
	
	OverComputer2 buyOrder(Keyboard2 keyboard)
	{
		OverComputer2 res = new OverComputer2();
		res.assembly(keyboard);
		return res;
	}
}

public class OverComputerMain2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		YongSan2 ys = new YongSan2();
		OverComputer2 [] arr = {ys.buyOrder(ys.buyMouse("무선", "선수용")),
											ys.buyOrder(ys.buyKeyboard("기계식", "유선", "페인팅"))};
		
		for (OverComputer2 oc : arr) 
		{
			oc.print();
		}
	}

}
