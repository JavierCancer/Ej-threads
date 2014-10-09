package edu.upc.eetac.dsa.jcancer.ejerciciosthreads;

public class Contadorej8 {
	
private int cont = 9;
public int getContador() {
		
	return cont;
		}
public void setContador (int c){	
	try	
	{
	Thread.sleep(1000);
		}
		catch
		
		(InterruptedException e)
		{
			e.printStackTrace();
		}
		cont=c;	
		}
	}
