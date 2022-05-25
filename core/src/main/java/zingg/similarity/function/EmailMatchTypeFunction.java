package zingg.similarity.function;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.spark.ml.util.Identifiable$;


public class EmailMatchTypeFunction extends StringSimilarityDistanceFunction {

	public static final Log LOG = LogFactory
			.getLog(EmailMatchTypeFunction.class);
	private static final String String = null;
	
	
	public EmailMatchTypeFunction() {
		this("EmailMatchTypeFunction");		
	}
	
	public EmailMatchTypeFunction(String s) {
		super(s);
		//gap = new SAffineGap();
	}
	
	//@Override
	public EmailMatchTypeFunction(String first, String second) {
		super(String,String);
		first = first.split("@",0)[0];
		second = second.split("@",0)[0];
		super.call(first,second);
		/*
		double score1 = 0.0;
		double score2 = 0.0;
		double score = 0.0;

		try {
			if (first == null || first.equals("")) {
				score1 = 1.0d;
			}
			if (second == null || second.equals("")) {
				score2 = 1.0d;
			}
			if (score1 != 1.0d && score2 != 1.0d) {
				first = first.split("@",0)[0];
				second = second.split("@",0)[0];
				score = first.equalsIgnoreCase(second)? 1.0d : 0.0d;
			}
			else {
				score = 1.0d;
			}
			
			
		}  catch (Exception e) {
			e.printStackTrace();
			LOG.warn("Error processing differences for " + first + "," + second);
		} finally {
			if (Double.isNaN(score)) {
				score = 0.0;
			}
			return score;
			*/
		}		
}