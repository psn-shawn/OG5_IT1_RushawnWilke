package omnom;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class HaustierPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	// Ordner mit den Bildern, relativ zum Projektordner (Omnom)
	private static final String BILDER_ORDNER = "TestBilder/bilder/";
	private Image[] img;
	private boolean hunger;
	private boolean muede;
	private boolean zufrieden;
	private boolean gesund;
	private boolean essen;

	/**
	 * Create the panel.
	 */
	public HaustierPanel() {
		super();
		this.hunger = true;
		this.muede = true;
		this.zufrieden = true;
		this.gesund = true;
		this.essen = false;

		img = new Image[10];
		img[0] = ladeBild("normal.png");
		img[1] = ladeBild("normal2.png");
		img[2] = ladeBild("normal3.png");
		img[3] = ladeBild("krank.png");
		img[4] = ladeBild("hungrig.png");
		img[5] = ladeBild("traurig.png");
		img[6] = ladeBild("muede.png");
		img[7] = ladeBild("isst.png");
	}

	/**
	 * Laedt ein Bild zuerst aus dem Ordner TestBilder/bilder. Wird es dort nicht
	 * gefunden, wird zusaetzlich der Classpath (/bilder/...) probiert.
	 */
	private Image ladeBild(String dateiname) {
		try {
			File datei = new File(BILDER_ORDNER + dateiname);
			if (datei.exists()) {
				return ImageIO.read(datei);
			}
			InputStream in = HaustierPanel.class.getResourceAsStream("/bilder/" + dateiname);
			if (in != null) {
				return ImageIO.read(in);
			}
			System.err.println("Bild nicht gefunden: " + datei.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}

	public void setMuede(boolean muede) {
		this.muede = muede;
	}

	public void setZufrieden(boolean zufrieden) {
		this.zufrieden = zufrieden;
	}

	public void setGesund(boolean gesund) {
		this.gesund = gesund;
	}

	public void setEssen(boolean essen){
		this.essen = essen;
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(essen)
			g.drawImage(img[7], 1, 1, 89, 89, null);
		else if(hunger && muede && zufrieden && gesund){
			int bild = (int)(System.currentTimeMillis() / 5000 % 3);
		    g.drawImage(img[bild], 1, 1, 89, 89, null);
		}else if(!gesund){
			g.drawImage(img[3], 1, 1, 89, 89, null);
		}else if(!hunger){
			g.drawImage(img[4], 1, 1, 89, 89, null);
		}else if(!zufrieden){
			g.drawImage(img[5], 1, 1, 89, 89, null);
		}else if(!muede){
			g.drawImage(img[6], 1, 1, 89, 89, null);
		}else{
			g.drawImage(img[0], 1, 1, 89, 89, null);
		}

	}

}
