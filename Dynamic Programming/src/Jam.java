
public class Jam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String a = "123456";
	String b = "654123";
	String[] k ={"123456","654123","0293","41523"};
	StringBuffer sb = new StringBuffer();
	
	if(a.contains("123")){
		System.out.println("Hi ");
	}
	
	for(int i=0;i<4;i++){
		 
		if(k[i].contains("123")){
			sb=sb.append((k[i]+","));
			System.out.print(k[i]+",");
		}
	}
	//System.out.println(sb.length()-1);
	String pk = sb.substring(0, sb.length()-1);
	System.out.println("K val "+pk);
	
	
	
	}

}
