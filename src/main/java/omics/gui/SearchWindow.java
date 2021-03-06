package omics.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import omics.gui.controller.MainController;

import java.net.URL;
import java.util.Objects;
import java.util.Optional;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 11 Oct 2018, 12:43 PM
 */
public class SearchWindow extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    public static final String NAME = "OMICS Platform";
    public static final String VERSION = "Release (v2020.09.15)";
    public static final String BUILT_TIME = "September 14, 2020";

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        URL url = SearchWindow.class.getClassLoader().getResource("fxml/main.fxml");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(url);
        Parent root = loader.load();
        MainController controller = loader.getController();
        controller.setMainWindow(primaryStage);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("css/omics_main.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("OMICS");
        primaryStage.initStyle(StageStyle.DECORATED);
//        primaryStage.initStyle(StageStyle.UNIFIED);
        primaryStage.setOnCloseRequest(event -> {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Confirm Exit");
            alert.setContentText("Area you sure you want to exit?");
            Optional<ButtonType> bt = alert.showAndWait();
            if (bt.isPresent() && bt.get() == ButtonType.OK)
                Platform.exit();
        });
        primaryStage.getIcons().add(new Image(Objects.requireNonNull(SearchWindow.class.getClassLoader()
                .getResourceAsStream("icon/main_icon.png"))));
        primaryStage.show();
    }
}
