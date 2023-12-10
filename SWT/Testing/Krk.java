package de.edlich.mockme;

public class KrK { // Krankenkasse
  public CalcSteuer cs;

  public KrK(CalcSteuer thisCs) { // Konstruktor für Dependency Injection
    cs = thisCs;
  }
  
  public int calcBeitag(int brutto) {
    int netto = cs.calcNetto(brutto); // Aaaaaah! Problem!!!
    System.out.println("BÖSE XXXXXXXXX - 1Mio $");
    return netto / 5.0; // Darum geht es!
  }
}