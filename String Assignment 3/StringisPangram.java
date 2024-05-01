// Ques - 18 Java String Program to Check Whether the Given String is Pangram

class StringisPangram{
	public static void main(String[] args){
		String str="the quick brown fox jumps over the lazy dog";
		
		int count =0;
		
		for(int i=97;i<=122;i++){
			for(int j=0;j<str.length();j++){
				if(((int)str.charAt(j))==i){
					count++;
					break;
				}
			}
		}
		if(count==26){
			System.out.println("String is a pangram");
		}else{
			System.out.println("String is not pangram");
		}
	}
}