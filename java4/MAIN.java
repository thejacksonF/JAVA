package JAVA.java4;

public class MAIN {
    public static void main(String[] args) {
        SumaDosNumeros solver = new SumaDosNumeros();

        int[] lista_de_numeros = {2, 7, 11, 15};
        int numero_para_sumar = 9;

        int[] RESULTADO = solver.twoSum(lista_de_numeros, numero_para_sumar);

        System.out.println("Index necesarios: [" + RESULTADO[0] + ", " + RESULTADO[1] + "]");

        //PILA

        EjemploPila pila = new EjemploPila();

        pila.push("Camarones con pollo");
        pila.push("Langosta con puré");
        pila.push("Rib-eye con puré y brócoli");
        pila.push("Spaghetti con albóndigas y salsa de tomate");
        pila.push("Plato con ensalada");
        pila.push("Sopa de tomate con verduras para el malestar");


        pila.mostrarEstado();

        //COLA

        EjemploCola cola = new EjemploCola();
        cola.add("Cliente 1 de nombre: Tobias Thompson Junior. Profesión: Ingeniero electrico");
        cola.add("Cliente 2 de nombre: Simon Pedro Avitia Jaquez. Profesión: Ingeniero de software");
        cola.add("Cliente 3 de nombre: Mateo Valles Rivera. Profesión: Comerciante");
        cola.add("Cliente 4 de nombre: Juan el bautista. Profesión: Cerrajero");
        cola.add("Cliente 5 de nombre: María Magdalena. Profesión: Peleadora de KICKBOXING");
        cola.add("Cliente 6 de nombre: Bartolomeo. Profesión: Arquitecto");
        cola.add("Cliente 7 de nombre: Andres. Profesión: Pescador");
        cola.add("Cliente 8 de nombre: Santiago el menor. Profesión: Medico cirujano");
        cola.add("Cliente 9 de nombre: Jesús. Profesión: Carpintero");


        System.out.println("Cliente al frente: " + cola.peek());


        //lista enlzada

        LinkedList_SIMPLE list = new LinkedList_SIMPLE();
        list.insert(16); //un numero muy ESPECIAL
        list.insert(1978); //Cuando salió la primera película de Halloween
        list.insert(150); //Lo que me debe un amigo
        list.insert(30); //Lo que le debo yo
        list.insert(120); //un numero muy lindo
        list.insert(95); //El numero del rayo mcqueen

        System.out.println("List:");
        list.display();

        System.out.println("Acasooo... ¿Está 1978 en la lista? " + list.search(1978));

        list.delete(20);

        System.out.println("Wow que sorpresa, no pensaba que estuviera en la lista, bueno a seguirle:");
        list.display();


        
        ListaDoble lista = new ListaDoble();
        lista.agregarInicio(100);
        lista.agregarFinal(209);
        lista.agregarFinal(1988);
        lista.agregarInicio(2005);
        lista.agregarFinal(2006);
        lista.agregarInicio(2100);
        lista.agregarFinal(9999);
        lista.agregarInicio(2023);
        lista.agregarFinal(1419);

        lista.mostrar();

        lista.eliminar(20);

        lista.mostrar();

        //lista circular

        ListaCircular2 listadelacircular = new ListaCircular2();
        listadelacircular.agregar(1);
        listadelacircular.agregar(2);
        listadelacircular.agregar(3);
        listadelacircular.agregar(4);

        listadelacircular.mostrar();

        //grafo

        GrafoBySebastianAvitia grafo = new GrafoBySebastianAvitia();

        grafo.agregarArista(137, 8);
        grafo.agregarArista(45, 190);
        grafo.agregarArista(120, 89);
        grafo.agregarArista(300, 415);
        grafo.agregarArista(200, 100);
        grafo.agregarArista(55, 97);
        grafo.agregarArista(83, 102);
        grafo.agregarArista(28, 470);

        grafo.mostrar();



        //MULTIPLICACION

        TwoMultiplication multiplicador = new TwoMultiplication();

        int[] lista_de_numeros_para_multiplicacion = {2, 4, 5, 10,120,89,33,19,3,16,100};
        int producto_objetivo = 20;

        int[] resultado_de_multiplicacion = multiplicador.twoMultiply(lista_de_numeros_para_multiplicacion, producto_objetivo);

        if (resultado_de_multiplicacion.length == 2) {
            System.out.println("Index necesarios para la multiplicacion: [" + resultado_de_multiplicacion[0] + ", " + resultado_de_multiplicacion[1] + "]");
        } else {
            System.out.println("No se logro conseguir: " + producto_objetivo);
        }

        ARBOLGEEKS arbol = new ARBOLGEEKS();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("Recorrido en orden del árbol:");
        arbol.recorrerEnOrden();





    }


    }

