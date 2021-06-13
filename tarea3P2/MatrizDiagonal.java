
public class MatrizDiagonal
{
    public void numeroDiagonal(){
    int [][]n = new int [3][3];//new (filas)(columnas)
    n[0][0]=1;
    n[1][1]=1;
    n[2][2]=1;
    n[1][1]=1;
    n[2][0]=1;
    n[2][0]=1;
    System.out.println("Mostrar una diagonal");
    mostrar(n);
    }
    public void mostrar(int[][] matriz){
        //revisar cada fila=i
        for(int i=0;i<matriz.length;i++){
        //revisar cada columna en la fila i columna=j
        for(int j=0;j<matriz[i].length;j++){
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
        }
    }
}