package seip2022_practical_assignments;
import java.io.File;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
public class HistogramGenerator {

	public void generateChart(int[] dataValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that
		 * can be visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		/*
		 * The XYSeries that are loaded in the dataset. There might be many
		 * series in one dataset.
		 */
		XYSeries data = new XYSeries("Grades");

		/*
		 * Populating the XYSeries data object from the input Integer array
		 * values.
		 */
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}

		// add the series to the dataset
		dataset.addSeries(data);

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Grades Frequency Histogram", "Grades", "Frequency", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the
		 * previously created chart.
		 */
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);
	}

public void Create_Dataset(int[] numbers) {
	HistogramGenerator gen1 = new HistogramGenerator();
	int[] data = {0,0,0,0,0,0,0,0,0,0,0};
	for(int i=0; i<=numbers.length-1; i++) {
		data[numbers[i]]+=1;
	}
	gen1.generateChart(data);
}

public static void main(String[] args) {
	try {
	args[0]=new File("C:\\Users\\Philippos\\Downloads\\grades.txt").getAbsolutePath();
	File f = new File(args[0]);
	Scanner scanner = new Scanner(f);//C:\\Users\\Philippos\\Downloads\\grades.txt    
	HistogramGenerator gen = new HistogramGenerator();
	int [] numbers = new int [149];
	int i = 0;
	while(scanner.hasNextInt())
	{
	     numbers[i++] = scanner.nextInt();
	}
	gen.Create_Dataset(numbers);
	}catch(Exception e) {
		e.printStackTrace();
	}
}// end of main
}