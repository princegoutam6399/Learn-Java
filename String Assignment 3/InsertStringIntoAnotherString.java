// Ques - 2 Java String Program to Insert a string into another string

class InsertStringIntoAnotherString{
	public static void main(String[] args){
		String str = "Rahul is a  boy";
		String insert = "good";
		int position = 11;
		
		if(position < 0 || position > str.length()){
			System.out.println("Invalid position");
		}else{
			String strModified = str.substring(0,position)+insert+str.substring(position);
			System.out.println("Modified String :"+strModified);
		}
	}
}