package elevation;

import javax.swing.*;

public class PlaceGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField placeNameText;
    private JTextField elevationText;
    private JList<Place> placeList;
    private JButton addButton;
    private JButton deleteButton;

    private Controller controller;

    private DefaultListModel<Place> allPlaceListModel;

    PlaceGUI(Controller controller){
        this.controller = controller;

        allPlaceListModel = new DefaultListModel<>();
        placeList.setModel(allPlaceListModel);

        addListeners();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setVisible(true);
    }

    public void addListeners(){

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
