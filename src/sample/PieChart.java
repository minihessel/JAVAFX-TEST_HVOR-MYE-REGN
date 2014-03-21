package sample;
import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.chart.BarChart;
        import javafx.scene.chart.CategoryAxis;
        import javafx.scene.chart.NumberAxis;
        import javafx.scene.chart.XYChart;
        import javafx.stage.Stage;

public class PieChart extends Application {
    final static String Bergen = "Bergen";
    final static String Sandefjord = "Sandefjord";



    @Override public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Antall millimeter regn");
        xAxis.setLabel("BY");
        yAxis.setLabel("MILLIMETER");

        XYChart.Series series1 = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();
        series1.setName("08.2013-02.2014");

        series1.getData().add(new XYChart.Data(Bergen, 1847));
        series1.getData().add(new XYChart.Data(Sandefjord, 964.8));




        Scene scene  = new Scene(bc,500,500);
        bc.getData().addAll(series1);
        bc.getData().get(0).getData().get(0).getNode().setStyle("-fx-background-color: FF6666;");
        bc.getData().get(0).getData().get(1).getNode().setStyle("-fx-background-color: 33CC99;");

        stage.setScene(scene);
        stage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}