import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public  class Lector{  
    
    HashMap<Integer, LinkedList<Vertice>>mapaGrafo = new HashMap<Integer, LinkedList<Vertice>>();
    LinkedList<Carro> car = new LinkedList<Carro>();
    int recor;

    public Lector(){
      try{
      BufferedReader b = new BufferedReader(new FileReader("C://Users//jdacevedol//Downloads//dataset-ejemplo-U=205-p=1.1.txt"));
        
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
      proceso();
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
          //System.out.println(mapaGrafo.get(key).get(0).ini);
        }
    }

    public int fin(){
         return 205/5;
    }

    public void proceso(){
        //list.addLast(val);
        int max = 0;
        int min = 100;
        int cont = 0;
        for (int i = 0; i<mapaGrafo.get(1).size(); i++) {
            if (mapaGrafo.get(1).get(i).cost > max){
              max = mapaGrafo.get(1).get(i).cost;
            }else if(mapaGrafo.get(1).get(i).cost < min){
              min = mapaGrafo.get(1).get(i).cost;
            }
            cont += mapaGrafo.get(1).get(i).cost; 
        }

        int prom = cont/205;
         SacarCarros(max,prom);
    }

    public void SacarCarros(int max, int prom){
          Carro carrito ;
          int act;
          int ini = 1;
          int list = -1;
          //System.out.println(fin());
            for(int i=0; i < mapaGrafo.get(ini).size(); i++){
                if(mapaGrafo.get(ini).get(i).fin == -1){
                    
                }else if (mapaGrafo.get(ini).get(i).cost > prom ){
                    carrito = new Carro(mapaGrafo.get(ini).get(i).fin,mapaGrafo.get(ini).get(i).fin);
                    car.add(carrito);
                    list += 1; 
                    act = mapaGrafo.get(ini).get(i).fin;
                    buscarRecor(list,act,prom);  
                }
                
            }
         System.out.println("Resultado " + car.size());   
         PDF();
          
    }

    public void buscarRecor(int list, int act,int prom){
        int aux = act;
        for(int j=0; j < mapaGrafo.get(act).size(); j++){
              aux = act;
              if (mapaGrafo.get(act).get(j).cost < prom ){
                  car.get(list).agre(mapaGrafo.get(act).get(j).fin);
                  act = mapaGrafo.get(act).get(j).fin;
                  j = 0;
                  mapaGrafo.get(1).get(aux).fin = -1;
              }
              if(car.get(list).cap == 5){
                  mapaGrafo.get(1).get(act).fin = -1;
                  break;
              }
        }
        //map.remove(objeto);
    }

    public void PDF()
    {
      
        try
        {
            
            String ruta="C://Users//jdacevedol//Documents";
            FileOutputStream archivo =new FileOutputStream("Carros.pdf");
            Document doc=new Document();
            PdfWriter.getInstance(doc,archivo);

            //Image imagen=Image.getInstance("LOGO.USUARIO.png");
            //doc.add(imagen);
              
            doc.open();
            doc.add(new Paragraph("Carros"));
            doc.add(new Paragraph(" "));
            for(int i = 0; i < car.size(); i++){
                doc.add(new Paragraph("Carro #:" + j + ",empieza desde :"+car.get(i).ini+ " y el ultimo que recoge es: " +car.get(i).act + ""));
                doc.add(new Paragraph(" "));
            }
            doc.close();
        }catch(Exception e)
                {
                    System.out.println("No puede generar el pdf");
                }
    }
} 
