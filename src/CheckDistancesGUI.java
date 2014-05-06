import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;


public class CheckDistancesGUI implements ActionListener{
		private JRadioButton sea, sfr, la, lv, pho, okc, dal, min, mil, chi, nor, nyc, wdc, mia;
		private JTextArea output;
		private JPanel jPanel;

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
			  
	        jPanel = new JPanel();
	        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        //setBackground(new java.awt.Color(139, 0, 0));
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
	        
	        output = new JTextArea();
	        output.setText("Check the distance");
	        
	        sea = new JRadioButton();
	        sfr = new JRadioButton();
	        la = new JRadioButton();
	        lv = new JRadioButton();
	        pho = new JRadioButton();
	        okc = new JRadioButton();
	        dal = new JRadioButton();
	        min = new JRadioButton();
	        mil = new JRadioButton();
	        chi = new JRadioButton();
	        nor = new JRadioButton();
	        nyc = new JRadioButton();
	        wdc = new JRadioButton();
	        mia = new JRadioButton();
	        
	        sea.addActionListener(new java.awt.event.ActionListener()
	        {
	        	public void actionPerformed(ActionEvent e)
	        	{
	        		
	        	}
	        });
	        GroupLayout jPanelLayout = new GroupLayout(jPanel);
	        jPanelLayout.setVerticalGroup(
	        		jPanelLayout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(jPanelLayout.createSequentialGroup()
	        				.addComponent(sea)
	        				.addComponent(sfr)
	        				.addComponent(la)
	        				.addComponent(lv)
	        				.addComponent(pho)
	        				.addComponent(okc)
	        				.addComponent(dal)
	        				.addComponent(min)
	        				.addComponent(mil)
	        				.addComponent(chi)
	        				.addComponent(nor)
	        				.addComponent(nyc)
	        				.addComponent(wdc)
	        				.addComponent(mia)
	        				)
	        		);
	        
	        jPanel.setLayout(jPanelLayout);
	        
	        
		}
}
