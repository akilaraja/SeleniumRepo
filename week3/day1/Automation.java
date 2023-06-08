package week3.day1;

public class Automation extends MultipleLanguage {
	
	public void Language()
	{
		System.out.println("Language : ");
	}
	
	public void TestTool()
	{
		System.out.println("TestTool : ");
	}
	
	public void MultipleLanguage()
	{
		System.out.println("Multiple Language : ");
	}
	
	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java : ");
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium : ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation Am = new Automation();
		Am.Language();
		Am.MultipleLanguage();
		Am.Java();
		Am.python();
		Am.ruby();
		Am.Selenium();
		Am.TestTool();
		
		
	}

}