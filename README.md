## Practica de interface

Aquí se presentara la primera interfaz de practica del tercer semestre de la universidad de guayaquil.

## Imagen de ejemplo del Proyecto
![Captura de Pantalla de la Aplicación](https://github.com/userashley/Proyecto/blob/9ca8398b2c9df6bf86778fae85c8860a8fccba1c/Captura%20de%20pantalla%202024-05-10%20111008.png)

## Panel
Se agregar un panel principal. Dentro de este se agregaran 2 panel los cuales son panel2 y panel3. Estos panel estaran con codificados con su respectiva posición y tamaño.
## Label
Se agregara varias labels al panel2. Con su respectiva posición y tamaño.Finalmente se realizara el llamado con el metodo:
    
    panel2.getChildren().addAll(label1, label2,label3,label4,label5);

## Image 
Se crea una Image:
Este método agrega imágenes a cada label utilizando una URL de imagen. Tiene sus respectivas posiciones y tamaño.
    
    Image image = new Image (getClass().getResourceAsStream("/image/imagen1.jpg"));
## Scrollbar
Se agrega un scrollbar en la parte izquierda y de manera vertical dentro del panel2.getChildren().add(scrollbar);

	        ScrollBar scrollbar = new ScrollBar(); 
	scrollbar.setOrientation(javafx.geometry.Orientation.VERTICAL);
## ListView
Se agrega una listView en el panel principal: 

        ObservableList<String> items = FXCollections.observableArrayList();// Agregar ListView
            items.addAll("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10" );
	    ListView<String> listView = new ListView<>(items); 
Con su respectiva posicion y tamaño: 

            listView.setLayoutX(250);
            listView.setLayoutY(10);
            listView.setPrefWidth(220);
            listView.setPrefHeight(220);
## Textfield
Se creo un text fiel en el diseño del proyecto , en este código crea un TextField. Se establece su posición vertical y horizontal dentro del Panel3.getChildren().add(textField) para que sea visible en la interfaz de usuario.
