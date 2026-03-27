import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

public class EventosAreaJuego {

	private AreaJuego areaJuego;
	private int []estadoTeclas;
	private Timer reloj;
	private Timer relojTransicion;
	
	public EventosAreaJuego(AreaJuego areaJuego)
	{
		this.areaJuego = areaJuego;
		estadoTeclas = new int[4];
		for (int i = 0; i < estadoTeclas.length; i++) 
		{
			estadoTeclas[i] = 0;
		}
	
		/*areaJuego.addKeyListener(new KeyAdapter() {
			
		@Override
		public void keyTyped(KeyEvent e) 
		{
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) 
		{
			if(e.getKeyCode()==KeyEvent.VK_LEFT) 
			{
				estadoTeclas[0]=0;
			}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
			{
				estadoTeclas[1]=0;
			}
			if(estadoTeclas[0]==0 && estadoTeclas[1]==0 && areaJuego.getCaballo().getEstado()!=Caballo.SALTANDO) 
			{
				areaJuego.getCaballo().setEstado(Caballo.QUIETO);
			}
			//REVISAR: EL CABALLO AL TERMINAR DE SALTAR NO SE QUEDA QUITO AUNQUE NO HAYA TECLAS PULSADAS
			
			areaJuego.repaint();
		}
		
		@Override
		public void keyPressed(KeyEvent e) 
		{
			if(areaJuego.getCaballo().getEstado()!=Caballo.SALTANDO) 
			{
				if(e.getKeyCode()==KeyEvent.VK_LEFT) 
				{ // || e.getKeyCode()==KeyEvent.VK_A) {
					if(areaJuego.getCaballo().getDirH()!=-1) 
					{
						areaJuego.getCaballo().setDirH(-1);
					}else 
					{
						//modificar posicion
						areaJuego.getCaballo().setEstadoAnterior(areaJuego.getCaballo().getEstado());
						areaJuego.getCaballo().setEstado(Caballo.CORRIENDO);
						//areaJuego.getCaballo().setDirH(-1);
						//areaJuego.getCaballo().mover();
						estadoTeclas[0]=1;
						estadoTeclas[1]=0;
					}
					areaJuego.getCaballo().setEstado(Caballo.CORRIENDO);
					estadoTeclas[0]=1;
					estadoTeclas[1]=0;
					}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
					{ // || e.getKeyCode()==KeyEvent.VK_D) {
						if(areaJuego.getCaballo().getDirH()!=1) 
						{
							areaJuego.getCaballo().setDirH(1);
						}else 
						{
							areaJuego.getCaballo().setEstadoAnterior(areaJuego.getCaballo().getEstado());
							areaJuego.getCaballo().setEstado(Caballo.CORRIENDO);
							//areaJuego.getCaballo().setDirH(1);
							//areaJuego.getCaballo().mover();
							estadoTeclas[0]=0;
							estadoTeclas[1]=1;
						}
						areaJuego.getCaballo().setEstado(Caballo.CORRIENDO);
						estadoTeclas[0]=0;
						estadoTeclas[1]=1;
					} else if(e.getKeyCode()==KeyEvent.VK_UP) 
					{
						estadoTeclas[2]=1;
						if(areaJuego.getCaballo().getEstado()!=Caballo.SALTANDO) 
						{
							areaJuego.getCaballo().setEstadoAnterior(areaJuego.getCaballo().getEstado());
						}
						areaJuego.getCaballo().setEstado(Caballo.SALTANDO);
					}
				}
				areaJuego.repaint();
			}
		});*/
	}
}
