import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class TestCallRun2 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 @SuppressWarnings("unlikely-arg-type")
public static void main(String args[]){  
  TestCallRun2 t1=new TestCallRun2();  
  TestCallRun2 t2=new TestCallRun2();  
   
 // t1.run();  
  //t2.run(); 
  DomainName a =new DomainName("remya");
  System.out.println("test constructor "+a.getName()+"  "+a.getNumber());
  
  HashMap<String, Integer> domainNames = new HashMap<>();
  domainNames.put("google.com", 10);
  domainNames.put("chat.google.com", 20);
  domainNames.put("xyz.com", 30);
  domainNames.put("chat.xyz.com", 30);
  domainNames.put("ayz.com", 30);
  domainNames.put("htg.in", 40);
  ArrayList<DomainName> domainNameList = new ArrayList<DomainName>();
  
  TreeMap<String, Integer> resultName = new TreeMap<>();
  
  for(Map.Entry<String, Integer> entry : domainNames.entrySet()) {
	  
	  
	  domainNameList.add(new DomainName(entry.getKey(),entry.getValue()));
	  
			  
  }
  //System.out.println("domainList "+domainNameList);
  for(int i=0;i<domainNameList.size();i++) {
	  for(int j =i+1;j<domainNameList.size();j++) {
		  if (domainNameList.get(i).equals(domainNameList.get(j))) {
			  //System.out.println(domainNameList.get(i).getName());
			  //System.out.println(domainNameList.get(j).getName());
			  resultName.put(domainNameList.get(i).getName().split("\\.")[domainNameList.get(i).getName().split("\\.").length-2]+"."+domainNameList.get(i).getName().split("\\.")[domainNameList.get(i).getName().split("\\.").length-1], domainNames.get(domainNameList.get(i).getName())+
					  domainNames.get(domainNameList.get(j).getName()) );
			  
		  }
	  }
	  //System.out.println(domainNameList.get(i).getName());
  }
for(Map.Entry<String, Integer> entry : resultName.entrySet()) {
	  
	  
	  System.out.println("final "+entry.getKey()+"  "+entry.getValue());
	  
	  
			  
  }
System.out.println(resultName);

int arrayNumber[] = {10,20,2};
Arrays.sort(arrayNumber);
for(int f : arrayNumber) {
	System.out.println(f)	;
}
;
System.out.println("second hhoghest  "+arrayNumber[arrayNumber.length-2]);

 }  
}  

class DomainName{
	private String name;
	private int number;
	
	public DomainName(String a) {
		this.name=a;
		
	}
	
	public DomainName(String a, int b) {
		this.name=a;
		this.number=b;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setName(int number) {
		this.number=number;
	}
	
	
	public boolean equals(Object obj) {
		DomainName otherName =(DomainName)obj;
		int dod = otherName.getName().length();
		String arr[]= otherName.getName().split("\\.");
		String arr2[]= this.name.split("\\.");
		//for(String st:arr) {
			//System.out.println("test "+arr[arr.length-1]);
			//System.out.println("test 2"+arr2[arr2.length-1]);
			if(arr[arr.length-1].equals(arr2[arr2.length-1])&&arr[arr.length-2].equals(arr2[arr2.length-2]))
			{
				return true;
			}
		//}
//		if( this.name.length()==dod){
//			return true;
//		}
		else {
			return false;
		
	}}
	
	public int hashCode () {
		
	return this.getName().hashCode();
	}
}
