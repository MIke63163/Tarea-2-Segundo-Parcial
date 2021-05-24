

public class RegistroDeNotas{
   private Estudiante[] lista;
   private int cantNotas; 
   private int i;
public RegistroDeNotas(int nroEst, int nroNotas){
    lista = new Estudiante [nroEst];
    cantNotas = nroNotas;
    i = 0;
}
public void addEstudiante(String name){
    if(i < lista.length){
       lista[i] = new Estudiante(name,cantNotas,i + 1);
       i++;
    }
}
public void addNotas(int nroList, int puntaje){
    if(nroList <= lista.length){
      Estudiante s;
      s = lista[nroList - 1];
      s.addNota(puntaje);
      lista[nroList - 1] = s;
    }
}
public void promNotas(){
    int j;
    j = 0;
    for(Estudiante n : lista){
        Estudiante s;
        s = lista[j];
        s.prom();
        j++;
    }
}
public void prom51(){
    int k;
    k = 0;
    for(Estudiante i : lista){
        promNotas();
        Estudiante s;
        s = lista[k];
        if(s.getNotaProm( ) < 51){
           s.setnotaprom();
           }else{
                 s.prom();
           }
        k++;
        }
}
public int cantApr(){
    int cant;
    int l;
    l    = 0;
    cant = 0;
    for(Estudiante i : lista){
        promNotas();
        Estudiante s;
        s = lista[l];
        if(s.getNotaProm( ) > 50){
           cant++;
          }
        l++;
     }return cant;
}
public int cantRepr(){
    int cant; 
    int l;
    l    = 0;
    cant = 0;
    for(Estudiante i : lista){
        promNotas();
        Estudiante s;
        s = lista[l];
        if(s.getNotaProm( ) < 51){
           cant++;
           }
        l++;
    }return cant;
}
public Estudiante notaAlta(){
     int a;
     int b;
     Estudiante iz;
     Estudiante der;
     a   = 0;
     b   = 1;
     iz  = lista[a];
     der = lista[b];
     while(b < lista.length){
        if(iz.getNotaProm() > der.getNotaProm()){
           b++;
          }else{
                a = b;
                b = a++;
        }
     }return iz;
}
}
