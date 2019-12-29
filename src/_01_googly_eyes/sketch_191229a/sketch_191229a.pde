void setup(){
       PImage face = loadImage("download.jpg");
    face.resize(800, 600);
    background(face);
    size(800,600);
    

    }

    void draw(){
      fill(#FFFFFF);
      ellipse(330, 150, 75, 125);
  
  ellipse (415, 150, 80, 125);
  
      if(mouseX > 300 && mouseX < 364 && mouseY < 200 && mouseY > 100){
       
           fill(#050505);
           ellipse(mouseX, mouseY, 25, 25);
        ellipse(mouseX+100, mouseY, 25, 25);
      } System.out.println(mouseX);
       
        
          
  

    }
                         
