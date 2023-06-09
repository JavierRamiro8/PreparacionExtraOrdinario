package clasesCuadradoMagico;

public class ComprobacionesCuadradoMagico {
  static public boolean EsCuadradadoMagico(int[][] arrayBidimensional) {
    // He creado las variables de valorCero/Uno/Dos para que en el codigo no haya
    // numeros magicos

    // Si son final, deben ir en mayusculas.
    // Pero no hace falta crear constantes para 0 y 1. Y me temo que con valorDos te
    // estás restringiendo a matrices de 3x3. Y si recibes un array bidimensional de
    // 10x10, ¿qué haces?
    // final int valorCero = 0;
    // final int valorUno = 1;
    // final int valorDos = 2;

    int numeroFilas = arrayBidimensional.length;
    int numeroColumnas = arrayBidimensional[0].length;
    int sumaReferencia = 0;
    int sumaFila = 0;
    int sumaColumna = 0;
    int sumaDiagonalIzqDer = 0;
    int sumaDiagonalDerIzq = 0;

    // Comprobamos si es una matriz irregular, con filas de distinto tamaño
    for (int i = 0; i < numeroFilas; i++) {
      if (arrayBidimensional[i].length != numeroColumnas) {
        // No todas las filas tienen el mismo número de columnas
        return false;
      }
    }

    // Comprobamos si es una matriz cuadrada
    if (numeroFilas != numeroColumnas) {
      return false;
    }

    int tamanio = numeroFilas;

    // Calculamos la suma de la primera fila y la tomamos como referencia. Todas las
    // demás
    // sumas debnumeroFilasen ser iguales
    for (int col = 0; col < numeroColumnas; col++) {
      sumaReferencia += arrayBidimensional[0][col];
    }

    // Comprobamos que la suma de todas las filas, menos la primera, coincidan con
    // la suma de referencia
    for (int i = 1; i < numeroFilas; i++) {
      sumaFila = 0;
      for (int j = 0; j < numeroColumnas; j++) {
        sumaFila += arrayBidimensional[i][j];
      }

      if (sumaFila != sumaReferencia) {
        // La fila 'i' no tiene la misma suma que la primera
        return false;
      }
    }

    // Comprobamos que la suma de todas las columnas coincidan con la suma de
    // referencia
    for (int columna = 0; columna < numeroColumnas; columna++) {
      sumaColumna = 0;
      for (int fila = 0; fila < numeroColumnas; fila++) {
        sumaColumna += arrayBidimensional[fila][columna];
      }

      if (sumaColumna != sumaReferencia) {
        // La columna 'columna' no tiene la misma suma que la primera
        return false;
      }
    }

    // Sumas de Diagonales
    for (int i = 0; i < numeroFilas; i++) {
      sumaDiagonalIzqDer += arrayBidimensional[i][i];
    }

    if (sumaReferencia != sumaDiagonalIzqDer) {
      return false;
    }

    for (int i = 0; i < numeroFilas; i++) {
      sumaDiagonalDerIzq += arrayBidimensional[i][numeroFilas - 1 - i];
    }
    if (sumaReferencia != sumaDiagonalDerIzq) {
      return false;
    }

    // Si llegamos hasta aquí, hemos pasado todas las comprobaciones
    return true;
  }
}