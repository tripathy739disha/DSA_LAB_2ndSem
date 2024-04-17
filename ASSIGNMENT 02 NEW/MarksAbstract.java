
abstract class Marks {
	int markICP,markDSA,percentage;
	 
	 abstract void getPercentage();

}
class CSE extends Marks{
	int algoDesign;
	CSE(int markICP,int markDSA,int algoDesign)
	{
		this.markICP=markICP;
		this.markDSA=markDSA;
		this.algoDesign=algoDesign;
	}
	void getPercentage()
	{
		System.out.println("Percentage="+(((float)markICP+markDSA+algoDesign)/3));
	}
}
class NonCSE extends Marks{
	int enggMechanics;
	NonCSE(int markICP,int markDSA,int enggMechanics)
	{
		this.markICP=markICP;
		this.markDSA=markDSA;
		this.enggMechanics=enggMechanics;
	}
	void getPercentage()
	{
		System.out.println("Percentage="+(((float)markICP+markDSA+enggMechanics)/3));
	}
	
}
public class MarksAbstract{
	public static void main(String[] args) {
	NonCSE ob=new NonCSE(23,45,67);
	ob.getPercentage();
	}
}
