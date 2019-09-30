interface PhoneNumber{
	void numberFormat(String data);
}


abstract class country implements PhoneNumber {
	
			boolean isNumber(String data, int count) {
				char[] temp=data.toCharArray();
				int ctr=0;
				for(int i=0;i<temp.length;i++){  
									//System.out.println(temp[i]);to print ascii
					int asc=temp[i];
					if(!(asc>=48 && asc<=57 )) {
						System.out.println("Not a Number");
						return false;
						}
					ctr++;
				}
				if(ctr==count) {
					System.out.println(ctr);
					return true;
				}
				else
					return false;
			}


}


class india extends country{

	@Override
	public void numberFormat(String data) {
		String code= data.substring(0,4);
		if(code.equals("+91-"))
			if(isNumber(data.substring(4), (data.substring(4)).length())== true )
				System.out.println("India wale");
		else
			System.out.println("Country code wrong");
	}
	
}


class brazil extends country{

	@Override
	public void numberFormat(String data) {
		String code= data.substring(0,4);
		if(code.equals("+91-"))
			if(isNumber(data.substring(4), (data.substring(4)).length())== true )
				System.out.println("razil wale");
		else
			System.out.println("Country code wrong");
	}
	
}

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		india i=new india();
		i.numberFormat("+91-9999999999");
		brazil b= new brazil();
		b.numberFormat("+55 15 99999-9999");
	}

}
