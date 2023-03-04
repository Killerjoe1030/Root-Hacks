public class GameFrame extends Application {
  private Pane root;
  
  public static void main() {
    Application.launch(args);
  }
  @Override
	public void start(Stage frame) throws Exception {
    // Pane to contain content
    root = new Pane();
    // Frame of the application
    Scene scene = new Scene(root, 500, 500);
    // Sets properties
    frame.setTitle("Game Title");
		frame.setScene(scene);
		frame.show();
  }
}
