package edu.upc.eetac.dsa.jcancer.ejerciciosthreads;


public class CuentaAtrasej9 implements Runnable {
	
	private Contadorej9 c;
	private int cuenta;
	public CuentaAtrasej9 (Contadorej8 c, String nombre, int cuenta) {	
	
	//	c.setName = nombre;	
		
		//this.c=c;
		this.cuenta=cuenta;
				
	}	
		public void run () {
		
			for (int i=cuenta; i >= 0; i= i-1)			
			{
			
				int valor = c.getContadorej9();
				c.setContador(valor-1);
				System.out.println("El thread " + Thread.currentThread().getName() + " baja el contador a " + c.getContadorej9());
						
			}
			
		}		
	
	}
	

