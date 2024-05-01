// Ques - 9 Java String Program to Convert Enum to String

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class EnumToString{
	public static void main(String[] args){
		Day day=Day.TUESDAY;
		
		 String str1=day.toString();
		 System.out.println("Using To String Method :"+str1);
		 
		 String str2=day.name();
		 System.out.println("Using by name :"+str2);
	}
}