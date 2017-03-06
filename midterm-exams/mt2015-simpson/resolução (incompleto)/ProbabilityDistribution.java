package statistics;

import java.util.ArrayList;

public class ProbabilityDistribution {

	static String name;
	double mean, stddev;
	static ArrayList<ProbabilityDistribution> distributions = new ArrayList<ProbabilityDistribution>();

	public double getMean() {
		return this.mean;
	}

	public double getStddev() {
		return this.stddev;
	}

	public double probabilityDensityFunction(double d) {  
		return 1/(Math.sqrt(2 * Math.pow(this.stddev, 2) * Math.PI)) * Math.exp(-Math.pow(d-this.mean, 2)/(2 * Math.pow(this.stddev, 2)));
	}

	public double calcRangeProbability(int a, int b) {
		return (Math.abs(b-a) / 2) * 0.477250;
	}

	public double calcLeftProbability(double d) {
		if (d < 1) return 0.5 - 0.477250;
		else if (d > 1) return 0.5 + 0.477250;
		return 0.5;
	}

	public static ProbabilityDistribution find(String string) {
		for (int i = 0; i < ProbabilityDistribution.distributions.size(); i++){
			if (ProbabilityDistribution.distributions.get(i).name == string){
				return ProbabilityDistribution.distributions.get(i);
			}
		}
		return null;
	}



}
