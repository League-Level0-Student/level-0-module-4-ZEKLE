PImage donkey;
PImage tail;

void setup(){
  size(600, 600);
  donkey = loadImage("images.jpeg");      //change the file name if you need to
tail = loadImage("download.jpg");      //change the file name if you need to
donkey.resize(width,height);
}

void draw(){
  println("X: " + mouseX + " Y: " + mouseY); 
  
  image(tail, mouseX-10, mouseY-20, 75, 75);
  rect(0,0, 30, 30);
  if (mouseX > 1 && mouseX < 30 && mouseY > 1 && mouseY < 30){
    background(donkey);
  } else {
    background(#FFFFFF);
}
  
}
