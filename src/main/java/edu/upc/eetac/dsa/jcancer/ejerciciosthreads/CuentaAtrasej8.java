package edu.upc.eetac.dsa.jcancer.ejerciciosthreads;


public class CuentaAtrasej8 extends Thread {
	
	private Contadorej8 c;
	private int cuenta;
	public CuentaAtrasej8 (Contadorej8 c, String nombre, int cuenta) {	
	
		super(nombre);
		this.c=c;
		this.cuenta=cuenta;
				
	}	
		public void run () {
		
			for (int i=cuenta; i >= 0; i= i-1)			
			{
			
				int valor = c.getContador();
				c.setContador(valor-1);
				System.out.println("El thread " + Thread.currentThread().getName() + " baja el contador a " + c.getContador());
			
			}

		}
	
	}
	


