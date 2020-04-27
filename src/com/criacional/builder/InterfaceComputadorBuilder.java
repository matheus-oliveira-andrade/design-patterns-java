package com.criacional.builder;

public interface InterfaceComputadorBuilder {
	ComputadorBuilder addSsd(String ssd);
	ComputadorBuilder addPlacaVideo(String placaVideo);
	ComputadorBuilder addGabinete(String gabinete);
}
