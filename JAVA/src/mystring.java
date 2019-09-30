
public class mystring {

	
	String hasUpper(String data)
	{
		char[] temp=data.toCharArray();
		//int asc=0;
		for(int i=0;i<temp.length;i++){  
			//System.out.println(temp[i]);
			int asc=temp[i];
			if(asc>=65 && asc<=90 )
				return "Yes";
		}
		return "No";
	}

	
	String hasNumber(String data)
	{
		char[] temp=data.toCharArray();
		for(int i=0;i<temp.length;i++){  
			//System.out.println(temp[i]);
			int asc=temp[i];
			if(asc>=48 && asc<=57 )
				return "Yes";
		}
		return "No";
	}
	
	boolean isCapsOnly(String data) {
		char[] temp=data.toCharArray();
		int ctr=0;
		for(int i=0;i<temp.length;i++){  
			//System.out.println(temp[i]);
			int asc=temp[i];
			if(asc>=65 && asc<=90 )
				ctr++;
		}
		if(ctr==temp.length)
			return true;
		
	return false;
	}
	
	int countCaps(String data) {
		char[] temp=data.toCharArray();
		int ctr=0;
		for(int i=0;i<temp.length;i++){  
			//System.out.println(temp[i]);
			int asc=temp[i];
			if(asc>=65 && asc<=90 )
				ctr++;
		}
		return ctr;
	}
	
	String myReplace(String data, char oldChar , char newChar) {
		char[] temp=data.toCharArray();
		String phrase="";
		for(int i=0;i<temp.length;i++){
			if(temp[i]== oldChar)
				temp[i]=newChar;
				phrase+=temp[i];
		}
		return phrase;
	}
	
	String myReplace1(String data, char oldChar , char newChar) {
		char[] temp=data.toCharArray();
		for(int i=0;i<temp.length;i++){
			if(temp[i]== oldChar) {
				temp[i]=newChar;
				break;}
		}
		String phrase="";
		for(int i=0;i<temp.length;i++){
			phrase+=temp[i];
		}
		return phrase;
	}
	
	String myReplace2(String data, char oldChar , char newChar) {
		char[] temp=data.toCharArray();
		for(int i=(temp.length-1);i>0;i--){
			if(temp[i]== oldChar ) {
				temp[i]=newChar;
				break;
				}
		}
		String phrase="";
		for(int i=0;i<temp.length;i++){
			phrase+=temp[i];
		}
		return phrase;
	}
	
	
	boolean isEqual(char c1 , char c2) {
		int asc=c1;
		if(asc>=65 && asc<=90)
			asc+=32;
		else
			asc-=32;
		
		if(asc==(int)c2)
			return true;
		
		//char c=(char)asc;System.out.println(c);
		return false;
	}
	

	String mashed(String data)
	{
		char[] temp=data.toCharArray();
		//int asc=0;
		String mash="";
		for(int i=(temp.length-1);i>=0;i--){  
			//System.out.println(temp[i]);
			int asc=temp[i];
				if(asc>=65 && asc<=90 ){
					asc+=32;
					mash+=(char)asc;
				}
			else {
				asc-=32;
				mash+=(char)asc;
			}
		}
		return mash;
	}
	
	String idmashed(String data)
	{
		char[] temp=data.toCharArray();
		//int asc=0;
		String mash="";
		boolean[] id=new boolean[temp.length];
		for(int i=0;i<temp.length;i++){  
			//System.out.println(temp[i]);
			int asc=temp[i];
				if(asc>=65 && asc<=90 ){
					id[i]=true;
				}
			else {
				id[i]=false;
			}
		}
		/*
		 * for(int i=(temp.length-1);i>=0;i--) { int asc=temp[i]; if(id[i]==true)
		 * mash+=(char)(asc+32); else mash+=(char)(asc-32); }
		 */
		
		for(int i=0;i<id.length;i++)
		{
			System.out.print(id[i]);
		}
		
		System.out.println("\n");
		
		for(int i=(temp.length-1);i>=0;i--)
		{
			int asc=temp[i];
			
			for(int j=0;j<id.length;j++) {
				
				if(id[j]==true)
					mash+=(char)(asc+32);
				else
					mash+=(char)(asc-32);
			}
		}
		return mash;
	}
	
	
			
	public static void main(String[] args) {
		
		String sample="This is a sample stringS";
		String sample2="ALLCAPS";
		String sample3="abCdeABCDE";
		mystring m=new mystring();
		System.out.println(m.hasUpper(sample));
		System.out.println(m.hasNumber(sample));
		System.out.println(m.isCapsOnly(sample2));
		System.out.println(m.countCaps(sample));
		System.out.println(m.myReplace(sample, 's', 'x') + "  all replace");
		System.out.println(m.myReplace1(sample, 's', 'x') + "  first replace");
		System.out.println(m.myReplace2(sample, 's', 'x') + "  last replace");
		System.out.println(m.isEqual('a', 'A'));
		System.out.println(m.mashed(sample));
		System.out.println(m.idmashed(sample3));
	}

}
