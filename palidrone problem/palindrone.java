class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[]ch = str.toCharArray();
		int num = ch.length;
		int x=0;
		for(int i=0, j=num-1;i<num/2; i++){
			if(ch[i] == ch[j]){
				x += 1;
			}
			else
			break;
			j--;
		}
		//System.out.print(x);
		//int k=num/2;
		if(x == num/2)
		System.out.print("1");
		else
		System.out.print("0");

                      // Your code here
	}
}
