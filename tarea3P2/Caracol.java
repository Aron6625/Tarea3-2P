
public class Caracol
{
    int N1 = 5;
    int N2 = 5;
    int[][]M=new int[N1][N2];
    public void Mostrar(){
       for(int i=0;i<N1;i++){
         for(int j=0;j<N2;j++)
         if(M[i][j]<10){
             System.out.print("0"+M[i][j]+" ");
         }else{
             System.out.print(M[i][j]+" ");
         }
        }System.out.println(" ");
    }
    public void Organiza(){
       int numero = 1;
       int fila = 0;
       int colum = 0;
       
    for(int i=0;i<N1;i++){
        colum = i;
        for(fila=i;fila<=(N2-1-i);fila++){
               M[colum][fila]=numero;
               numero++;
        }
    }
    fila=N2-1-i;
    for(colum=i+1;colum<=(N1-1-i);colum++){
        M[colum][fila]=numero;
        numero++;
    }
    colum=N1-1-i;
    for(fila=(N2-2-i);fila>=i;fila--){
        M[colum][fila]=numero;
        numero++;
    }
    fila=i;
    for(colum=(N1-2-i);colum>=i+1;colum--){
        M[colum][fila]=numero;
        numero++;
    }
    }
    public void Organiza2(){
       int numero = 1;
       int fila = 0;
       int colum = 0;
       
    for(int i=0;i<N1;i++){
        colum = i;
        for(fila=i;fila<=(N2-1-i);fila++){
               M[fila][colum]=numero;
               numero++;
        }
    }
    fila=N2-1-i;
    for(colum=i+1;colum<=(N1-1-i);colum++){
        M[fila][colum]=numero;
        numero++;
    }
    colum=N1-1-i;
    for(fila=(N2-2-i);fila>=i;fila--){
        M[fila][colum]=numero;
        numero++;
    }
    fila=i;
    for(colum=(N1-2-i);colum>=i+1;colum--){
        M[fila][colum]=numero;
        numero++;
    }
    }
    
}
