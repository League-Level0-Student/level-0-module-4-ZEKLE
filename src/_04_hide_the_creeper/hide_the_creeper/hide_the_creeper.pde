PImage minecraft;
PImage creeper;
int x = (int)random(width);
int y = (int)random(height);
int moveX = x;
int moveY = y;
void setup() {
  size(1000, 1000);
   minecraft = loadImage("minecraft.png");     
minecraft.resize(width, height);          //in setup method
creeper= loadImage("creeper.png");     //in setup method

x = (int)random(width);
 y = (int)random(height);
 moveX = x;
 moveY = y;
}

void draw() {
 background(minecraft);
image(creeper, moveX, moveY, 100, 100);    
if (mousePressed){
  fill(#F20000);
  ellipse(mouseX, mouseY, 10, 10);
  boolean nearX = isNear(mouseX, moveX);
  boolean nearY = isNear(mouseY, moveY);
  println(nearX);
  println(nearY);
  if(nearX == true && nearY == true){
    moveX = (int)random(width);
    moveY = (int)random(height);
  }
}
}
boolean isNear(int a, int b) {
if (abs(a - b) < 50)
     return true;
else
     return false;
}
