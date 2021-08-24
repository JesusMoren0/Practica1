import java.util.Scanner;
public class prtc1 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args) {
		
		int opc=0;
		float suma=0;
		float califa=0;
		int acumlacion=0;
		
		System.out.println("Introduce nombre");
		String nombre = sc.nextLine();
		
		float[] calificaciones = new float [5];
		while(acumlacion<5){
			System.out.println("Introduce calificacion.");
			califa= sc.nextFloat();
			
			calificaciones[acumlacion]=califa;
			suma+=califa;
			acumlacion++;
		}
		do {
			System.out.println();
			System.out.println("               ---MENU---");
			System.out.println("1. Impresion de calificacione y promedios.");
			System.out.println("2. Calificaciones y calificacion mas baja.");
			System.out.println("3. Calificaciones y calificacion mas alta.");
			System.out.println("4. Salir.");
			
			System.out.println("Selecciona una opcion.");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				cali_promedio(suma, calificaciones);
				break;
			case 2:
				cali_menor(calificaciones);
				break;
			case 3:
				cali_mayor(calificaciones);
				break;
			case 4:
				break;
				default:
					System.out.println("Opcion invalida...");
			}
	}
	while(opc!=4);
	System.out.println("Programa finalizado...");
	}
	static void cali_promedio(float suma, float calificaciones[]){
		System.out.println("|Calificaciones ingresadas|");
		for(int i=0;i<5;i++) {
			System.out.println();
			System.out.println("Calificaciones--->"+calificaciones[i]);
		}
		float promedio = suma/5;
		System.out.println();
		System.out.println("|Promedio de las calificaciones|");
		System.out.println();
		System.out.println("Promedio total--->"+promedio);
	}
	
	static void cali_menor(float calificaciones[]){
		System.out.println("|Calificaciones ingresadas|");
		for(int i=0;i<5;i++) {
			System.out.println();
			System.out.println("Calificaciones--->"+calificaciones[i]);
		}
		float menor = calificaciones[1];
		for (int i=0;i<calificaciones.length;i++) {
			if(calificaciones[i]<menor) {
				menor=calificaciones[i];
			}
		}
		System.out.println();
		System.out.println("La calificacion menor ingresada es---> "+menor);
	}
	static void cali_mayor(float calificaciones[]){
		System.out.println("|Calificaciones ingresadas|");
		for(int i=0;i<5;i++) {
			System.out.println();
			System.out.println("Calificaciones--->"+calificaciones[i]);
		}
		
		float mayor = calificaciones[1];
		for(int i=0;i<calificaciones.length;i++) {
			if (calificaciones[i]>mayor) {
				mayor = calificaciones[i];
			}
		}
		System.out.println();
		System.out.println("La calificaciones mayor ingresada es ---> "+mayor);
	}
	
}