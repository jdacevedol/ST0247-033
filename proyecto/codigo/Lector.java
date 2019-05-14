import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;

public class Lector{  
    HashMap<Integer, LinkedList<Vertice>>mapaGrafo = new HashMap<Integer, LinkedList<Vertice>>();

    public Lector(String archivo){
      try{
      BufferedReader b = new BufferedReader(new FileReader(archivo));
      int ini;
      int fin;
      int cost;
      b.readLine();
      String text;
      boolean llave = false; 
      while(llave != true){
         text = b.readLine();
         if (text.equals("Costo de Caminos Cortos. Formato: ID, ID, peso")){
             break;
         } 
      }
      b.readLine();
      Vertice ver;
      while((text = b.readLine()) != null) {
            String [] parte = text.split(" ");
            ini = Integer.parseInt(parte[0]);
            fin = Integer.parseInt(parte[1]);
            cost = Integer.parseInt(parte[2]);
            ver = new Vertice(ini,fin,cost);
            hash(ini, ver);
      }
      }catch(Exception e){
          System.out.println(e);
      }
    }

    public void hash(int key, Vertice ver){
        if(mapaGrafo.get(key) != null){
            mapaGrafo.get(key).add(ver);
        }else{
          mapaGrafo.put(key, new LinkedList <Vertice>());
          mapaGrafo.get(key).add(ver);
          System.out.println(mapaGrafo.get(key).get(0).ini);
        }
    }
    
    public void proceso(){
        
    }
} 