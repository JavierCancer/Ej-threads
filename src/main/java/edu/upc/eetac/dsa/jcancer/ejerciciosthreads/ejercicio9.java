package edu.upc.eetac.dsa.jcancer.ejerciciosthreads;
public class ejercicio9
{
	public static void main (String[] args ) 
	{
	Contadorej8 contador = new Contadorej8();	
	CuentaAtrasej8 contador1 = new CuentaAtrasej8(contador, "ID1", 4 );	
	CuentaAtrasej8 contador2 = new CuentaAtrasej8(contador, "ID2", 8 );
	CuentaAtrasej8 contador3 = new CuentaAtrasej8(contador, "ID3", 6 );
	
//	new Thread().contador1.start();
//	new Thread contador2.start();
	contador1.start();
	contador2.start();
	contador3.start();
	}
	
}