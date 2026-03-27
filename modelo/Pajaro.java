import java.awt.*;

import javax.swing.ImageIcon;

public class Pajaro {
	public static final int CORRIENDO = 0;
	public static final int SALTANDO = 1;

	
	private Image[] arrayImagenes;
	private int velocidad;
	private int dirH, dirV;
	private int posX, posY;
	private int ancho, alto;
	private int estado;
	private int imgActual;
	private int contAnimaciones;
	private int impulso;
	private int estadoAnterior;
	
	private AreaJuego areaJuego;

	
	
	public Pajaro(AreaJuego areaJuego) 
	{
		this.areaJuego = areaJuego;
		velocidad = 10;
		estado = CORRIENDO;
		estadoAnterior = CORRIENDO;
		impulso = 80;
		posX = 0;
		posY = 730;
		dirH = 1;
		dirV = 0;
		ancho = 150;
		alto = 120;
		imgActual = 7;
		contAnimaciones = 0;
		cargarImagenes();
		
	}
	
	
	public void cargarImagenes() 
	{
		arrayImagenes = new Image[8];

		for(int i = 0; i < arrayImagenes.length; i++) 
		{
			arrayImagenes[i] = new ImageIcon(getClass().getResource("Pajaro" + (i) +".jpg")).getImage();
		}
	}
	
	public void dibujar(Graphics g) 
	{
		if(dirH == 1) 
		{
			g.drawImage(arrayImagenes[imgActual], posX, posY, ancho, alto, areaJuego);
		}else 
		{
			g.drawImage(arrayImagenes[imgActual], posX, posY, ancho, alto, areaJuego);
		}
	}


	public Image[] getArrayImagenes() {
		return arrayImagenes;
	}


	public void setArrayImagenes(Image[] arrayImagenes) {
		this.arrayImagenes = arrayImagenes;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public int getDirH() {
		return dirH;
	}


	public void setDirH(int dirH) {
		this.dirH = dirH;
	}


	public int getDirV() {
		return dirV;
	}


	public void setDirV(int dirV) {
		this.dirV = dirV;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public int getImgActual() {
		return imgActual;
	}


	public void setImgActual(int imgActual) {
		this.imgActual = imgActual;
	}


	public int getContAnimaciones() {
		return contAnimaciones;
	}


	public void setContAnimaciones(int contAnimaciones) {
		this.contAnimaciones = contAnimaciones;
	}


	public int getImpulso() {
		return impulso;
	}


	public void setImpulso(int impulso) {
		this.impulso = impulso;
	}


	public int getEstadoAnterior() {
		return estadoAnterior;
	}


	public void setEstadoAnterior(int estadoAnterior) {
		this.estadoAnterior = estadoAnterior;
	}


	public AreaJuego getAreaJuego() {
		return areaJuego;
	}


	public void setAreaJuego(AreaJuego areaJuego) {
		this.areaJuego = areaJuego;
	}
}
