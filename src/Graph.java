///// Many of the code is referred from this https://www.tutorialspoint.com/jfreechart/jfreechart_xy_chart.htm
//
//import java.awt.Color;
//import java.awt.BasicStroke;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.ui.ApplicationFrame;
//import org.jfree.data.xy.XYDataset;
//import org.jfree.data.xy.XYSeries;
//import org.jfree.chart.plot.XYPlot;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.xy.XYSeriesCollection;
//import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
//
//public class Graph extends ApplicationFrame {
//
//    public Graph( String applicationTitle, String chartTitle ) {
//        super(applicationTitle);
//        JFreeChart xylineChart = ChartFactory.createXYLineChart(
//                chartTitle ,
//                "Category" ,
//                "Score" ,
//                createDataset() ,
//                PlotOrientation.VERTICAL ,
//                true , true , false);
//
//        ChartPanel chartPanel = new ChartPanel( xylineChart );
//        chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
//        final XYPlot plot = xylineChart.getXYPlot( );
//
//        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
//        renderer.setSeriesPaint( 0 , Color.RED );
//        renderer.setSeriesPaint( 1 , Color.GREEN );
//        renderer.setSeriesPaint( 2 , Color.YELLOW );
//        renderer.setSeriesStroke( 0 , new BasicStroke( 4.0f ) );
//        renderer.setSeriesStroke( 1 , new BasicStroke( 3.0f ) );
//        renderer.setSeriesStroke( 2 , new BasicStroke( 2.0f ) );
//        plot.setRenderer( renderer );
//        setContentPane( chartPanel );
//    }
//
//    private XYDataset createDataset( ) {
//        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
//        //double [ ]select =
//
//        final XYSeries BubbleSort = new XYSeries( "BubbleSort" );
//
//        final XYSeries chrome = new XYSeries( "Chrome" );
//
//        final XYSeries iexplorer = new XYSeries( "InternetExplorer" );
//        iexplorer.add( 3.0 , 4.0 );
//
//        final XYSeriesCollection dataset = new XYSeriesCollection( );
//        dataset.addSeries( firefox );
//        dataset.addSeries( chrome );
//        dataset.addSeries( iexplorer );
//        return dataset;
//    }
//
//    public static void main( String[ ] args ) {
//        Graph chart = new Graph("Sorting",
//                "All sortings");
//        chart.pack( );
//        chart.setVisible( true );
//    }
//}


//