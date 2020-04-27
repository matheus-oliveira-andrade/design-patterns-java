package com.criacional.builder;

public class Computador {

	private String placaMae;
	private String processador;
	private String memoriaRam;
	private String fonte;
	private String hd;
	private String ssd;
	private String placaVideo;
	private String gabinete;
	
	public Computador(ComputadorBuilder builder) {
		this.placaMae = builder.getPlacaMae();
		this.processador = builder.getProcessador();
		this.memoriaRam = builder.getMemoriaRam();
		this.fonte = builder.getFonte();
		this.hd = builder.getHd();
		this.ssd = builder.getSsd();
		this.placaMae = builder.getPlacaMae();
		this.gabinete = builder.getGabinete();
		this.placaVideo = builder.getPlacaVideo();		
	}

	@Override
	public String toString() {
		return "Computador \n  placaMae = " + placaMae + ", \n  processador = " + processador + ", \n  memoriaRam = " + memoriaRam
				+ ", \n  fonte = " + fonte + ", \n  hd = " + hd + ", \n  ssd = " + ssd + ", \n  placaVideo = " + placaVideo + ", \n  gabinete = "
				+ gabinete;
	}
	
	
}
