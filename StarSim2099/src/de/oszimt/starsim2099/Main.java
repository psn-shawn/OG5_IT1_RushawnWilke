package de.oszimt.starsim2099;

public class Main {

	public static void main(String[] args) {

		
		// GameControl erstellen
		GameControl meinGame = new GameControl();
		
		// Universum einrichten
		int universumBreite = 320;
		int universumHoehe = 100;
		Universum meinUniversum = new Universum(universumBreite, universumHoehe);
		meinGame.setUniversum(meinUniversum);
		
		// Raumschiff hinzufügen
		Raumschiff meinStarCarrier = new Raumschiff(universumHoehe, universumHoehe, universumHoehe, null, null, universumHoehe);
		meinStarCarrier.setTyp("Star-Carrier DF100");
		meinStarCarrier.setAntrieb("Sol 8");
		meinStarCarrier.setMaxKapazitaet(250);
		meinStarCarrier.setPosX(universumBreite / 2);
		meinStarCarrier.setPosY(universumHoehe  / 2);
		meinStarCarrier.setWinkel(180);
		meinGame.setRaumschiff(meinStarCarrier);
		
		// Pilot hinzufügen
		Pilot meinHansSolo = new Pilot(universumHoehe, universumHoehe, null, null);
		meinHansSolo.setName("Hans Solo");
		meinHansSolo.setGrad("Offzs. 2");
		meinHansSolo.setPosX(Math.random() * universumBreite);
		meinHansSolo.setPosY(Math.random() * universumHoehe);
		meinGame.setPilot(meinHansSolo);
		
		// Planeten hinzufügen
		Planet meineErde = new Planet(universumHoehe, universumHoehe, universumHoehe, null);
		meineErde.setName("Erde");
		meineErde.setAnzahlHafen(2);
		meineErde.setPosX(Math.random() * universumBreite);
		meineErde.setPosY(Math.random() * universumHoehe);
		meinGame.addPlanet(meineErde);

		Planet meinCentaurus = new Planet(universumHoehe, universumHoehe, universumHoehe, null);
		meinCentaurus.setName("Centaurus 7");
		meinCentaurus.setAnzahlHafen(1);
		meinCentaurus.setPosX(Math.random() * universumBreite);
		meinCentaurus.setPosY(Math.random() * universumHoehe);
		meinGame.addPlanet(meinCentaurus);
		
		//Mond hinzufuegen
		Mond meinMond = new Mond();
		meinMond.setErzart("memetium");
		meinMond.setArt("Mond");
		meinMond.setPosX(Math.random() * universumBreite);
		meinMond.setPosY(Math.random() * universumHoehe);
		meinGame.addMond(meinMond);
		
		Mond meinMond2 = new Mond();
		meinMond2.setErzart("serhartium");
		meinMond2.setArt("Mond");
		meinMond2.setPosX(Math.random() * universumBreite);
		meinMond2.setPosY(Math.random() * universumHoehe);
		meinGame.addMond(meinMond2);


		//// Ladungen hinzufügen
		// Pamps (grün)
		Ladung meinePampsGruen = new Ladung(universumHoehe, universumHoehe, universumHoehe, null);
		meinePampsGruen.setTyp("Pamps (grün)");
		meinePampsGruen.setMasse(120);
		meinePampsGruen.setPosX(Math.random() * universumBreite);
		meinePampsGruen.setPosY(Math.random() * universumHoehe);
		meinGame.addLadung(meinePampsGruen);

		// Pamps (gelb)
		Ladung meinePampsGelb = new Ladung(universumHoehe, universumHoehe, universumHoehe, null);
		meinePampsGelb.setTyp("Pamps (gelb)");
		meinePampsGelb.setMasse(130);
		meinePampsGelb.setPosX(Math.random() * universumBreite);
		meinePampsGelb.setPosY(Math.random() * universumHoehe);
		meinGame.addLadung(meinePampsGelb);
		
		// klingonischer Werkzeugstahl
		Ladung meinStahl = new Ladung(universumHoehe, universumHoehe, universumHoehe, null);
		meinStahl.setTyp("klingonischer Werkzeugstahl");
		meinStahl.setMasse(400);
		meinStahl.setPosX(Math.random() * universumBreite);
		meinStahl.setPosY(Math.random() * universumHoehe);
		meinGame.addLadung(meinStahl);
		
		// Borg-Schrott
		Ladung meinSchrott = new Ladung(universumHoehe, universumHoehe, universumHoehe, null);
		meinSchrott.setTyp("Borg-Schrott");
		meinSchrott.setMasse(100);
		meinSchrott.setPosX(Math.random() * universumBreite);
		meinSchrott.setPosY(Math.random() * universumHoehe);
		meinGame.addLadung(meinSchrott);
		
		// Treibstoff
		Ladung meinTreibstoff = new Ladung(universumHoehe, universumHoehe, universumHoehe, null);
		meinTreibstoff.setTyp("Treibstoff Nukleus 1000");
		meinTreibstoff.setMasse(50);
		meinTreibstoff.setPosX(Math.random() * universumBreite);
		meinTreibstoff.setPosY(Math.random() * universumHoehe);
		meinGame.addLadung(meinTreibstoff);
		
		// Starte Spiel
		meinGame.run();

	}

}
