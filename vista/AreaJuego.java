import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AreaJuego {
	public static final int ANCHO_FONDO = 2000;
	public static final int JUEGO = 1;
	public static final int TRANSICION = 2;
	private FlappyBird flappyBird;
	//DATOS
	private int puntuación;
	private Image[] fondos;
	private int nivel;
	private Pajaro pajaro;
	
	private EventosAreaJuego eventosAreaJuego;
	private int posXfondo;
	private int modo;
	
	
	public AreaJuego() 
	{
		//FUNCIONA EL FONDO setBackground(Color.YELLOW);
		//CARGAR FONDOS Y DIBUJAR UNO
		nivel = 0;
		posXfondo = 0;
		modo = JUEGO;
		fondos = new Image[3];
		
		for(int i = 0; i < fondos.length; i++) 
		{
			fondos[i] = new ImageIcon(getClass().getResource("mount" + (i+1) + ".jpg")).getImage();
		}
		pajaro = new Pajaro(this);
		eventosAreaJuego = new EventosAreaJuego(this);
		
	}//FIN CONSTRUCTOR
	
	
	@Override
	public void paint(Graphics g) 
	{
		// TODO Auto-generated method stub
		super.paint(g);

	}


	public FlappyBird getFlappyBird() {
		return flappyBird;
	}


	public void setFlappyDog(FlappyBird flappyBird) {
		this.flappyBird = flappyBird;
	}


	public int getPuntuación() {
		return puntuación;
	}


	public void setPuntuación(int puntuación) {
		this.puntuación = puntuación;
	}


	public Image[] getFondos() {
		return fondos;
	}


	public void setFondos(Image[] fondos) {
		this.fondos = fondos;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public Pajaro getPajaro() {
		return pajaro;
	}


	public void setPajaro(Pajaro pajaro) {
		this.pajaro = pajaro;
	}


	public EventosAreaJuego getEventosAreaJuego() {
		return eventosAreaJuego;
	}


	public void setEventosAreaJuego(EventosAreaJuego eventosAreaJuego) {
		this.eventosAreaJuego = eventosAreaJuego;
	}


	public int getPosXfondo() {
		return posXfondo;
	}


	public void setPosXfondo(int posXfondo) {
		this.posXfondo = posXfondo;
	}


	public int getModo() {
		return modo;
	}


	public void setModo(int modo) {
		this.modo = modo;
	}


	public void setFocusable(boolean b) {
		// TODO Auto-generated method stub
		
	}


	public void requestFocus() {
		// TODO Auto-generated method stub
		
	}
}

