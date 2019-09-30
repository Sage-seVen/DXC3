// except private and constructor
//final -> var , method , class
class Calc{

}
class SciCalc extends Calc{
final int x=1;

SciCalc()
{

//x=10; error concept here
}

}
public class MainInhDemo {
public static void main(String[] args) {
SciCalc sciCalc=new SciCalc();

}

}