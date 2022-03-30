public class calculate {
	public static void main(String[] agr) {
		System.out.println("calculate");
		double first = Double.valueOf(agr[0]);
		double second = Double.valueOf(agr[1]);
		double sum = first + second;
		double raz = first - second;
		double umn = first * second;
		double del1 = first / second;
		double del2 = second / first;
		double step1 = first * first;
		double step2 = second * second;
		System.out.println("sum 1 and 2 " + sum);
		System.out.println("raz 1 and 2 " + raz);
		System.out.println("umn 1 and 2 " + umn);
		System.out.println("del 1 on 2 " + del1);
		System.out.println("del 2 on 1 " + del2);
		System.out.println("sqet 1 " + step1);
		System.out.println("sqrt 2 " + step2);
	}


}