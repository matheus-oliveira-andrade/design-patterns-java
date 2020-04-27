package com.criacional.builder;

public class ComputadorBuilder implements InterfaceComputadorBuilder{

	private String placaMae;
	private String processador;
	private String memoriaRam;
	private String fonte;
	private String hd;
	private String ssd;
	private String placaVideo;
	private String gabinete;

	public ComputadorBuilder(String placaMae, String processador, String memoriaRam, String fonte, String hd) {
		this.placaMae = placaMae;
		this.processador = processador;
		this.memoriaRam = memoriaRam;
		this.fonte = fonte;
		this.hd = hd;
	}

	public ComputadorBuilder addSsd(String ssd) {
		this.ssd = ssd;
		return this;
	}

	public ComputadorBuilder addPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
		return this;
	}

	public ComputadorBuilder addGabinete(String gabinete) {
		this.gabinete = gabinete;
		return this;
	}

	public String getPlacaMae() {
		return placaMae;
	}

	public String getProcessador() {
		return processador;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public String getFonte() {
		return fonte;
	}

	public String getHd() {
		return hd;
	}

	public String getSsd() {
		return ssd;
	}

	public String getPlacaVideo() {
		return placaVideo;
	}

	public String getGabinete() {
		return gabinete;
	}	
}
