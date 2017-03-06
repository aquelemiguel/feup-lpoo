package statistics;

public class NormalDistribution extends ProbabilityDistribution {
	
	public NormalDistribution(double mean, double stddev) {
		if (stddev == 0){
			throw new IllegalArgumentException();
		}
		this.mean = mean;
		this.stddev = stddev;
	}

	public NormalDistribution() {
		this.stddev = 1.0;
	}

	public NormalDistribution(String name, double mean, double stddev) {
		ProbabilityDistribution.name = name;
		this.mean = mean;
		this.stddev = stddev;
	}

	public double getMean() {
		return mean;
	}

	public double getStddev() {
		return stddev;
	}
	
	public boolean equals(Object obj){
		NormalDistribution that = (NormalDistribution) obj;
		
		if (this.mean == that.mean && this.stddev == that.stddev){
			return true;
		}
		return false;
	}

	public String toString(){
		return "N(" + this.mean + ", " + this.stddev + ")"; 
	}
	
}
