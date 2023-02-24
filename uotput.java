class Output{

	static void main(String[] args){
		Sanner input = new Scanner(System.in)

		System.out.println("Enter your name");
		String name = input.nextine();
		System.out.println("Enter your university");
		String university = input.nextine();
		System.out.println("Enter your field of study");
		String studies = input.nextine();
		
		System.out.println("Hello " + name + ", you study " + studies + " on " + university);
	}
}