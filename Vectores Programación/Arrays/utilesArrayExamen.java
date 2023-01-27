public class utilesArrayExamen 
{
   /**
  * Copia el array y longitud a un array nuevo y lo almacena.
  * @param array
  * @return
  */
 static int[] copiarArray(int[] array, int longitudArray) {
     int[] nuevo = new int[longitudArray];
     for (int i = 0; i < longitudArray; i++) {
         nuevo[i] = array[i];
     }
     return nuevo;
 }
 /**
  * Borra los valores del array. Debe quedar un array vacio int[].
  * @param array
  */
 static int[] limpiar() {
     int[] nuevo = new int[0];
     return nuevo;
 }
 /**
  * Llena el array con el número de elementos indicados, el valor de estos números será 0.
  * @param array
  * @param numeroElementos
  */
 static int[] rellenar(int[] array, int numeroElementos) {
     int [] nuevo = new int[numeroElementos];
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = 0;
     }
     return nuevo;
 }
 /**
  * Llena el array con el número de elementos indicados con el valor indicado.
  * @param array
  * @param numeroElementos
  * @param valor
  * @return
  */
 static int[] rellenar(int[] array, int numeroElementos, int valor) {
     int [] nuevo = new int[numeroElementos];
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = valor;
     }
     return nuevo;
 }
 /**
  * Imprime el array por pantalla.
  * @param array
  */
 static void imprimir(int[] array) {
     System.out.println(Arrays.toString(array));
 }
 /**
  * Insertar un elemento nuevo en una posición del array, desplazando el resto de posiciones.
  * @param array
  * @param nuevoElemento
  * @param posicion
  * @return
  */
 static int[] insertarEnPosicion(int[] array, int nuevoElemento, int posicion) {
     int[] nuevo = new int[array.length+1];
     //comprobar si la posición está dentro de nuevo
     //TO-DO
     //inserto la parte izquierda del array (de 0 a posición -1)
     for (int i = 0; i < posicion; i++) {
         nuevo[i] = array[i];
     }
     //inserto nuevo elemento
     nuevo[posicion] = nuevoElemento;
     //inserto la parte derecha del array
     for (int i = posicion; i < array.length; i++) {
         nuevo[i+1] = array[i];
     }
     return nuevo;
 }
 /**
  * Insertar elemento al principio del array.
  * @param array
  * @param elemento
  * @return
  */
 static int[] insertarAlPrincipio(int[] array, int elemento) {
     int[] nuevo = insertarEnPosicion(array, elemento, 0);
     return nuevo;
 }
 /**
  * Insertar un elemento nuevo en un array ordenado.
  * @param array
  * @param elementoNuevo
  * @return
  */
 static int[] insertarOrdenado(int[] array, int elementoNuevo) {
     int[] nuevo;
     //Encontrar en la posición de inserción
     int posicionInsercion = 0;
     boolean noEncontradoPosicion = true;
     for (int i = 0; i < array.length; i++) {
         
         if (elementoNuevo < array[i] && noEncontradoPosicion) {
             posicionInsercion = i;
             noEncontradoPosicion = false;
         }
     }
     nuevo = insertarEnPosicion(array, elementoNuevo, posicionInsercion);
     
     return nuevo;
 }
 /**
  * Insertar un elemento nuevo al final del array.
  * @param array
  * @param nuevoValor
  * @return
  */
 static int[] insertarAlFinal(int[] array, int nuevoValor) {
     int[] nuevo = insertarEnPosicion(array, nuevoValor, array.length);
     return nuevo;
 }
 /**
  * Ordenar array de menor a mayor int.
  * @param array
  * @return
  */
 static int[] ordenar(int[] array) {
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     int elementoMayor = 0;
     for (int i = 0; i < nuevo.length; i++) {
         
         for (int j = 0; j < nuevo.length-1; j++) {
             
             if (nuevo[j] > nuevo[j+1]) {
                 elementoMayor = nuevo[j+1];
                 nuevo[j+1] = nuevo[j];
                 nuevo[j] = elementoMayor;
             }
         }
     }
     return nuevo;
 }
 /**
  * Devuelve true si el array está ordendo, false en caso contrario.
  * @param array
  * @return
  */
 static boolean estaOrdenado(int[] array) {
     
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     boolean ordenado = true;
     for (int i = 0; i < nuevo.length-1; i++) {
         
         if (nuevo[i] > nuevo[i+1]) {
             ordenado = false;
         }    
     }
     
     return ordenado;
 }
 /**
  * Eliminar primer valor del array.
  * @param array
  * @return
  */
 static int[] eliminarPrimero(int[] array) {
     int[] nuevo = new int [array.length-1];
     for (int i = 0; i < array.length-1; i++) {
         nuevo[i] = array[i+1];
     }
     return nuevo;
 }
 
 /**
  * Eliminar último valor del array.
  * @param array
  * @return
  */
 static int[] eliminarUltimo(int[] array) {
     int[] nuevo = new int[array.length-1];
     for (int i = array.length-1; i > 0; i--) {
         nuevo[i-1] = array[i-1];
     }
     return nuevo;
 }
 /**
  * Eliminar elemento del array.
  * @param array
  * @param elemento
  * @return
  */
 static int[] eliminar(int[] array, int elemento) {
     
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     int elementosArray = 0;
     int posicionElemento = 0;
     
     //Recorremos el array completo
     for (int i = 0; i < array.length; i++) {
         
         //Total de posiciones en las que se encuentra el elemento
         if (array[i] == elemento) {
             elementosArray++;
         }
         //Búsqueda de uno o varios elementos
         if (nuevo[i] == elemento) {
             posicionElemento = i;
             //Sustitución de posiciones
             for (int j = posicionElemento; j < array.length; j++) {
                 
                 if (j != array.length-1) {
                     nuevo[j] = nuevo[j+1];
                 }
             }
         }
     }
     //Eliminación de últimas posiciones restantes
     for (int i = 0; i < elementosArray; i++) {
         nuevo = eliminarUltimo(nuevo);
     }
     return nuevo;
 }
 /**
  * Devuelve -1 si el elemento NO está en el array y en caso de estar DEVUELVE la posición en la que est
  * @param array
  * @param elemento
  * @return
  */
 static int buscar(int[] array, int elemento) {
     int resultado = -1;
     //Recorremos array buscando la posición del elemento
     for (int i = 0; i < array.length; i++) {
         
         if (array[i] == elemento) {
             resultado = i;
         }
     }
     return resultado;
 }
 
 /**
  * Invertir array.
  * @param array
  * @return
  */
 static int[] invertir(int[] array) {
     int[] nuevo = new int[array.length];
     for (int i = 0; i < array.length; i++) {
         nuevo[i] = array[array.length-i-1];
     }
     return nuevo;
 }
 /**
  * Devuelve el array resultante de partir el array original entre la posicionInicial y la posicionFinal
  * @param array
  * @param posicionInicial
  * @param posicionCorte
  * @return 
  */
 static int[] partirPor(int[] array, int posicionInicial, int posicionCorte) {
     //Calculamos y creamos el número de posiciones del nuevo array
     int posiciones = posicionCorte - posicionInicial;
     int[] nuevo = new int[posiciones];
     //Introducimos los valores a partir de la posicionIncial
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = array[posicionInicial+i];
     }
     return nuevo;
 }
 /**
  * Devuelve true si el elemento en ambos arrays son iguales.
  * @param array1
  * @param array2
  * @param posicionAComparar
  * @return
  */
 static boolean elementosIguales(int[]array1,  int[] array2, int posicionAComparar) {
     boolean sonIguales = false;
     if (array1[posicionAComparar] == array2[posicionAComparar]) {
         sonIguales = true;
     }
     return sonIguales;
 }
 /**
  * Desordenar el array.
  * @param array
  * @return
  */
 static int[] desordenar(int[] array) {
     int[] nuevo = new int[array.length];
     int aleatorio = 0;
     for (int i = 0; i < array.length; i++) {
         aleatorio = (int)(Math.random()*array.length+1);
         nuevo[i] = array[aleatorio];
     }
     return nuevo;
 }
   /**
  * Copia el array y longitud a un array nuevo y lo almacena.
  * @param array
  * @return
  */
 static int[] copiarArray(int[] array, int longitudArray) {
     int[] nuevo = new int[longitudArray];
     for (int i = 0; i < longitudArray; i++) {
         nuevo[i] = array[i];
     }
     return nuevo;
 }
 /**
  * Borra los valores del array. Debe quedar un array vacio int[].
  * @param array
  */
 static int[] limpiar() {
     int[] nuevo = new int[0];
     return nuevo;
 }
 /**
  * Llena el array con el número de elementos indicados, el valor de estos números será 0.
  * @param array
  * @param numeroElementos
  */
 static int[] rellenar(int[] array, int numeroElementos) {
     int [] nuevo = new int[numeroElementos];
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = 0;
     }
     return nuevo;
 }
 /**
  * Llena el array con el número de elementos indicados con el valor indicado.
  * @param array
  * @param numeroElementos
  * @param valor
  * @return
  */
 static int[] rellenar(int[] array, int numeroElementos, int valor) {
     int [] nuevo = new int[numeroElementos];
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = valor;
     }
     return nuevo;
 }
 /**
  * Imprime el array por pantalla.
  * @param array
  */
 static void imprimir(int[] array) {
     System.out.println(Arrays.toString(array));
 }
 /**
  * Insertar un elemento nuevo en una posición del array, desplazando el resto de posiciones.
  * @param array
  * @param nuevoElemento
  * @param posicion
  * @return
  */
 static int[] insertarEnPosicion(int[] array, int nuevoElemento, int posicion) {
     int[] nuevo = new int[array.length+1];
     //comprobar si la posición está dentro de nuevo
     //TO-DO
     //inserto la parte izquierda del array (de 0 a posición -1)
     for (int i = 0; i < posicion; i++) {
         nuevo[i] = array[i];
     }
     //inserto nuevo elemento
     nuevo[posicion] = nuevoElemento;
     //inserto la parte derecha del array
     for (int i = posicion; i < array.length; i++) {
         nuevo[i+1] = array[i];
     }
     return nuevo;
 }
 /**
  * Insertar elemento al principio del array.
  * @param array
  * @param elemento
  * @return
  */
 static int[] insertarAlPrincipio(int[] array, int elemento) {
     int[] nuevo = insertarEnPosicion(array, elemento, 0);
     return nuevo;
 }
 /**
  * Insertar un elemento nuevo en un array ordenado.
  * @param array
  * @param elementoNuevo
  * @return
  */
 static int[] insertarOrdenado(int[] array, int elementoNuevo) {
     int[] nuevo;
     //Encontrar en la posición de inserción
     int posicionInsercion = 0;
     boolean noEncontradoPosicion = true;
     for (int i = 0; i < array.length; i++) {
         
         if (elementoNuevo < array[i] && noEncontradoPosicion) {
             posicionInsercion = i;
             noEncontradoPosicion = false;
         }
     }
     nuevo = insertarEnPosicion(array, elementoNuevo, posicionInsercion);
     
     return nuevo;
 }
 /**
  * Insertar un elemento nuevo al final del array.
  * @param array
  * @param nuevoValor
  * @return
  */
 static int[] insertarAlFinal(int[] array, int nuevoValor) {
     int[] nuevo = insertarEnPosicion(array, nuevoValor, array.length);
     return nuevo;
 }
 /**
  * Ordenar array de menor a mayor int.
  * @param array
  * @return
  */
 static int[] ordenar(int[] array) {
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     int elementoMayor = 0;
     for (int i = 0; i < nuevo.length; i++) {
         
         for (int j = 0; j < nuevo.length-1; j++) {
             
             if (nuevo[j] > nuevo[j+1]) {
                 elementoMayor = nuevo[j+1];
                 nuevo[j+1] = nuevo[j];
                 nuevo[j] = elementoMayor;
             }
         }
     }
     return nuevo;
 }
 /**
  * Devuelve true si el array está ordendo, false en caso contrario.
  * @param array
  * @return
  */
 static boolean estaOrdenado(int[] array) {
     
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     boolean ordenado = true;
     for (int i = 0; i < nuevo.length-1; i++) {
         
         if (nuevo[i] > nuevo[i+1]) {
             ordenado = false;
         }    
     }
     
     return ordenado;
 }
 /**
  * Eliminar primer valor del array.
  * @param array
  * @return
  */
 static int[] eliminarPrimero(int[] array) {
     int[] nuevo = new int [array.length-1];
     for (int i = 0; i < array.length-1; i++) {
         nuevo[i] = array[i+1];
     }
     return nuevo;
 }
 
 /**
  * Eliminar último valor del array.
  * @param array
  * @return
  */
 static int[] eliminarUltimo(int[] array) {
     int[] nuevo = new int[array.length-1];
     for (int i = array.length-1; i > 0; i--) {
         nuevo[i-1] = array[i-1];
     }
     return nuevo;
 }
 /**
  * Eliminar elemento del array.
  * @param array
  * @param elemento
  * @return
  */
 static int[] eliminar(int[] array, int elemento) {
     
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     int elementosArray = 0;
     int posicionElemento = 0;
     
     //Recorremos el array completo
     for (int i = 0; i < array.length; i++) {
         
         //Total de posiciones en las que se encuentra el elemento
         if (array[i] == elemento) {
             elementosArray++;
         }
         //Búsqueda de uno o varios elementos
         if (nuevo[i] == elemento) {
             posicionElemento = i;
             //Sustitución de posiciones
             for (int j = posicionElemento; j < array.length; j++) {
                 
                 if (j != array.length-1) {
                     nuevo[j] = nuevo[j+1];
                 }
             }
         }
     }
     //Eliminación de últimas posiciones restantes
     for (int i = 0; i < elementosArray; i++) {
         nuevo = eliminarUltimo(nuevo);
     }
     return nuevo;
 }
 /**
  * Devuelve -1 si el elemento NO está en el array y en caso de estar DEVUELVE la posición en la que est
  * @param array
  * @param elemento
  * @return
  */
 static int buscar(int[] array, int elemento) {
     int resultado = -1;
     //Recorremos array buscando la posición del elemento
     for (int i = 0; i < array.length; i++) {
         
         if (array[i] == elemento) {
             resultado = i;
         }
     }
     return resultado;
 }
 
 /**
  * Invertir array.
  * @param array
  * @return
  */
 static int[] invertir(int[] array) {
     int[] nuevo = new int[array.length];
     for (int i = 0; i < array.length; i++) {
         nuevo[i] = array[array.length-i-1];
     }
     return nuevo;
 }
 /**
  * Devuelve el array resultante de partir el array original entre la posicionInicial y la posicionFinal
  * @param array
  * @param posicionInicial
  * @param posicionCorte
  * @return 
  */
 static int[] partirPor(int[] array, int posicionInicial, int posicionCorte) {
     //Calculamos y creamos el número de posiciones del nuevo array
     int posiciones = posicionCorte - posicionInicial;
     int[] nuevo = new int[posiciones];
     //Introducimos los valores a partir de la posicionIncial
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = array[posicionInicial+i];
     }
     return nuevo;
 }
 /**
  * Devuelve true si el elemento en ambos arrays son iguales.
  * @param array1
  * @param array2
  * @param posicionAComparar
  * @return
  */
 static boolean elementosIguales(int[]array1,  int[] array2, int posicionAComparar) {
     boolean sonIguales = false;
     if (array1[posicionAComparar] == array2[posicionAComparar]) {
         sonIguales = true;
     }
     return sonIguales;
 }
 /**
  * Desordenar el array.
  * @param array
  * @return
  */
 static int[] desordenar(int[] array) {
     int[] nuevo = new int[array.length];
     int aleatorio = 0;
     for (int i = 0; i < array.length; i++) {
         aleatorio = (int)(Math.random()*array.length+1);
         nuevo[i] = array[aleatorio];
     }
     return nuevo;
 }
   /**
  * Copia el array y longitud a un array nuevo y lo almacena.
  * @param array
  * @return
  */
 static int[] copiarArray(int[] array, int longitudArray) {
     int[] nuevo = new int[longitudArray];
     for (int i = 0; i < longitudArray; i++) {
         nuevo[i] = array[i];
     }
     return nuevo;
 }
 /**
  * Borra los valores del array. Debe quedar un array vacio int[].
  * @param array
  */
 static int[] limpiar() {
     int[] nuevo = new int[0];
     return nuevo;
 }
 /**
  * Llena el array con el número de elementos indicados, el valor de estos números será 0.
  * @param array
  * @param numeroElementos
  */
 static int[] rellenar(int[] array, int numeroElementos) {
     int [] nuevo = new int[numeroElementos];
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = 0;
     }
     return nuevo;
 }
 /**
  * Llena el array con el número de elementos indicados con el valor indicado.
  * @param array
  * @param numeroElementos
  * @param valor
  * @return
  */
 static int[] rellenar(int[] array, int numeroElementos, int valor) {
     int [] nuevo = new int[numeroElementos];
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = valor;
     }
     return nuevo;
 }
 /**
  * Imprime el array por pantalla.
  * @param array
  */
 static void imprimir(int[] array) {
     System.out.println(Arrays.toString(array));
 }
 /**
  * Insertar un elemento nuevo en una posición del array, desplazando el resto de posiciones.
  * @param array
  * @param nuevoElemento
  * @param posicion
  * @return
  */
 static int[] insertarEnPosicion(int[] array, int nuevoElemento, int posicion) {
     int[] nuevo = new int[array.length+1];
     //comprobar si la posición está dentro de nuevo
     //TO-DO
     //inserto la parte izquierda del array (de 0 a posición -1)
     for (int i = 0; i < posicion; i++) {
         nuevo[i] = array[i];
     }
     //inserto nuevo elemento
     nuevo[posicion] = nuevoElemento;
     //inserto la parte derecha del array
     for (int i = posicion; i < array.length; i++) {
         nuevo[i+1] = array[i];
     }
     return nuevo;
 }
 /**
  * Insertar elemento al principio del array.
  * @param array
  * @param elemento
  * @return
  */
 static int[] insertarAlPrincipio(int[] array, int elemento) {
     int[] nuevo = insertarEnPosicion(array, elemento, 0);
     return nuevo;
 }
 /**
  * Insertar un elemento nuevo en un array ordenado.
  * @param array
  * @param elementoNuevo
  * @return
  */
 static int[] insertarOrdenado(int[] array, int elementoNuevo) {
     int[] nuevo;
     //Encontrar en la posición de inserción
     int posicionInsercion = 0;
     boolean noEncontradoPosicion = true;
     for (int i = 0; i < array.length; i++) {
         
         if (elementoNuevo < array[i] && noEncontradoPosicion) {
             posicionInsercion = i;
             noEncontradoPosicion = false;
         }
     }
     nuevo = insertarEnPosicion(array, elementoNuevo, posicionInsercion);
     
     return nuevo;
 }
 /**
  * Insertar un elemento nuevo al final del array.
  * @param array
  * @param nuevoValor
  * @return
  */
 static int[] insertarAlFinal(int[] array, int nuevoValor) {
     int[] nuevo = insertarEnPosicion(array, nuevoValor, array.length);
     return nuevo;
 }
 /**
  * Ordenar array de menor a mayor int.
  * @param array
  * @return
  */
 static int[] ordenar(int[] array) {
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     int elementoMayor = 0;
     for (int i = 0; i < nuevo.length; i++) {
         
         for (int j = 0; j < nuevo.length-1; j++) {
             
             if (nuevo[j] > nuevo[j+1]) {
                 elementoMayor = nuevo[j+1];
                 nuevo[j+1] = nuevo[j];
                 nuevo[j] = elementoMayor;
             }
         }
     }
     return nuevo;
 }
 /**
  * Devuelve true si el array está ordendo, false en caso contrario.
  * @param array
  * @return
  */
 static boolean estaOrdenado(int[] array) {
     
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     boolean ordenado = true;
     for (int i = 0; i < nuevo.length-1; i++) {
         
         if (nuevo[i] > nuevo[i+1]) {
             ordenado = false;
         }    
     }
     
     return ordenado;
 }
 /**
  * Eliminar primer valor del array.
  * @param array
  * @return
  */
 static int[] eliminarPrimero(int[] array) {
     int[] nuevo = new int [array.length-1];
     for (int i = 0; i < array.length-1; i++) {
         nuevo[i] = array[i+1];
     }
     return nuevo;
 }
 
 /**
  * Eliminar último valor del array.
  * @param array
  * @return
  */
 static int[] eliminarUltimo(int[] array) {
     int[] nuevo = new int[array.length-1];
     for (int i = array.length-1; i > 0; i--) {
         nuevo[i-1] = array[i-1];
     }
     return nuevo;
 }
 /**
  * Eliminar elemento del array.
  * @param array
  * @param elemento
  * @return
  */
 static int[] eliminar(int[] array, int elemento) {
     
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     int elementosArray = 0;
     int posicionElemento = 0;
     
     //Recorremos el array completo
     for (int i = 0; i < array.length; i++) {
         
         //Total de posiciones en las que se encuentra el elemento
         if (array[i] == elemento) {
             elementosArray++;
         }
         //Búsqueda de uno o varios elementos
         if (nuevo[i] == elemento) {
             posicionElemento = i;
             //Sustitución de posiciones
             for (int j = posicionElemento; j < array.length; j++) {
                 
                 if (j != array.length-1) {
                     nuevo[j] = nuevo[j+1];
                 }
             }
         }
     }
     //Eliminación de últimas posiciones restantes
     for (int i = 0; i < elementosArray; i++) {
         nuevo = eliminarUltimo(nuevo);
     }
     return nuevo;
 }
 /**
  * Devuelve -1 si el elemento NO está en el array y en caso de estar DEVUELVE la posición en la que est
  * @param array
  * @param elemento
  * @return
  */
 static int buscar(int[] array, int elemento) {
     int resultado = -1;
     //Recorremos array buscando la posición del elemento
     for (int i = 0; i < array.length; i++) {
         
         if (array[i] == elemento) {
             resultado = i;
         }
     }
     return resultado;
 }
 
 /**
  * Invertir array.
  * @param array
  * @return
  */
 static int[] invertir(int[] array) {
     int[] nuevo = new int[array.length];
     for (int i = 0; i < array.length; i++) {
         nuevo[i] = array[array.length-i-1];
     }
     return nuevo;
 }
 /**
  * Devuelve el array resultante de partir el array original entre la posicionInicial y la posicionFinal
  * @param array
  * @param posicionInicial
  * @param posicionCorte
  * @return 
  */
 static int[] partirPor(int[] array, int posicionInicial, int posicionCorte) {
     //Calculamos y creamos el número de posiciones del nuevo array
     int posiciones = posicionCorte - posicionInicial;
     int[] nuevo = new int[posiciones];
     //Introducimos los valores a partir de la posicionIncial
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = array[posicionInicial+i];
     }
     return nuevo;
 }
 /**
  * Devuelve true si el elemento en ambos arrays son iguales.
  * @param array1
  * @param array2
  * @param posicionAComparar
  * @return
  */
 static boolean elementosIguales(int[]array1,  int[] array2, int posicionAComparar) {
     boolean sonIguales = false;
     if (array1[posicionAComparar] == array2[posicionAComparar]) {
         sonIguales = true;
     }
     return sonIguales;
 }
 /**
  * Desordenar el array.
  * @param array
  * @return
  */
 static int[] desordenar(int[] array) {
     int[] nuevo = new int[array.length];
     int aleatorio = 0;
     for (int i = 0; i < array.length; i++) {
         aleatorio = (int)(Math.random()*array.length+1);
         nuevo[i] = array[aleatorio];
     }
     return nuevo;
 }
   /**
  * Copia el array y longitud a un array nuevo y lo almacena.
  * @param array
  * @return
  */
 static int[] copiarArray(int[] array, int longitudArray) {
     int[] nuevo = new int[longitudArray];
     for (int i = 0; i < longitudArray; i++) {
         nuevo[i] = array[i];
     }
     return nuevo;
 }
 /**
  * Borra los valores del array. Debe quedar un array vacio int[].
  * @param array
  */
 static int[] limpiar() {
     int[] nuevo = new int[0];
     return nuevo;
 }
 /**
  * Llena el array con el número de elementos indicados, el valor de estos números será 0.
  * @param array
  * @param numeroElementos
  */
 static int[] rellenar(int[] array, int numeroElementos) {
     int [] nuevo = new int[numeroElementos];
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = 0;
     }
     return nuevo;
 }
 /**
  * Llena el array con el número de elementos indicados con el valor indicado.
  * @param array
  * @param numeroElementos
  * @param valor
  * @return
  */
 static int[] rellenar(int[] array, int numeroElementos, int valor) {
     int [] nuevo = new int[numeroElementos];
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = valor;
     }
     return nuevo;
 }
 /**
  * Imprime el array por pantalla.
  * @param array
  */
 static void imprimir(int[] array) {
     System.out.println(Arrays.toString(array));
 }
 /**
  * Insertar un elemento nuevo en una posición del array, desplazando el resto de posiciones.
  * @param array
  * @param nuevoElemento
  * @param posicion
  * @return
  */
 static int[] insertarEnPosicion(int[] array, int nuevoElemento, int posicion) {
     int[] nuevo = new int[array.length+1];
     //comprobar si la posición está dentro de nuevo
     //TO-DO
     //inserto la parte izquierda del array (de 0 a posición -1)
     for (int i = 0; i < posicion; i++) {
         nuevo[i] = array[i];
     }
     //inserto nuevo elemento
     nuevo[posicion] = nuevoElemento;
     //inserto la parte derecha del array
     for (int i = posicion; i < array.length; i++) {
         nuevo[i+1] = array[i];
     }
     return nuevo;
 }
 /**
  * Insertar elemento al principio del array.
  * @param array
  * @param elemento
  * @return
  */
 static int[] insertarAlPrincipio(int[] array, int elemento) {
     int[] nuevo = insertarEnPosicion(array, elemento, 0);
     return nuevo;
 }
 /**
  * Insertar un elemento nuevo en un array ordenado.
  * @param array
  * @param elementoNuevo
  * @return
  */
 static int[] insertarOrdenado(int[] array, int elementoNuevo) {
     int[] nuevo;
     //Encontrar en la posición de inserción
     int posicionInsercion = 0;
     boolean noEncontradoPosicion = true;
     for (int i = 0; i < array.length; i++) {
         
         if (elementoNuevo < array[i] && noEncontradoPosicion) {
             posicionInsercion = i;
             noEncontradoPosicion = false;
         }
     }
     nuevo = insertarEnPosicion(array, elementoNuevo, posicionInsercion);
     
     return nuevo;
 }
 /**
  * Insertar un elemento nuevo al final del array.
  * @param array
  * @param nuevoValor
  * @return
  */
 static int[] insertarAlFinal(int[] array, int nuevoValor) {
     int[] nuevo = insertarEnPosicion(array, nuevoValor, array.length);
     return nuevo;
 }
 /**
  * Ordenar array de menor a mayor int.
  * @param array
  * @return
  */
 static int[] ordenar(int[] array) {
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     int elementoMayor = 0;
     for (int i = 0; i < nuevo.length; i++) {
         
         for (int j = 0; j < nuevo.length-1; j++) {
             
             if (nuevo[j] > nuevo[j+1]) {
                 elementoMayor = nuevo[j+1];
                 nuevo[j+1] = nuevo[j];
                 nuevo[j] = elementoMayor;
             }
         }
     }
     return nuevo;
 }
 /**
  * Devuelve true si el array está ordendo, false en caso contrario.
  * @param array
  * @return
  */
 static boolean estaOrdenado(int[] array) {
     
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     boolean ordenado = true;
     for (int i = 0; i < nuevo.length-1; i++) {
         
         if (nuevo[i] > nuevo[i+1]) {
             ordenado = false;
         }    
     }
     
     return ordenado;
 }
 /**
  * Eliminar primer valor del array.
  * @param array
  * @return
  */
 static int[] eliminarPrimero(int[] array) {
     int[] nuevo = new int [array.length-1];
     for (int i = 0; i < array.length-1; i++) {
         nuevo[i] = array[i+1];
     }
     return nuevo;
 }
 
 /**
  * Eliminar último valor del array.
  * @param array
  * @return
  */
 static int[] eliminarUltimo(int[] array) {
     int[] nuevo = new int[array.length-1];
     for (int i = array.length-1; i > 0; i--) {
         nuevo[i-1] = array[i-1];
     }
     return nuevo;
 }
 /**
  * Eliminar elemento del array.
  * @param array
  * @param elemento
  * @return
  */
 static int[] eliminar(int[] array, int elemento) {
     
     //Copiamos el array
     int[] nuevo;
     nuevo = copiarArray(array, array.length);
     int elementosArray = 0;
     int posicionElemento = 0;
     
     //Recorremos el array completo
     for (int i = 0; i < array.length; i++) {
         
         //Total de posiciones en las que se encuentra el elemento
         if (array[i] == elemento) {
             elementosArray++;
         }
         //Búsqueda de uno o varios elementos
         if (nuevo[i] == elemento) {
             posicionElemento = i;
             //Sustitución de posiciones
             for (int j = posicionElemento; j < array.length; j++) {
                 
                 if (j != array.length-1) {
                     nuevo[j] = nuevo[j+1];
                 }
             }
         }
     }
     //Eliminación de últimas posiciones restantes
     for (int i = 0; i < elementosArray; i++) {
         nuevo = eliminarUltimo(nuevo);
     }
     return nuevo;
 }
 /**
  * Devuelve -1 si el elemento NO está en el array y en caso de estar DEVUELVE la posición en la que est
  * @param array
  * @param elemento
  * @return
  */
 static int buscar(int[] array, int elemento) {
     int resultado = -1;
     //Recorremos array buscando la posición del elemento
     for (int i = 0; i < array.length; i++) {
         
         if (array[i] == elemento) {
             resultado = i;
         }
     }
     return resultado;
 }
 
 /**
  * Invertir array.
  * @param array
  * @return
  */
 static int[] invertir(int[] array) {
     int[] nuevo = new int[array.length];
     for (int i = 0; i < array.length; i++) {
         nuevo[i] = array[array.length-i-1];
     }
     return nuevo;
 }
 /**
  * Devuelve el array resultante de partir el array original entre la posicionInicial y la posicionFinal
  * @param array
  * @param posicionInicial
  * @param posicionCorte
  * @return 
  */
 static int[] partirPor(int[] array, int posicionInicial, int posicionCorte) {
     //Calculamos y creamos el número de posiciones del nuevo array
     int posiciones = posicionCorte - posicionInicial;
     int[] nuevo = new int[posiciones];
     //Introducimos los valores a partir de la posicionIncial
     for (int i = 0; i < nuevo.length; i++) {
         nuevo[i] = array[posicionInicial+i];
     }
     return nuevo;
 }
 /**
  * Devuelve true si el elemento en ambos arrays son iguales.
  * @param array1
  * @param array2
  * @param posicionAComparar
  * @return
  */
 static boolean elementosIguales(int[]array1,  int[] array2, int posicionAComparar) {
     boolean sonIguales = false;
     if (array1[posicionAComparar] == array2[posicionAComparar]) {
         sonIguales = true;
     }
     return sonIguales;
 }
 /**
  * Desordenar el array.
  * @param array
  * @return
  */
 static int[] desordenar(int[] array) {
     int[] nuevo = new int[array.length];
     int aleatorio = 0;
     for (int i = 0; i < array.length; i++) {
         aleatorio = (int)(Math.random()*array.length+1);
         nuevo[i] = array[aleatorio];
     }
     return nuevo;
 }
    
}
