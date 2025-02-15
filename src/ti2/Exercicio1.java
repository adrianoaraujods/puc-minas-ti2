package ti2;

public class Exercicio1 {
	public static double sum(double n1, double n2) {
		return n1 + n2;
	}

	public static void main(String[] args) {
		MyIO.println("Enter a number: ");
		double n1 = MyIO.readDouble();

		MyIO.println("Enter another number: ");
		double n2 = MyIO.readDouble();

		MyIO.println(n1 + " + " + n2 + " = " + sum(n1, n2));
	}
}
