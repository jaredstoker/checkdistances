import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;


public class CheckDistancesGUI implements ActionListener{
		private JRadioButton sea, sfr, la, lv, pho, okc, dal, min, mil, chi, nor, nyc, wdc, mia;
		private JTextArea output;
		private JPanel jPanel1;

        private JInternalFrame jInternalFrame;
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		public CheckDistancesGUI()
		{
			guiComponents();
		}
		private void guiComponents() {
			// TODO Auto-generated method stub
			  
	        jPanel1 = new JPanel();
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(new java.awt.Color(139, 0, 0));
	        output = new JTextArea();
	        
	        sea.setText("Seattle");
	        sfr.setText("San Francisco");
	        la.setText("Los Angeles");
	        lv.setText("Las Vegas");
	        pho.setText("Phoenix");
	        okc.setText("Oklahoma City");
	        dal.setText("Dallas");
	        min.setText("Minneapolis");
	        mil.setText("Milwaukee");
	        chi.setText("Chicago");
	        nor.setText("New Orleans");
	        nyc.setText("New York City");
	        wdc.setText("Washington DC");
	        mia.setText("Miami");
	        
		}
}
