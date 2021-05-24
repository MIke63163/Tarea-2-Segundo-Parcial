
public class Estudiante{
   String nombre;
   int[] nota;
   int nroList;
   int i;
   double notaProm;
public Estudiante(String nombre,int nota, int nroList){
    this.nombre = nombre;
    this.nota = new int[nota];
    this.nroList = nroList;
    i = 0;
    notaProm = 0;
}
public void addNota(int n){
    if(i < nota.length){
     nota[i] = n;
     i++;
    }
}
private int getNota(int i){
    int n;
    n = nota[i];
    return n;
}
 public void prom(){
    int i;
    i = 0;
    for(int n : nota){
        while(i < nota.length){
        notaProm += getNota(i);
        i++;
        }
    }
    notaProm /= nota.length;
}
public double getNotaProm(){
    return notaProm;
}
public void setnotaprom(){
    notaProm = 0;
    
}
}
