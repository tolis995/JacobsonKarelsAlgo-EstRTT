package ask1th5;

public class Main1 {
	
	
	public static void main(String[] args) {

		double estrtt=90;
		double samplertt=200;
		double deviation=25;
		double d=0.125;
		int mi=1;
		int phi=4;
		double k;
		double difference;
		double timeout;
		int c=0;
		timeout=mi*estrtt+phi*deviation;
		System.out.println(timeout);

		difference=samplertt-estrtt;
		System.out.println(c+"-"+estrtt+"-"+timeout+"-"+difference);

		while (timeout>218)  {
			c++;
			k=(Math.abs(difference)-deviation);
			deviation=deviation+d*k;
			estrtt=estrtt+(d*difference);
			timeout=mi*estrtt+phi*deviation;

			System.out.println(c+"-"+samplertt+"-"+estrtt+"-"+timeout);

			difference=samplertt-estrtt;
			
		}
	}

}
