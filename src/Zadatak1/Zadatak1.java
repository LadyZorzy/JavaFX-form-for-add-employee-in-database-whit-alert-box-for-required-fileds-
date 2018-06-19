package Zadatak1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Zadatak1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        TextField ime = new TextField();
        ime.setPromptText("Ime");
        TextField prezime = new TextField();
        prezime.setPromptText("Prezime");
        TextField email = new TextField();
        email.setPromptText("e-mail");
        PasswordField sifra = new PasswordField();
        sifra.setPromptText("šifra");
        ComboBox godina = new ComboBox();
        ComboBox mesec = new ComboBox();
        ComboBox dan = new ComboBox();
        CheckBox zaposlen = new CheckBox();
        Button btn = new Button("Potvrdi");

        godina.getItems().addAll("1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
                "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1990", "2000");

        godina.setPromptText("Izaberite godinu");

        mesec.getItems().addAll("Januar", "Februar", "Mart",
                "Aprila", "Maj", "Jun", "Jul",
                "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar");

        mesec.setPromptText("Izaberite mesec");

        dan.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");

        dan.setPromptText("Izaberite dan");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(6, 6, 6, 6));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Ime:"), 0, 0);
        gridPane.add(ime, 1, 0);
        gridPane.add(new Label("Prezime:"), 0, 1);
        gridPane.add(prezime, 1, 1);
        gridPane.add(new Label("e-mail:"), 0, 2);
        gridPane.add(email, 1, 2);
        gridPane.add(new Label("Šifra:"), 0, 3);
        gridPane.add(sifra, 1, 3);
        gridPane.add(new Label("Zaposlen:"), 0, 4);
        gridPane.add(zaposlen, 1, 4);
        gridPane.add(godina, 0, 5);
        gridPane.add(mesec, 0, 6);
        gridPane.add(dan, 0, 7);
        gridPane.add(new Label(""), 0, 8);
        gridPane.add(btn, 0, 9);

        btn.setOnAction(e -> {

            if (godina.getValue() == null) {

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("");
                alert.setContentText("Unesite godine!!");
                alert.showAndWait();
            }

            if (mesec.getValue() == null) {

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("");
                alert.setContentText("Unesite mesec!!");
                alert.showAndWait();
            }

            if (dan.getValue() == null) {

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("");
                alert.setContentText("Unesite dan!!");
                alert.showAndWait();
            }

            if (!zaposlen.isSelected()) {

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("");
                alert.setContentText("Obelezite polje zaposlen!!");
                alert.showAndWait();
            }

            if (ime.getText().trim().isEmpty()) {

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("");
                alert.setContentText("Unesite ime!!");
                alert.showAndWait();

            }

            if (prezime.getText().trim().isEmpty()) {

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("");
                alert.setContentText("Unesite prezime!!");
                alert.showAndWait();

            }

            if (email.getText().trim().isEmpty()) {

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("");
                alert.setContentText("Unesite email!!");
                alert.showAndWait();

            }

            if (sifra.getText().trim().isEmpty()) {

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("");
                alert.setContentText("Unesite siffu!!");
                alert.showAndWait();

            }

        });

        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Unos zaposlenog");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
