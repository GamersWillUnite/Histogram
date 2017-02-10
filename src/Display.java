import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.awt.image.*;
import java.awt.geom.Rectangle2D;
import java.applet.*;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class Display extends JApplet {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public Display() {

		Die a = new Die(6);
		Die b = new Die(6);
		Die c = new Die(6);
		Die d = new Die(6);

		for (int i = 1; i <= 1000; i++) {
			a.Roll();
			b.Roll();
			c.Roll();
			d.Roll();
			int sum = a.getValue() + b.getValue() + c.getValue() + d.getValue();
			if (map.containsKey(sum)) {
				map.put(sum, map.get(sum) + 1);
			} else {
				map.put(sum, 1);
			}
		}



	}
		 
 public void paint(Graphics graphics){
Graphics2D g = (Graphics2D) graphics;

	Set<Integer> keys = map.keySet();

	Integer [] keylist = keys.toArray(new Integer[keys.size()]);   
	
	Integer [] values = map.values().toArray(new Integer[map.values().size()]);
        	setBackground(Color.WHITE);
               g.setColor(Color.BLUE);
              for(int i = 0; i<map.size(); i++ ){
                g.fillRect(10+30*i,10, 20,values[i] * 2);
              }
        
        }
}
