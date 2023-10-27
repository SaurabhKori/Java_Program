package has_a_Relationship_Composition;

public class Engine {
   int np;
   int strokes;
   String type;
   Engine(){
	   
   }
   Engine(int np,int strokes,String type){
	   this.np=np;
	   this.strokes=strokes;
	   this.type=type;
   }
   public void start() {
	   System.out.println("Start a Engine");
   }
   public void displayE() {
	   System.out.println("Engine np====>"+np);
	   System.out.println("Engine strokes==>"+strokes);
	   System.out.println("Engine type=====>"+type);
   }

}
