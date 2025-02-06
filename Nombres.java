
class Nombres {
    public void lista_de_nombres_de_los_estudiantes() {
        String[] nombres = new String[14];
        nombres [0]="Leslie Sosa";
        nombres [1]="Argel Jhamir";
        nombres [2]="Rebeca Garcia";
        nombres [3]="Jorge Chaparro";
        nombres [4]="Rodrigo No se que";
        nombres [5]="Oscar Aragon";
        nombres [6]="Carlo Ruiz";
        nombres [7]="Cesar Chavira";
        nombres [8]="Justin Salem";
        nombres [9]="Camila No se que";
        nombres [10]="Christian Loya";
        nombres [11]="Sebastián Nevarez";
        nombres [12]="Mario Ramos";
        nombres [13]="Sebastián Avitia";
        
        System.out.println(nombres.length);
    
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Yo soy: " + nombres[i]);
            
            
        }
    }
    
}